package com.sampath.api;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/sampath_api")
public class PaymentController {

	
	private SampathApiServiceImpl sampathService;
	
	private final static Logger logger=LoggerFactory.getLogger(PaymentController.class);

	@Autowired
	public PaymentController(SampathApiServiceImpl sampathService) {
		//super();
		this.sampathService = sampathService;
	}
	
	
	
	@RequestMapping(value="/payment",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> doPayment(@RequestBody Payment req) {
		
		logger.info("POST Request handling");
		//Request req=requestEntity.getBody();
		String res=this.sampathService.doPayment(req);
		
		
		return new ResponseEntity<String>(res, HttpStatus.OK);
		
		
	}
	
	
	
	

}
