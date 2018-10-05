/**
 * Oct 3, 2018
 * 
 */
package com.procurement_system_backend.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.procurement_system_backend.backend.dao.IMongoItem;
import com.procurement_system_backend.backend.entity.Item;

/**
 * @author windula
 *
 */
@Service
public class ItemServiceImpl implements IItemService{
	
	@Autowired
	private IMongoItem MongoRepoItem;
	
	
	

	/**
	 * @param item
	 * @return
	 * 
	 */
	@Override
	public String AddItem(Item item) {
		
		Item response=this.MongoRepoItem.save(item);
		
		
		return response.getItemID();
	}




	/**
	 * @param itemID
	 * @param updatingItem
	 * @return
	 * 
	 */
	@Override
	public String updateItem(String itemID, Item updatingItem) {
		
		Item response=this.MongoRepoItem.findByItemID(itemID);
		
		if(response.getItemID()!=null) {
			
			response.setItemName(updatingItem.getItemName());
			response.setDelivaryInformation(updatingItem.getDelivaryInformation());
			response.setItemName(updatingItem.getItemName());
			response.setPrice(updatingItem.getPrice());
			response.setRestrictedItem(updatingItem.isRestrictedItem());
			
			Item updatedItem=this.MongoRepoItem.save(response);
			
			return updatedItem.getItemID();
			
		}
		return null;
	}




	/**
	 * @param itemID
	 * @return
	 * 
	 */
	@Override
	public Item getItemByID(String itemID) {
		
		Item response=this.MongoRepoItem.findByItemID(itemID);
		
		return response;
	}




	@Override
	public List<Item> getAllItem() {
		List<Item> response=this.MongoRepoItem.findAll();
		return response;
	}




	
	 

}
