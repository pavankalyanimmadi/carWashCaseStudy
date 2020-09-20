package com.CustomerServedRequests.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.CustomerServedRequests.pojo.Customer;


@Repository
public interface CustomerRepo extends MongoRepository<Customer, String> {

}
