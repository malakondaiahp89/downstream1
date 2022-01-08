package com.emirates.airlines.service;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.emirates.airlines.model.Price;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class PricingServiceTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	PricingService pricingService;
	
	@Test
	public void getPricingDetails() {
		
		Price price=pricingService.getPricingDetails("FN1001",LocalDate.parse("2022-01-07"));
		assertNotNull(price);
		assertTrue(price.getPrice()==2000);
	}

}
