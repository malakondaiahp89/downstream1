package com.emirates.airlines.service;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.stereotype.Service;
import com.emirates.airlines.model.Price;
import com.hazelcast.collection.IList;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

@Service
public class PricingService {
	
	 IList<Price> cachedPriceList;


	public PricingService() {
		super();
		Config cfg = new Config();
		HazelcastInstance instance = Hazelcast.newHazelcastInstance(cfg);
		
		cachedPriceList = instance.getList("pricelist");
		
    	Price p1=new Price(2000,"FN1001",LocalDate.parse("2022-01-07"),"HYD","UAE");
    	Price p2=new Price(3000,"FN1002",LocalDate.parse("2022-01-03"),"MUB","UAE");
    	Price p3=new Price(4000,"FN1003",LocalDate.parse("2022-01-04"),"BGLR","UAE");
    	Price p4=new Price(2500,"FN1004",LocalDate.parse("2022-01-07"),"HYD","UAE");
    	cachedPriceList.add(p1);
    	cachedPriceList.add(p2);
    	cachedPriceList.add(p3);
    	cachedPriceList.add(p4);
    	
	}

	
	public Price getPricingDetails(String flightNumber,LocalDate date) {

		Price price=this.cachedPriceList.stream().filter(item->item.getFlightNumber().equalsIgnoreCase(flightNumber) && item.getDate().compareTo(date)==0).findAny().orElse(null);
    	
    	return price;
	}

}
