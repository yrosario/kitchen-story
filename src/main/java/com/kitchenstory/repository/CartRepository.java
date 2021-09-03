package com.kitchenstory.repository;

import org.springframework.data.repository.CrudRepository;

import com.kitchenstory.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Long> {

}
