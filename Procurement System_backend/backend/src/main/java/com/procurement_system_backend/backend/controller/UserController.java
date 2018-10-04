package com.procurement_system_backend.backend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.procurement_system_backend.backend.entity.PurchaseOrder;
import com.procurement_system_backend.backend.entity.Users;
import com.procurement_system_backend.backend.service.UserServiceImpl;

/**
 * @author windula
 *
 */

@CrossOrigin
@RestController
@RequestMapping("/api/loginUser")
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	private final static Logger logger=LoggerFactory.getLogger(Users.class);


	@RequestMapping(value="/getUser/{id}",method=RequestMethod.GET)
	public ResponseEntity<Users> getUserByID(@PathVariable String id) {
		
		logger.info("GET Request login by ID handling");
		
		
		Users response=this.userService.loginUser(id);
		
		System.out.println(response);
		return new ResponseEntity<Users>(response, HttpStatus.OK);
	}
}
