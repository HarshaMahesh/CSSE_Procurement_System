/**
 * Oct 3, 2018
 * 
 */
package com.procurement_system_backend.backend.service;

import java.util.List;

import com.procurement_system_backend.backend.entity.Item;
import com.procurement_system_backend.backend.entity.PurchaseOrder;

/**
 * @author windula
 *
 */
public interface IItemService {
	
	String AddItem(Item item);
	
	String updateItem(String itemID,Item updatingItem);
	
	Item getItemByID(String itemID);
	
	List<Item> getAllItem();

}
