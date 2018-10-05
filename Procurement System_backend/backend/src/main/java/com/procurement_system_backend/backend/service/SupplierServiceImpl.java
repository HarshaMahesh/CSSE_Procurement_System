/**
 * Oct 5, 2018
 * 
 */
package com.procurement_system_backend.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.procurement_system_backend.backend.dao.IMongoSupplier;
import com.procurement_system_backend.backend.entity.Supplier;

/**
 * @author windula
 *
 */
public class SupplierServiceImpl implements ISupplierService {
	
	@Autowired
	private IMongoSupplier mongoRepoSupplier;

	/**
	 * @return
	 * 
	 */
	@Override
	public List<Supplier> getAllSuppliers() {
		
		List<Supplier> supplierList=this.mongoRepoSupplier.findAll();
		
		return supplierList;
		
		
	}

	/**
	 * @param supplierID
	 * @return
	 * 
	 */
	@Override
	public Supplier getSupplierByID(String supplierID) {
		
		Supplier response=this.mongoRepoSupplier.findBySupplierID(supplierID);
		
		return response;
		//return null;
	}
	
	
	

}
