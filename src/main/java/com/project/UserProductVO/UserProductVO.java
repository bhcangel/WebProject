package com.project.UserProductVO;

import com.project.product.VO.ProductVO;
import com.project.user.VO.UserVO;

public class UserProductVO {
	
	private ProductVO productVO;
	private UserVO userVO;
	
	
	
	public UserProductVO() {
		super();
	}
	public UserProductVO(ProductVO productVO, UserVO userVO) {
		super();
		this.productVO = productVO;
		this.userVO = userVO;
	}
	public ProductVO getProductVO() {
		return productVO;
	}
	public void setProductVO(ProductVO productVO) {
		this.productVO = productVO;
	}
	public UserVO getUserVO() {
		return userVO;
	}
	public void setUserVO(UserVO userVO) {
		this.userVO = userVO;
	}
	
	
	

}
