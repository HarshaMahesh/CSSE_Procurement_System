/**
 * Sep 24, 2018
 * 
 */
package com.procurement_system_backend.backend.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.procurement_system_backend.backend.entity.PurchaseOrder;

/**
 * @author windula
 *
 */

@Repository
public interface IMongoPurchaseOrder extends MongoRepository<PurchaseOrder, String> {

}
