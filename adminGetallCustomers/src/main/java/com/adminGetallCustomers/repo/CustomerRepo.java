package com.adminGetallCustomers.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.adminGetallCustomers.pojo.Customer;



@Repository
public interface CustomerRepo extends MongoRepository<Customer, String> {

}
