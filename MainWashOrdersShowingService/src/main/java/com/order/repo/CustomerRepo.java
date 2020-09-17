package com.order.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.order.pojo.Customer;



@Repository
public interface CustomerRepo extends MongoRepository<Customer, String> {

}
