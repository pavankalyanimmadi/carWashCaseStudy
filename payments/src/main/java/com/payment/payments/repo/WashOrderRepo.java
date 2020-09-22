package com.payment.payments.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.payment.payments.pojo.WashOrder;



@Repository
public interface WashOrderRepo extends MongoRepository<WashOrder, String> {

}
