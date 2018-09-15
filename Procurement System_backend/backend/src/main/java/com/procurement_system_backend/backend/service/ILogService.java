package com.procurement_system_backend.backend.service;

import java.util.List;

import com.procurement_system_backend.backend.entity.Log;


public interface ILogService {

	//Inserting/Creating Logs
	String CreateLog(Log log);
	
	//Get All Logs
	List<Log>getAllLogs();
	
//	Log ViewLogbyID(String LogID);
	
	
	
}
