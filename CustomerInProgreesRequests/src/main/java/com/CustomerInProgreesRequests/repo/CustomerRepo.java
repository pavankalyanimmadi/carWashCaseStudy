package com.CustomerInProgreesRequests.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.CustomerInProgreesRequests.pojo.Customer;



@Repository
public interface CustomerRepo extends MongoRepository<Customer, String> {

}
