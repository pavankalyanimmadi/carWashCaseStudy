package com.adminGetallWashers.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adminGetallWashers.pojo.Washer;



public interface WasherRepo extends MongoRepository<Washer, String> {
	


}
