package com.project.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String ProductRegist(ProductVO productVO, MultiContentVO multicontentVO, MultiQnAVO multiqnaVO) {
		
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
		
		
		
		model.addAttribute("productVO",productResultVO);
		model.addAttribute("contentImgList",contentImgList);
		model.addAttribute("contentTextList",contentTextList);
		model.addAttribute("qnaQList",qnaQList);
		model.addAttribute("qnaAList",qnaAList);
		
		return "/Product/CreatorBoardTestResult";
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
