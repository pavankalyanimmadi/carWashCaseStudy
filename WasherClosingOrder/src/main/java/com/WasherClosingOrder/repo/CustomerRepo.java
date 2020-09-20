package com.WasherClosingOrder.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.WasherClosingOrder.pojo.Customer;


public interface CustomerRepo extends MongoRepository<Customer,String> {

}
