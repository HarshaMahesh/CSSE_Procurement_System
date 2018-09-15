package com.procurement_system_backend.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.procurement_system_backend.backend.dao.IMongoLog;

import com.procurement_system_backend.backend.entity.Log;
import com.procurement_system_backend.backend.entity.PurchaseOrder;

@Service
public class LogServiceImpl implements ILogService {

	@Autowired 
	private IMongoLog mongorepolog;
	
	
	//Insert/create log
	@Override
	public String CreateLog(Log log)
	{
		Log response=this.mongorepolog.save(log);
		
		return response.getLogID();
	}
	
	
	@Override
	public List<Log> getAllLogs() {
		
		List<Log> logList=this.mongorepolog.findAll();
		
		return logList;
	}
	
	

//	@Override
//	public Log ViewLogbyID(String LogID) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
}
