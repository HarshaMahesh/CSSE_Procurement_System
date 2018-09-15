package com.procurement_system_backend.backend.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.procurement_system_backend.backend.entity.Log;

public interface IMongoLog extends MongoRepository<Log, String>{

	
	
}
