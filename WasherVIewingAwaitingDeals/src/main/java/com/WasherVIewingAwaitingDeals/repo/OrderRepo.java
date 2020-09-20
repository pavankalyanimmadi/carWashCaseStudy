package com.WasherVIewingAwaitingDeals.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.WasherVIewingAwaitingDeals.pojo.WashOrder;


@Repository
public interface OrderRepo extends MongoRepository<WashOrder, String> {

}
