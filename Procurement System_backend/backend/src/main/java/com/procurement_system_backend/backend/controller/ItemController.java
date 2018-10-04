/**
 * Oct 3, 2018
 * 
 */
package com.procurement_system_backend.backend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.procurement_system_backend.backend.entity.Item;
import com.procurement_system_backend.backend.entity.PurchaseOrder;
import com.procurement_system_backend.backend.service.ItemServiceImpl;

/**
 * @author windula
 *
 */

@CrossOrigin
@RestController
@RequestMapping("/api/item")
public class ItemController {
	
	@Autowired
	private ItemServiceImpl itemAddService;
	
	private final static Logger logger=LoggerFactory.getLogger(Item.class);
	
	@RequestMapping(value="/addItem",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public String InsertItem(@RequestBody Item item) {
		
		logger.info("POST add item Request handling");
		
		
		
		String response=this.itemAddService.AddItem(item);
		
		return response;
	}
	
	
	@RequestMapping(value="/getItem/{id}",method=RequestMethod.GET,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Item> getItemByID(@PathVariable String id) {
		
		logger.info("GET Request item by ID handling");
		
		
		Item response=this.itemAddService.getItemByID(id);
		
		return new ResponseEntity<Item>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value="/updateItem/{id}",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public String UpdateItem(@PathVariable String id,@RequestBody Item updatingItem) {
		
		logger.info("PUT update item Request handling");
		
		
		
		String response=this.itemAddService.updateItem(id, updatingItem);
		
		return response;
	}
	

}
