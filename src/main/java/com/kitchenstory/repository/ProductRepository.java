package com.kitchenstory.repository;

import org.springframework.data.repository.CrudRepository;

import com.kitchenstory.model.Customer;

public interface ProductRepository extends CrudRepository<Customer, Long> {

}
