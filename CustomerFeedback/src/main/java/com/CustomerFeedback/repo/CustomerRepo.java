package com.CustomerFeedback.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.CustomerFeedback.pojo.Customer;


public interface CustomerRepo extends MongoRepository<Customer,String> {

}
