package com.sampath.api;





import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sampath.api.Payment;

@Repository
public interface PaymentRepositary extends MongoRepository<Payment, String>{

	
	Payment findByccnumber(String ccnumber);

	//boolean existByccnumber(String ccnumber);
	
	//Account findByname(String name);
}
