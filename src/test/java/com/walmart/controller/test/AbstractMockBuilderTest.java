package com.walmart.controller.test;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


public abstract class AbstractMockBuilderTest {
	
	 public MockMvc mockMvc;
	 
	 @Autowired
	 public WebApplicationContext webApplicationContext;
	 
	 @Before
	 public void setUp() {
		 this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
	  }

}
