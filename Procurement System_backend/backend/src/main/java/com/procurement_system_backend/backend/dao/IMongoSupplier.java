/**
 * Oct 5, 2018
 * 
 */
package com.procurement_system_backend.backend.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.procurement_system_backend.backend.entity.Supplier;

/**
 * @author windula
 *
 */
public interface IMongoSupplier extends MongoRepository<Supplier, String> {
	
	Supplier findBySupplierID(String supplierID);

}
