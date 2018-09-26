/**
 * 
 * 
 */
package com.procurement_system_backend.backend.entity;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author windula
 *
 */

@Document(collection="PurchaseOrder")
public class PurchaseOrder {

	@Id
	private String OrderID;
	private String Sequential_Reference;
	private Map<Item, Integer> Items; //error in class diagram
	private String OrderStatus;
	private String Date;
	private boolean IsDraftPurchaseOrder;
	private boolean onHold;
	
	
	/**
	 * @param orderID
	 * @param sequential_Reference
	 * @param items
	 * @param orderStatus
	 * @param date
	 * @param isDraftPurchaseOrder
	 * @param onHold
	 */
	public PurchaseOrder(String orderID, String sequential_Reference, Map<Item, Integer> items, String orderStatus,
			String date, boolean isDraftPurchaseOrder, boolean onHold) {
		super();
		OrderID = orderID;
		Sequential_Reference = sequential_Reference;
		Items = items;
		OrderStatus = orderStatus;
		Date = date;
		IsDraftPurchaseOrder = isDraftPurchaseOrder;
		this.onHold = onHold;
	}
	
	public PurchaseOrder() {}

	/**
	 * @return the orderID
	 */
	public String getOrderID() {
		return OrderID;
	}

	/**
	 * @param orderID the orderID to set
	 */
	public void setOrderID(String orderID) {
		OrderID = orderID;
	}

	/**
	 * @return the sequential_Reference
	 */
	public String getSequential_Reference() {
		return Sequential_Reference;
	}

	/**
	 * @param sequential_Reference the sequential_Reference to set
	 */
	public void setSequential_Reference(String sequential_Reference) {
		Sequential_Reference = sequential_Reference;
	}

	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return OrderStatus;
	}

	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return Date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		Date = date;
	}

	/**
	 * @return the isDraftPurchaseOrder
	 */
	public boolean isIsDraftPurchaseOrder() {
		return IsDraftPurchaseOrder;
	}

	/**
	 * @param isDraftPurchaseOrder the isDraftPurchaseOrder to set
	 */
	public void setIsDraftPurchaseOrder(boolean isDraftPurchaseOrder) {
		IsDraftPurchaseOrder = isDraftPurchaseOrder;
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

	/**
	 * @return the items
	 */
	public Map<Item, Integer> getItems() {
		return Items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(HashMap<Item, Integer> items) {
		Items = items;
	}
	
	private void convertObjectToMap(Object object) {
		
		ObjectMapper objMap= new ObjectMapper();
		
		
	}
	
	
}
