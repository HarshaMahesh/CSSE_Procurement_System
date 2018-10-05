/**
 * Sep 24, 2018
 * 
 */
package com.procurement_system_backend.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


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
		return response.getSequential_Reference();
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
			
			return updatedPO.getSequential_Reference();
		
		}
		else
			return "error";
	}

	/**
	 * @return
	 * 
	 */
	@Override
	public List<PurchaseOrder> getAllOrders() {
		
		List<PurchaseOrder> poList=this.MongoRepoPO.findAll();
		
		return poList;
	}

	/**
	 * @return
	 * 
	 */
	@Override
	public List<PurchaseOrder> getAllOrdersByApproval(String orderStatus) {
		
		
		//BasicQuery query=new BasicQuery("{orderStatus:{"+"Approved"+"}");
		
		List<PurchaseOrder> poList=this.MongoRepoPO.findAllByOrderStatus(orderStatus);
		
		return poList;
	}

	/**
	 * @param orderID
	 * @return
	 * 
	 */
	@Override
	public String deleteOrder(String orderID) {
		
		this.MongoRepoPO.delete(this.getOrderByID(orderID));
		return "Success";
	}

	/**
	 * @param orderID
	 * @return
	 * 
	 */
	@Override
	public String updateOrder(String orderID,PurchaseOrder po) {
		
		PurchaseOrder response=getOrderByID(orderID);
		
		if(response.getOrderID()!=null) {
			
			response.setDate(po.getDate());
			response.setDraftPurchaseOrder(po.isDraftPurchaseOrder());
			response.setItems(po.getItems());
			response.setOnHold(po.isOnHold());
			response.setSequential_Reference(po.getSequential_Reference());
			
			PurchaseOrder updated=this.MongoRepoPO.save(response);
			
			return updated.getSequential_Reference();
		}
		
		return "Failure";
	}



}
