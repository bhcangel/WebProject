package com.project.product.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.product.VO.IntegratedContentVO;
import com.project.product.VO.MultiContentVO;
import com.project.product.VO.ProductVO;

@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSession sqlsession;
	
	public int ProductRegist(IntegratedContentVO integratedVO) {
		return sqlsession.insert("com.project.product.mapper.ProductRegist",integratedVO);
	}

}
