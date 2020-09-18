package com.washer.WasherSignup.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.washer.WasherSignup.pojo.Washer;



public interface WasherRepo extends MongoRepository<Washer, String> {
	


}
