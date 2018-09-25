package com.procurement_system_backend.backend.service;

import java.util.List;

import com.procurement_system_backend.backend.entity.Policy;

public interface IPolicyService {

	//Inserting/Creating Logs
		String CreatePolicy(Policy log);
		
		//Get All Logs
		List<Policy>getAllPolicy();
}
