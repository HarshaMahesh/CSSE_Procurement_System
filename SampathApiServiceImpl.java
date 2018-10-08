package com.sampath.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SampathApiServiceImpl implements SampathApiService {
	
	@Autowired
	private PaymentRepositary accountRepositary;
	@Autowired
	private InvoiceRepo invoiceRepo;
	
	
	/*@Autowired
	public SampathApiServiceImpl(PaymentRepositary accountRepositary) {
		
		this.accountRepositary = accountRepositary;
	}*/

	/*@Override
	public Response getAccountByCCNumber(Payment req) {
		
		Payment account=this.accountRepositary.findByccnumber(req.getAccountNO());
		
		return new Response(true,"Account Exists");
	}*/

	@Override
	public String doPayment(Payment req) {
		
		Invoice response=this.invoiceRepo.findByInvoiceID(req.getInvoiceID());
		
		if(response!=null) {
			double amount=response.getTotalAmount();
			
			req.setAmount(amount);
			
			this.accountRepositary.save(req);
			
			return "Payment Succees "+req.getPaymentID();
			
		}
		else {
			return  "Payment Unsuccess ";
		}
		
		
	}

}
