package com.kitchenstory.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final Long id;
	
	@Column(name="first_name")
	private String fName;
	
	@Column(name="last_name")
	private String lName;

	@OneToMany(mappedBy="customer")
	private List<Cart> carts = new ArrayList<Cart>();
	
	
	protected Customer() {
		this.id = null;
	}
	
	protected Customer(String fName, String lName) {
		this();
		this.fName = fName;
		this.lName = lName;
	}



	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Long getId() {
		return id;
	}
	

	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(Cart cart) {
		this.carts.add(cart);
	}

	@Override
	public String toString() {
		return String.format("Customer [id=%s, fName=%s, lName=%s]", id, fName, lName);
	}
	
	
}
