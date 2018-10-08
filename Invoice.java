/**
 * Oct 5, 2018
 * 
 */
package com.sampath.api;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author windula
 *
 */
@Document
public class Invoice {

	@Id
	private String _id;
	private String invoiceID;
	private String issueDate;
	private List<String> itemIDs;
	private double totalAmount;
	private String supplierID;
	
	
	
	/**
	 * @param invoiceID
	 * @param issueDate
	 * @param itemIDs
	 * @param totalAmount
	 * @param supplierID
	 */
	public Invoice(String invoiceID, String issueDate, List<String> itemIDs, double totalAmount, String supplierID) {
		super();
		this.invoiceID = invoiceID;
		this.issueDate = issueDate;
		this.itemIDs = itemIDs;
		this.totalAmount = totalAmount;
		this.supplierID = supplierID;
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
	 * @return the issueDate
	 */
	public String getIssueDate() {
		return issueDate;
	}
	/**
	 * @param issueDate the issueDate to set
	 */
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	/**
	 * @return the itemIDs
	 */
	public List<String> getItemIDs() {
		return itemIDs;
	}
	/**
	 * @param itemIDs the itemIDs to set
	 */
	public void setItemIDs(List<String> itemIDs) {
		this.itemIDs = itemIDs;
	}
	/**
	 * @return the totalAmount
	 */
	public double getTotalAmount() {
		return totalAmount;
	}
	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * @return the supplierID
	 */
	public String getSupplierID() {
		return supplierID;
	}
	/**
	 * @param supplierID the supplierID to set
	 */
	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}
	
	
	
}
