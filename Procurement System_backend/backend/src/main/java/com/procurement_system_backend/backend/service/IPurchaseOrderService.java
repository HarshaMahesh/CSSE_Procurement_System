/**
 * Sep 24, 2018
 * 
 */
package com.procurement_system_backend.backend.service;

import com.procurement_system_backend.backend.entity.PurchaseOrder;

/**
 * @author windula
 *
 */
public interface IPurchaseOrderService {

	String CreateOrder(PurchaseOrder po);
	
	PurchaseOrder getOrderByID(String orderId);
	
	String setOrderApproval(String orderId,String approval);
}
