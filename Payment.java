package com.sampath.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Payment")
public class Payment {

	@Id
	private String paymentID;
	private String invoiceID;
	private String accountNO;
	private double amount;
	
	/**
	 * @return the paymentID
	 */
	public String getPaymentID() {
		return paymentID;
	}
	/**
	 * @param paymentID the paymentID to set
	 */
	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}
	/**
	 * @return the invoiceID
	 */
	public String getInvoiceID() {
		return invoiceID;
	}
	/**
	 * @param invoiceID the invoiceID to set
	 */
	public void setInvoiceID(String invoiceID) {
		this.invoiceID = invoiceID;
	}
	/**
	 * @return the accountNO
	 */
	public String getAccountNO() {
		return accountNO;
	}
	/**
	 * @param accountNO the accountNO to set
	 */
	public void setAccountNO(String accountNO) {
		this.accountNO = accountNO;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	
	
	
	
}
