package com.WasherAcceptingDeals.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.WasherAcceptingDeals.pojo.Customer;


public interface CustomerRepo extends MongoRepository<Customer,String> {

}
