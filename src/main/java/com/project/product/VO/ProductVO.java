package com.project.product.VO;

import java.util.ArrayList;

public class ProductVO {

	private int pno;
	private String title;
	private String mentor;
	private String category;
	private String intro;
	
	private ArrayList<ContentVO> contents;
	
	private ArrayList<QnAVO> QnA;
	
	
	public ProductVO(int pno, String title, String mentor, String category, String intro, ArrayList<ContentVO> contents,
			ArrayList<QnAVO> qnA) {
		super();
		this.pno = pno;
		this.title = title;
		this.mentor = mentor;
		this.category = category;
		this.intro = intro;
		this.contents = contents;
		this.QnA = qnA;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public ArrayList<ContentVO> getContents() {
		return contents;
	}
	public void setContents(ArrayList<ContentVO> contents) {
		this.contents = contents;
	}
	public ArrayList<QnAVO> getQnA() {
		return QnA;
	}
	public void setQnA(ArrayList<QnAVO> qnA) {
		QnA = qnA;
	}
	public ProductVO() {
		super();
	}
	
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMentor() {
		return mentor;
	}
	public void setMentor(String mentor) {
		this.mentor = mentor;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
}
