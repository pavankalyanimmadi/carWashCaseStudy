package com.payment.MainPaymentService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.payment.MainPaymentService.pojo.WashOrder;




@Repository
public interface WashOrderRepo extends MongoRepository<WashOrder, String> {

}
