package com.procurement_system_backend.backend.dao;

import com.procurement_system_backend.backend.entity.SiteManager;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IMongoSiteManager extends MongoRepository<SiteManager,String>{
	
	//SiteManager findByItemID(String itemID);
}
