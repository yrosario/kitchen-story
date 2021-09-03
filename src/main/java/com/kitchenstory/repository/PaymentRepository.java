package com.kitchenstory.repository;

import org.springframework.data.repository.CrudRepository;

import com.kitchenstory.model.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long> {

}
