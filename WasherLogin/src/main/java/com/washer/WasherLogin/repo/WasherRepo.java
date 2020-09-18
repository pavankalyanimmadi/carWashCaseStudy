package com.washer.WasherLogin.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.washer.WasherLogin.pojo.Washer;



public interface WasherRepo extends MongoRepository<Washer, String> {
	


}
