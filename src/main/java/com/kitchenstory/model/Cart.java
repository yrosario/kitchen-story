package com.kitchenstory.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final Long id;
	
	@ManyToOne
	private Customer customer;
	
	@OneToMany(mappedBy="cart")
	private List<Product> products = new ArrayList<Product>();
	
	@Column(name="purchased_date")
	private Date purchased_date;

	protected Cart() {
		id = null;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Long getId() {
		return id;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(Product product) {
		this.products.add(product);
		
	
	}

	public Date getPurchased_date() {
		return purchased_date;
	}


	public void setPurchased_date(Date purchased_date) {
		this.purchased_date = purchased_date;
	}
	
	
	
	
}
