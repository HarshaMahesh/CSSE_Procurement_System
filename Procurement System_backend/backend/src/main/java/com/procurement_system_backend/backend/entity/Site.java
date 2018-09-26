/**
 * Sep 26, 2018
 * 
 */
package com.procurement_system_backend.backend.entity;

import java.util.HashMap;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author windula
 *
 */
@Document
public class Site {

	private int siteID;
	private String siteName;
	private String Address;
	private HashMap<Item, Integer> Items;
	private int storageCapacity;
	private int currentCapacity;
	/**
	 * @return the siteID
	 */
	public int getSiteID() {
		return siteID;
	}
	/**
	 * @param siteID the siteID to set
	 */
	public void setSiteID(int siteID) {
		this.siteID = siteID;
	}
	/**
	 * @return the siteName
	 */
	public String getSiteName() {
		return siteName;
	}
	/**
	 * @param siteName the siteName to set
	 */
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
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
	 * @return the storageCapacity
	 */
	public int getStorageCapacity() {
		return storageCapacity;
	}
	/**
	 * @param storageCapacity the storageCapacity to set
	 */
	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	/**
	 * @return the currentCapacity
	 */
	public int getCurrentCapacity() {
		return currentCapacity;
	}
	/**
	 * @param currentCapacity the currentCapacity to set
	 */
	public void setCurrentCapacity(int currentCapacity) {
		this.currentCapacity = currentCapacity;
	}
	
	
}
