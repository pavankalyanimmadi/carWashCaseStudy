package com.WasherVIewingAwaitingDeals.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.WasherVIewingAwaitingDeals.pojo.Washer;


@Repository
public interface WasherRepo extends MongoRepository<Washer, String> {

}
