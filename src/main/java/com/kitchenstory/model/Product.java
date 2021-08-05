package com.kitchenstory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final Long id;
	
	private String name;
	private String category;
	private Integer quantity;
	private Float cost;
	
	protected Product() {
		this.id = null;
	}
	
	

	protected Product(String name, String category, Integer quantity) {
		this();
		this.name = name;
		this.category = category;
		this.quantity = quantity;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}


	public Float getCost() {
		return cost;
	}


	public void setCost(Float cost) {
		this.cost = cost;
	}


	@Override
	public String toString() {
		return String.format("Product [id=%s, name=%s, category=%s, quantity=%s, cost=%s]", id, name, category,
				quantity, cost);
	}
	
	

}
