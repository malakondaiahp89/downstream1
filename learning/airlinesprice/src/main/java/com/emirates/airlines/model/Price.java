package com.emirates.airlines.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Price implements Serializable{

	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Price(Integer price, String flightNumber, LocalDate date, String depatureCode, String arrivalCode) {
		super();
		this.price = price;
		this.flightNumber = flightNumber;
		this.date = date;
		this.depatureCode = depatureCode;
		this.arrivalCode = arrivalCode;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getDepatureCode() {
		return depatureCode;
	}
	public void setDepatureCode(String depatureCode) {
		this.depatureCode = depatureCode;
	}
	public String getArrivalCode() {
		return arrivalCode;
	}
	public void setArrivalCode(String arrivalCode) {
		this.arrivalCode = arrivalCode;
	}
	Integer price;
	String flightNumber;
	LocalDate date;
	String depatureCode;
	String arrivalCode;
	
	
	
	
}
