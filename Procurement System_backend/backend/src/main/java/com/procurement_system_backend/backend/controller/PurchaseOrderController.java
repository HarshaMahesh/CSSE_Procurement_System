/**
 * Sep 24, 2018
 * 
 */
package com.procurement_system_backend.backend.controller;


import java.util.List;
import java.util.Map;



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

import com.procurement_system_backend.backend.entity.PurchaseOrder;
import com.procurement_system_backend.backend.service.PurchaseOrderServiceImpl;

/**
 * @author windula
 *
 */

@CrossOrigin
@RestController
@RequestMapping("/api/purchase_order")
public class PurchaseOrderController {
	
	
	private PurchaseOrderServiceImpl purchaseOrderService;
	
	private final static Logger logger=LoggerFactory.getLogger(PurchaseOrder.class);
	
	@Autowired
	public PurchaseOrderController(PurchaseOrderServiceImpl poService) {
		this.purchaseOrderService=poService;
	}

	
	@RequestMapping(value="/addOrder",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public String InsertPurchaseOrder(@RequestBody PurchaseOrder po) {
		
		logger.info("POST add order Request handling");
		
		
		String response=this.purchaseOrderService.CreateOrder(po);
		
		return response;
	}
	/*
	@RequestParam String orderID,@RequestParam String sequential_Reference,@RequestParam HashMap<String, Integer> Items,@RequestParam String orderStatus,
	@RequestParam String date,@RequestParam boolean isDraftPurchaseOrder,@RequestParam boolean onHold
	*/
	
	
	@RequestMapping(value="/getOrders/{id}",method=RequestMethod.GET,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PurchaseOrder> getPOByID(@PathVariable String id) {
		
		logger.info("GET Request order by ID handling");
		
		
		PurchaseOrder response=this.purchaseOrderService.getOrderByID(id);
		
		return new ResponseEntity<PurchaseOrder>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value="/orderApproval",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public String getPOByID(@RequestBody Map<String,String> payload) {
		
		logger.info("PUT Request order approval handling");
		
		
		String response=this.purchaseOrderService.setOrderApproval(payload.get("orderID"),payload.get("orderStatus"));
		
		return response;
	}
	
	@RequestMapping(value="/Orders",method=RequestMethod.GET,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<PurchaseOrder>> getAllPO() {
		
		logger.info("GET Request all orders handling");
		
		
		List<PurchaseOrder> response=this.purchaseOrderService.getAllOrders();
		
		return new ResponseEntity<List<PurchaseOrder>>(response, HttpStatus.OK);
	
	}
	
	@RequestMapping(value="/orderApproval/{id}",method=RequestMethod.GET,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<PurchaseOrder>> getPOByApproval(@PathVariable String id) {
		
		logger.info("GET Request order by Approval handling");
		
		
		List<PurchaseOrder> response=this.purchaseOrderService.getAllOrdersByApproval(id);
		
		return new ResponseEntity<List<PurchaseOrder>>(response, HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value="/updateOrder/{id}",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public String UpdateOrder(@PathVariable String id,@RequestBody PurchaseOrder updatingPO) {
		
		logger.info("PUT update PO Request handling");
		
		
		
		String response=this.UpdateOrder(id, updatingPO);
		
		return response;
	}
	
}
