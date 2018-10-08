package com.sampath.api;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Request implements Serializable{

	private String ccnumber;
	private String cvcnumber;
	private double amount;
	
	public Request() {
		//super();
	}
	
	public Request(String ccnumber){
		//super();
		this.ccnumber = ccnumber;
	}
	public Request(String ccnumber, String cvcnumber, double amount) {
		//super();
		this.ccnumber = ccnumber;
		this.cvcnumber = cvcnumber;
		this.amount = amount;
	}
	public String getCcNumber() {
		return ccnumber;
	}
	public String getCvc() {
		return cvcnumber;
	}
	public double getAmount() {
		return amount;
	}

	public String getCcnumber() {
		return ccnumber;
	}

	public void setCcnumber(String ccnumber) {
		this.ccnumber = ccnumber;
	}

	public String getCvcnumber() {
		return cvcnumber;
	}

	public void setCvcnumber(String cvcnumber) {
		this.cvcnumber = cvcnumber;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
