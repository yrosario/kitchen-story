package com.kitchenstory.repository;

import org.springframework.data.repository.CrudRepository;

import com.kitchenstory.model.Image;

public interface ImageReository extends CrudRepository<Image, Long> {

}
