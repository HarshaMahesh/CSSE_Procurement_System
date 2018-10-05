/**
 * Oct 5, 2018
 * 
 */
package com.procurement_system_backend.backend.service;
import java.util.List;

import com.procurement_system_backend.backend.entity.Supplier;
/**
 * @author windula
 *
 */
public interface ISupplierService {
	
	List<Supplier> getAllSuppliers();
	
	Supplier getSupplierByID(String supplierID);

}
