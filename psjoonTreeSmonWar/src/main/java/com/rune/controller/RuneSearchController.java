package com.rune.controller;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.apache.log4j.Logger;

public class RuneSearchController {
//	public List runeSearch() {
//		
//		
//		return null;
//	}
	
	protected static Logger logger = Logger.getLogger(RuneSearchController.class.getName());
	
	@Inject
	SqlSessionFactoryBean factoryBean;
	
	@Test
	public void test(){
		logger.info(""+factoryBean);
	}// test()
	
	@Test
	public void sesseionTest(){
		try {
			logger.info(""+factoryBean.getObject().openSession().toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// test()
}
