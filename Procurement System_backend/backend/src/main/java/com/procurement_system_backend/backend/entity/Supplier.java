/**
 * Sep 26, 2018
 * 
 */
package com.procurement_system_backend.backend.entity;

import java.util.HashMap;

/**
 * @author windula
 *
 */
public class Supplier {
	
	private int supplierID;
	private String supplierName;
	private int bankAccntNo;
	private String address;
	private String email;
	private String phone;
	private HashMap<Item, Integer> Items;
	private boolean available;
	/**
	 * @return the supplierID
	 */
	public int getSupplierID() {
		return supplierID;
	}
	/**
	 * @param supplierID the supplierID to set
	 */
	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}
	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}
	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	/**
	 * @return the bankAccntNo
	 */
	public int getBankAccntNo() {
		return bankAccntNo;
	}
	/**
	 * @param bankAccntNo the bankAccntNo to set
	 */
	public void setBankAccntNo(int bankAccntNo) {
		this.bankAccntNo = bankAccntNo;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the items
	 */
	public HashMap<Item, Integer> getItems() {
		return Items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(HashMap<Item, Integer> items) {
		Items = items;
	}
	/**
	 * @return the available
	 */
	public boolean isAvailable() {
		return available;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	

}
