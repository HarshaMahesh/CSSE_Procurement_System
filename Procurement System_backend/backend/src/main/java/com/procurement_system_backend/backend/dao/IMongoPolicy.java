package com.procurement_system_backend.backend.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.procurement_system_backend.backend.entity.Policy;

public interface IMongoPolicy extends MongoRepository <Policy, String> {

}
