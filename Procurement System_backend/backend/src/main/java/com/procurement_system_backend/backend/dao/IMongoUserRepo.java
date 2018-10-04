/**
 * Oct 7, 2018
 * 
 */
package com.procurement_system_backend.backend.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.procurement_system_backend.backend.entity.Users;

/**
 * @author windula
 *
 */
public interface IMongoUserRepo extends MongoRepository<Users, String> {
	
	

}
