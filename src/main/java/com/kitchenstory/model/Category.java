
package com.kitchenstory.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final Long id;
	
	private String name;
	
	@OneToMany(mappedBy="category")
	private List<Product> products = new ArrayList<Product>();

	protected Category() {
		id=null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(Product product) {
		this.products.add(product);
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("Category [id=%s, name=%s, products=%s]", id, name, products);
	}
	
	
	
	
}
