/**
 * Sep 24, 2018
 * 
 */
package com.procurement_system_backend.backend.entity;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author windula
 *
 */
@Document(collection="Item")
public class Item {

	@Id
	private String _id;
	private String itemID;
	private String itemName;
	private String categoryID;
	private float price;
	private String delivaryInformation;
	private boolean isRestrictedItem;
	private String unit;
	
	
	
	
	
	/**
	 * @param itemID
	 * @param itemName
	 * @param categoryID
	 * @param price
	 * @param delivaryInformation
	 * @param isRestrictedItem
	 * @param unit
	 */
	public Item(String itemID, String itemName, String categoryID, float price, String delivaryInformation,
			boolean isRestrictedItem, String unit) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.categoryID = categoryID;
		this.price = price;
		this.delivaryInformation = delivaryInformation;
		this.isRestrictedItem = isRestrictedItem;
		this.unit = unit;
	}
	
	
	/**
	 * @return the itemID
	 */
	public String getItemID() {
		return itemID;
	}
	/**
	 * @param itemID the itemID to set
	 */
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the categoryID
	 */
	public String getCategoryID() {
		return categoryID;
	}
	/**
	 * @param categoryID the categoryID to set
	 */
	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	/**
	 * @return the delivaryInformation
	 */
	public String getDelivaryInformation() {
		return delivaryInformation;
	}
	/**
	 * @param delivaryInformation the delivaryInformation to set
	 */
	public void setDelivaryInformation(String delivaryInformation) {
		this.delivaryInformation = delivaryInformation;
	}
	/**
	 * @return the isRestrictedItem
	 */
	public boolean isRestrictedItem() {
		return isRestrictedItem;
	}
	/**
	 * @param isRestrictedItem the isRestrictedItem to set
	 */
	public void setRestrictedItem(boolean isRestrictedItem) {
		this.isRestrictedItem = isRestrictedItem;
	}
	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	

	
	
}
