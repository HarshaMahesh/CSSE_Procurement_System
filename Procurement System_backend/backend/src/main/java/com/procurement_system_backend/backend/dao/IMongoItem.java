/**
 * Oct 3, 2018
 * 
 */
package com.procurement_system_backend.backend.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.procurement_system_backend.backend.entity.Item;


/**
 * @author windula
 *
 */
public interface IMongoItem extends MongoRepository<Item, String> {
	
	Item findByItemID(String itemID);

}
