/**
 * 
 * 
 */
package com.procurement_system_backend.backend.entity;

import java.util.HashMap;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author windula
 *
 */

@Document(collection="PurchaseOrder")
public class PurchaseOrder {

	@Id
	private String _id;
	private String orderID;
	private String sequential_Reference;
	private HashMap<String, Double> items; //error in class diagram
	private String orderStatus;
	private String date;
	private boolean isDraftPurchaseOrder;
	private boolean onHold;
	private String supplierID;
	private String invoiceID;
	
	
	/**
	 * @param orderID
	 * @param sequential_Reference
	 * @param items
	 * @param orderStatus
	 * @param date
	 * @param isDraftPurchaseOrder
	 * @param onHold
	 * @param supplierID
	 * @param invoiceID
	 */
	public PurchaseOrder(String orderID, String sequential_Reference, HashMap<String, Double> items, String orderStatus,
			String date, boolean isDraftPurchaseOrder, boolean onHold, String supplierID, String invoiceID) {
		super();
		this.orderID = orderID;
		this.sequential_Reference = sequential_Reference;
		this.items = items;
		this.orderStatus = orderStatus;
		this.date = date;
		this.isDraftPurchaseOrder = isDraftPurchaseOrder;
		this.onHold = onHold;
		this.supplierID = supplierID;
		this.invoiceID = invoiceID;
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
	 * @return the orderID
	 */
	public String getOrderID() {
		return orderID;
	}
	/**
	 * @param orderID the orderID to set
	 */
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	/**
	 * @return the sequential_Reference
	 */
	public String getSequential_Reference() {
		return sequential_Reference;
	}
	/**
	 * @param sequential_Reference the sequential_Reference to set
	 */
	public void setSequential_Reference(String sequential_Reference) {
		this.sequential_Reference = sequential_Reference;
	}
	/**
	 * @return the items
	 */
	public HashMap<String, Double> getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(HashMap<String, Double> items) {
		this.items = items;
	}
	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}
	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the isDraftPurchaseOrder
	 */
	public boolean isDraftPurchaseOrder() {
		return isDraftPurchaseOrder;
	}
	/**
	 * @param isDraftPurchaseOrder the isDraftPurchaseOrder to set
	 */
	public void setDraftPurchaseOrder(boolean isDraftPurchaseOrder) {
		this.isDraftPurchaseOrder = isDraftPurchaseOrder;
	}
	/**
	 * @return the onHold
	 */
	public boolean isOnHold() {
		return onHold;
	}
	/**
	 * @param onHold the onHold to set
	 */
	public void setOnHold(boolean onHold) {
		this.onHold = onHold;
	}
	
	
	
	
	
}
