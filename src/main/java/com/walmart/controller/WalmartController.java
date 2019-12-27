package com.walmart.controller;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.service.WalmartService;


@RestController
public class WalmartController {
	
	@Autowired
	private WalmartService walmartService;
	
	@GetMapping(value = "/sumar")
	public BigDecimal sumar(
			@RequestParam("numA") BigDecimal numA,
			@RequestParam("numB") BigDecimal numB,
			HttpServletRequest request) {

		return walmartService.sumar(numA, numB);
	}

}
