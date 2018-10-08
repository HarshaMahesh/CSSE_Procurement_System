package com.procurement_system_backend.backend.controller;
import com.procurement_system_backend.backend.entity.SiteManager;
import com.procurement_system_backend.backend.service.SiteManagerService;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/api/sitemanager")
public class SiteManagerController {
	
	@Autowired
	private SiteManagerService siteManagerService;
	
	private final static Logger logger=LoggerFactory.getLogger(SiteManager.class);
	
	@RequestMapping(value="/addSiteManager",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public String InsertSiteManager(@RequestBody SiteManager sitem) {
		
		logger.info("POST add site manager Request handling");
		
		
		
		String response=this.siteManagerService.create(sitem);
		
		return response;
	}
}





/*@RestController
@RequestMapping("/api/sitemanager")
public class SiteManagerController {
	private final static Logger logger=LoggerFactory.getLogger(SiteManager.class);
	@Autowired
	private SiteManagerService siteManagerService;
	
	@RequestMapping(value="/addSiteManager",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public String Createsitemanager(@RequestParam int employeeID,@RequestParam String employeeName,@RequestParam String siteName,@RequestParam String address,@RequestParam String email,@RequestParam String phone) {
		SiteManager sm = siteManagerService.create(employeeID,employeeName,siteName,address,email,phone);
		
		return sm.toString();
	}
}*/
