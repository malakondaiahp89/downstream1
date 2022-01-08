package com.emirates.airlines.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
class PriceControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void getPrice() throws Exception {
	

	MvcResult mvcResult=mockMvc.perform(get("/emirates/price?flight_number=FN1001&date=2022-01-07")
	    	      .contentType(MediaType.APPLICATION_JSON)
	    	      .accept(MediaType.APPLICATION_JSON)).andReturn();
	   int status = mvcResult.getResponse().getStatus();
	   assertEquals(200, status);
	    	  
	}


}
