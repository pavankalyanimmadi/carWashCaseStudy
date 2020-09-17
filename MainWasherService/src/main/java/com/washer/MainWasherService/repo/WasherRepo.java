package com.washer.MainWasherService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.washer.MainWasherService.pojo.Washer;




public interface WasherRepo extends MongoRepository<Washer, String> {
	


}
