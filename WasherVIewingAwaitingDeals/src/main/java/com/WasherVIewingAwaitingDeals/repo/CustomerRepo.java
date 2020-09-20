package com.WasherVIewingAwaitingDeals.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.WasherVIewingAwaitingDeals.pojo.Customer;


@Repository
public interface CustomerRepo extends MongoRepository<Customer, String> {

}
