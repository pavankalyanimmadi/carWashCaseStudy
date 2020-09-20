package com.CustomerOrderingWashService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.CustomerOrderingWashService.pojo.Customer;


public interface CustomerRepo extends MongoRepository<Customer,String> {

}
