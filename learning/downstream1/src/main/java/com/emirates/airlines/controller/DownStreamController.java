package com.emirates.airlines.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emirates.airlines.model.Flight;
import com.emirates.airlines.model.FlightSearchCriteria;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/emirates")
public class DownStreamController {
    
    @GetMapping( path = "/downstream1" , produces = {MediaType.APPLICATION_JSON_VALUE})
    private Flux<Flight> getFlightInfofromDownstream1() throws JsonMappingException, JsonProcessingException, InterruptedException {
    	
    	Random random = new Random();   
    	Thread.sleep(random.nextInt(800));

        return Flux.fromIterable(new ArrayList<Flight>());
    }
    

}
