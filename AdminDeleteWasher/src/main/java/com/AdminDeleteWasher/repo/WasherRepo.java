package com.AdminDeleteWasher.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.AdminDeleteWasher.pojo.Washer;



public interface WasherRepo extends MongoRepository<Washer, String> {
	


}
