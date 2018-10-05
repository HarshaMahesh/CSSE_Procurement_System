/**
 * Sep 24, 2018
 * 
 */
package com.procurement_system_backend.backend.service;

import java.util.List;

import com.procurement_system_backend.backend.entity.PurchaseOrder;

/**
 * @author windula
 *
 */
public interface IPurchaseOrderService {

	String CreateOrder(PurchaseOrder po);
	
	PurchaseOrder getOrderByID(String orderId);
	
	String setOrderApproval(String orderId,String approval);
	
	List<PurchaseOrder> getAllOrders();
	
	List<PurchaseOrder> getAllOrdersByApproval(String orderStatus);
	
	String deleteOrder(String orderID);
	
	String updateOrder(String orderID,PurchaseOrder po);
}
