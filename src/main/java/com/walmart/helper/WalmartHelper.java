package com.walmart.helper;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class WalmartHelper {
	
	public BigDecimal sumar(BigDecimal numA, BigDecimal numB) {
		
		return numA.add(numB);
	}

}
