package com.emirates.airlines.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emirates.airlines.model.Price;
import com.emirates.airlines.service.PricingService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/emirates")
public class PriceController {
		
	@Autowired
	PricingService pricingEngine;

    
    @GetMapping("/price")
    private Mono<Price> getPrice(@RequestParam("date") String date, @RequestParam("flight_number") String flightNumber) {	
    	Price price=pricingEngine.getPricingDetails(flightNumber,LocalDate.parse(date));
        return Mono.just(price);
    }
    
    

}
