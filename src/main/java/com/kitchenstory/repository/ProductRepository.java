package com.kitchenstory.repository;

import org.springframework.data.repository.CrudRepository;

import com.kitchenstory.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
