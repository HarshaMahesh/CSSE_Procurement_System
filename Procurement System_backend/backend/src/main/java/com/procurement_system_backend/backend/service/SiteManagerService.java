package com.procurement_system_backend.backend.service;

import org.springframework.stereotype.Service;

import com.procurement_system_backend.backend.dao.IMongoSiteManager;

import com.procurement_system_backend.backend.entity.SiteManager;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class SiteManagerService implements ISiteManagerService{
	@Autowired
	private IMongoSiteManager MongoSiteManager;
	
	@Override
	public String create(SiteManager sm) {
		
		SiteManager response=this.MongoSiteManager.save(sm);
		
		
		return response.getEmployeeID();
	}
	
	
}
