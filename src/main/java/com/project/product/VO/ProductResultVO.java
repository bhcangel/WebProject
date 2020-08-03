package com.project.product.VO;

import java.util.ArrayList;

public class ProductResultVO {

	private int pno;
	private String title;
	private String mentor;
	private String category;
	private String intro;
	
	private String contents;
	private String QnA;
	
	
	
	
	
	
	public ProductResultVO() {
		super();
	}
	public ProductResultVO(int pno, String title, String mentor, String category, String intro, String contents,
			String qnA) {
		super();
		this.pno = pno;
		this.title = title;
		this.mentor = mentor;
		this.category = category;
		this.intro = intro;
		this.contents = contents;
		QnA = qnA;
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
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getQnA() {
		return QnA;
	}
	public void setQnA(String qnA) {
		QnA = qnA;
	}
	
	
	
	
}
