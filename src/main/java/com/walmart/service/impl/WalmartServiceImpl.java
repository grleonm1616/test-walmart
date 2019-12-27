package com.walmart.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmart.helper.WalmartHelper;
import com.walmart.service.WalmartService;

@Service("walmartService")
public class WalmartServiceImpl implements WalmartService{
	
	@Autowired
	private WalmartHelper walmartHelper;

	public BigDecimal sumar(BigDecimal numA, BigDecimal numB) {
	
		return walmartHelper.sumar(numA, numB);
	}

}
