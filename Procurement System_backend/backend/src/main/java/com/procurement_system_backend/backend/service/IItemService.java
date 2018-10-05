/**
 * Oct 3, 2018
 * 
 */
package com.procurement_system_backend.backend.service;

import com.procurement_system_backend.backend.entity.Item;

/**
 * @author windula
 *
 */
public interface IItemService {
	
	String AddItem(Item item);
	
	String updateItem(String itemID,Item updatingItem);
	
	Item getItemByID(String itemID);

}
