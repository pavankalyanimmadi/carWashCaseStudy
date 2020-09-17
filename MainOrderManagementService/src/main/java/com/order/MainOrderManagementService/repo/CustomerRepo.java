package com.order.MainOrderManagementService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.order.MainOrderManagementService.pojo.Customer;



public interface CustomerRepo extends MongoRepository<Customer,String> {

}
