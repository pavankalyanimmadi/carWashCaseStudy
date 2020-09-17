package com.payment.MainPaymentService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.payment.MainPaymentService.pojo.Payment;


@Repository
public interface PaymentsRepo extends MongoRepository<Payment, String> {

}
