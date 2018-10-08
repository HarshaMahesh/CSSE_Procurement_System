/**
 * Oct 5, 2018
 * 
 */
package com.sampath.api;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author windula
 *
 */
public interface InvoiceRepo extends MongoRepository<Invoice, String> {
	
	Invoice findByInvoiceID(String invoiceID);

}
