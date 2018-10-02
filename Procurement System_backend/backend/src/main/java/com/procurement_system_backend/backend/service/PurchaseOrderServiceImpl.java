/**
 * Sep 24, 2018
 * 
 */
package com.procurement_system_backend.backend.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.procurement_system_backend.backend.dao.IMongoPurchaseOrder;
import com.procurement_system_backend.backend.entity.PurchaseOrder;

/**
 * @author windula
 *
 */
@Service
public class PurchaseOrderServiceImpl implements IPurchaseOrderService {

	
	
	//@Qualifier("mongoData")
	private IMongoPurchaseOrder MongoRepoPO;
	
	
	@Autowired
	public PurchaseOrderServiceImpl(IMongoPurchaseOrder IMongoRepoPO) {
		this.MongoRepoPO=IMongoRepoPO;
			
	}

	/**
	 * @param po
	 * @return
	 * 
	 */
	@Override
	public String CreateOrder(PurchaseOrder po) {
		
		PurchaseOrder response=this.MongoRepoPO.save(po);
		return response.getOrderID();
	}

	/**
	 * @param orderId
	 * @return
	 * 
	 */
	@Override
	public PurchaseOrder getOrderByID(String orderId) {
		PurchaseOrder response=this.MongoRepoPO.findByOrderID(orderId);
		
		return response;
	}

	/**
	 * @param orderId
	 * @return
	 * 
	 */
	@Override
	public String setOrderApproval(String orderId,String approval) {
		
		PurchaseOrder response=this.MongoRepoPO.findByOrderID(orderId);
		
		
		if(response.getOrderID()!=null) {
			response.setOrderStatus(approval);
	
			
			PurchaseOrder updatedPO=this.MongoRepoPO.save(response);
			
			return updatedPO.getOrderID();
		
		}
		else
			return "error";
	}



}
