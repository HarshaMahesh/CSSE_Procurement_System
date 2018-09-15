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

import com.procurement_system_backend.backend.entity.Item;
import com.procurement_system_backend.backend.entity.Log;
import com.procurement_system_backend.backend.entity.PurchaseOrder;
import com.procurement_system_backend.backend.service.LogServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/api/log")
public class LogController {

	@Autowired
	private LogServiceImpl logService;
	
	private final static Logger logger=LoggerFactory.getLogger(Log.class);
	
	@RequestMapping(value="/addLog",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public String InsertLog(@RequestBody Log log) {
		
		logger.info("POST Create Log in Request handling");
		
		
		String response=this.logService.CreateLog(log);
		
		return response;
	}
	
	//Get All Logs
	@RequestMapping(value="/",method=RequestMethod.GET,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Log>> getAllLogs() {
		
		logger.info("GET all the Log Details");
		
		
		List<Log> response=this.logService.getAllLogs();
		
		return new ResponseEntity<List<Log>>(response, HttpStatus.OK);
	
	}
	
}
