package com.procurement_system_backend.backend.controller;

import java.util.List;

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

import com.procurement_system_backend.backend.entity.Log;
import com.procurement_system_backend.backend.entity.Policy;
import com.procurement_system_backend.backend.service.LogServiceImpl;
import com.procurement_system_backend.backend.service.PolicyServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/api/policy")
public class PolicyController {

	@Autowired
	private PolicyServiceImpl policyService;
	
	private final static Logger logger=LoggerFactory.getLogger(Log.class);
	
	@RequestMapping(value="/addPolicy",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public String InsertPolicy(@RequestBody Policy policy) {
		
		logger.info("POST Create Policy in Request handling");
		
		
		String response=this.policyService.CreatePolicy(policy);
		
		return response;
	}
	
	
	@RequestMapping(value="/",method=RequestMethod.GET,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Policy>> getAllPolicy() {
		
		logger.info("GET all the Log Details");
		
		
		List<Policy> response=this.policyService.getAllPolicy();
		
		return new ResponseEntity<List<Policy>>(response, HttpStatus.OK);
	
	}
	
}
