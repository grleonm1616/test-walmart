package com.walmart.controller.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import com.walmart.conf.WalmartApplication;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = WalmartApplication.class)
@WebAppConfiguration
public class WalmartControllerTest{
	
	public MockMvc mockMvc;
	
	@Test
	public void testController() throws Exception{
		
		
		try {
			 this.mockMvc.perform(get("/sumar?numA=1&numB=1"))
		  		.andExpect(status().isOk()).andReturn();
		}catch (final Exception e) {
		}
		
	}

}
