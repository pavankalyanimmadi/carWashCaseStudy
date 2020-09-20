package com.CustomerInProgreesRequests.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.CustomerInProgreesRequests.pojo.Washer;



@Repository
public interface WasherRepo extends MongoRepository<Washer, String> {

}
