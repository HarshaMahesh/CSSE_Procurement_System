/**
 * Sep 24, 2018
 * 
 */
package com.procurement_system_backend.backend.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
		
		this.MongoRepoPO.save(po);
		return "Success";
	}



}
