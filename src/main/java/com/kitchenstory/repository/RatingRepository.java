package com.kitchenstory.repository;

import org.springframework.data.repository.CrudRepository;

import com.kitchenstory.model.Rating;

public interface RatingRepository extends CrudRepository<Rating, Long> {

}
