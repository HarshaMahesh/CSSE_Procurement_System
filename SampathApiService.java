package com.sampath.api;

import org.springframework.http.ResponseEntity;

public interface SampathApiService {
	
	//Response getAccountByCCNumber(Payment req);
	
	String doPayment(Payment req);
	
	

}
