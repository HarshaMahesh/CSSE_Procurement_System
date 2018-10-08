/**
 * Oct 5, 2018
 * 
 */
package com.sampath.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author windula
 *
 */
@CrossOrigin
@RestController
@RequestMapping("api/invoice")
public class InvoiceController {
	
	@Autowired
	private InvoiceRepo invoiceRepo;
	
	@RequestMapping(value="/add",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addInvoice(@RequestBody Invoice req) {
		
		Invoice response=this.invoiceRepo.save(req);
		
		 
		return new ResponseEntity<String>(response.getInvoiceID(),HttpStatus.OK);
	}
	

}
