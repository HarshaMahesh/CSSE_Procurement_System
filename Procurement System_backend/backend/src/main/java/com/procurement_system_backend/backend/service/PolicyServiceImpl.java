package com.procurement_system_backend.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.procurement_system_backend.backend.dao.IMongoLog;
import com.procurement_system_backend.backend.dao.IMongoPolicy;
import com.procurement_system_backend.backend.entity.Log;
import com.procurement_system_backend.backend.entity.Policy;

@Service
public class PolicyServiceImpl implements IPolicyService{

	@Autowired 
	private IMongoPolicy mongorepopolicy;

	@Override
	public String CreatePolicy(Policy policy) {
		
		Policy response = this.mongorepopolicy.save(policy);
		
		return response.getPolicyID();
	}

	@Override
	public List<Policy> getAllPolicy() {
		
		List<Policy> policyList=this.mongorepopolicy.findAll();
		
		return policyList;
	}
}
