package com.project.controller;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.project.product.VO.EnrollVO;
import com.project.product.VO.IntegratedContentVO;
import com.project.product.VO.MultiContentVO;
import com.project.product.VO.MultiQnAVO;
import com.project.product.VO.ProductResultVO;
import com.project.product.VO.ProductVO;
import com.project.product.VO.QnAVO;
import com.project.product.service.ProductService;

@Controller
@RequestMapping("/Product")
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping("product")
	public String Product() {
		return "/Product/product";
	}

	@RequestMapping("creatorBoard")
	public String creatorBoard() {
		return "/Product/creatorBoard";
	}

	@RequestMapping("ProductRegist")
	public String ProductRegist(ProductVO productVO, MultiContentVO multicontentVO, MultiQnAVO multiqnaVO,
			@RequestParam("ContentImg") List<MultipartFile> list 
			) {

		String uploadFolder = "D:\\course\\spring\\upload"; //업로드경로
		System.out.println("멀티파트 리스트 사이즈 : " + list.size());
		System.out.println("멀티컨텐트VO 리스트 사이즈 : " + multicontentVO.getContentList().size());

		try {

			for(int i = 0; i < list.size(); i++) {

				String fileRealName = list.get(i).getOriginalFilename(); //파일실제이름
				//long size = list.get(i).getSize();
				String fileExtension = fileRealName.substring( fileRealName.lastIndexOf(".") , fileRealName.length() );


				System.out.println("실제파일명:" + fileRealName);
				//System.out.println("파일크기:" + size);
				System.out.println("확장자:" + fileExtension);

				File saveFile = new File(uploadFolder + "\\" + fileRealName);
				list.get(i).transferTo(saveFile); //실제 파일을 저장


				multicontentVO.getContentList().get(i).setContentImgBox(uploadFolder + "\\" + fileRealName);
			}

		} catch (Exception e) {
			System.out.println("fileupload error" + e.getMessage());
		}



		System.out.println(productVO + "||" + multicontentVO +"||" + multiqnaVO);
		for(int i = 0; i < multiqnaVO.getQnAList().size(); i++) {
			System.out.println(multiqnaVO.getQnAList().get(i));
		}
		IntegratedContentVO integratedVO = new IntegratedContentVO(productVO, multicontentVO, multiqnaVO);



		try {
			System.out.println(multiqnaVO.getQnAList().get(0).getQBox());
			System.out.println(multiqnaVO.getQnAList().get(0).getABox());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}


		int result = productService.ProductRegist(integratedVO);
		System.out.println("productService.ProductRegist result : " + result);
		System.out.println("integratedVO.getMultiqnaVO().getQnAListStr() : " + integratedVO.getMultiqnaVO().getQnAListStr());
		/*
		 * System.out.println("productVO.getContents() : " + productVO.getContents());
		 * productService.insertProduct(productVO); System.out.println("productVO : " +
		 * productVO);
		 * productService.insertProductContent(multicontentVO.getContentList());
		 * 
		 */

		return "/Product/creatorBoard";
	}

	@RequestMapping("CreatorBoardTestResult")
	public String CreatorBoardTestResult(HttpServletRequest request, Model model) {


		int pno = Integer.parseInt(request.getParameter("product"));

		ProductResultVO productResultVO = productService.getProductInfo(pno);




		String contentStr = productResultVO.getContents();
		String[] contentList = contentStr.split("&&bhc&&");

		ArrayList<String> contentImgList = new ArrayList<String>();
		ArrayList<String> contentTextList = new ArrayList<String>();
		for(int i = 0; i < contentList.length-1; i++) {
			contentImgList.add(contentList[i]);
			i++;
			contentTextList.add(contentList[i]);
		}


		String QnAStr = productResultVO.getQnA();
		String[] QnAList = QnAStr.split("&&bhc_qna&&");

		ArrayList<String> qnaQList = new ArrayList<String>();
		ArrayList<String> qnaAList = new ArrayList<String>();
		for(int i = 0; i < QnAList.length-1; i++) {
			qnaQList.add(QnAList[i]);
			i++;
			qnaAList.add(QnAList[i]);
		}
		
		
		System.out.println(contentImgList.toString());
		System.out.println(contentTextList.toString());

		
		
		
		ArrayList<byte[]> ImgList = new ArrayList<byte[]>();
		byte[] result = null;
		try {
			for(int i = 0; i < contentImgList.size(); i++) {
				File file = new File(contentImgList.get(i));
				result = FileCopyUtils.copyToByteArray(file);
				ImgList.add(result);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

		
		
		model.addAttribute("productVO",productResultVO);
		model.addAttribute("contentImgList",contentImgList);
		model.addAttribute("contentTextList",contentTextList);
		model.addAttribute("qnaQList",qnaQList);
		model.addAttribute("qnaAList",qnaAList);
		//model.addAttribute("ImgList",ImgList);
		request.setAttribute("ImgList",ImgList);

		return "/Product/CreatorBoardTestResult";
	}
	
	
	@RequestMapping("display")
	public ResponseEntity<byte[]> display(@RequestParam("fileName") String fileName) {
	
		//파일을 읽을 경로
		String uploadPath = "D:\\course\\spring\\upload\\" + fileName;
		File file = new File(uploadPath);

		//ResponseEntity는 서버에서 응답에대한 내용, 메세지, 정보를 보내줄때 사용합니다.
		//생성자(보낼데이터, 헤더에 응답정보, 응답상태)
		ResponseEntity<byte[]> result = null;
		try {
			HttpHeaders header = new HttpHeaders();
			header.add("Content-Type", Files.probeContentType( file.toPath() )); //컨텐트 타입-파일MIME타입
			
			result = new ResponseEntity<>(FileCopyUtils.copyToByteArray(file), header, HttpStatus.OK );
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
	}


	//강의 등록							//권한 필터 필요
	@RequestMapping("enrollProduct")	//중간 절차없이 신청누르면 바로 신청됨 (추후 수정 필요)
	public String enrollProduct(HttpServletRequest request) {

		String email="";

		HttpSession session = request.getSession();
		if(session.getAttribute("email")==null || session.getAttribute("k_email")!=null) {
			email = (String)session.getAttribute("k_email");

		} else if (session.getAttribute("email")!=null || session.getAttribute("k_email")==null) {
			email = (String)session.getAttribute("email");

		} else if (session.getAttribute("email")==null || session.getAttribute("k_email")==null) {
			System.out.println("권한 체크나 해라");
			return "/";
		}

		int pno = Integer.valueOf(request.getParameter("pno"));
		EnrollVO enrollVO = new EnrollVO(pno, email);
		int result = productService.EnrollProduct(enrollVO);
		System.out.println("enrollProduct result: " + result);
		return "/Product/CreatorBoardTestResult?product=" + pno;
	}



}
