/**
 
 * 
 */
package com.procurement_system_backend.backend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.procurement_system_backend.backend.entity.PurchaseOrder;
import com.procurement_system_backend.backend.service.PurchaseOrderServiceImpl;

/**
 * @author windula
 *
 */

@CrossOrigin
@RestController
@RequestMapping("/order")
public class PurchaseOrderController {
	
	
	private PurchaseOrderServiceImpl purchaseOrderService;
	
	private final static Logger logger=LoggerFactory.getLogger(PurchaseOrder.class);
	
	@Autowired
	public PurchaseOrderController(PurchaseOrderServiceImpl poService) {
		this.purchaseOrderService=poService;
	}

	@RequestMapping(method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public String InsertPurchaseOrder(@RequestBody PurchaseOrder po) {
		
		logger.info("POST Request handling");
		
		String response=this.purchaseOrderService.CreateOrder(po);
		
		return response;
	}
	
	
	
}
