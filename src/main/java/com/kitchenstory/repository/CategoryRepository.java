package com.kitchenstory.repository;

import org.springframework.data.repository.CrudRepository;

import com.kitchenstory.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
