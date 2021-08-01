package com.kitchenstory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	@Override
	public String toString() {
		return String.format("Customer [id=%s, fName=%s, lName=%s]", id, fName, lName);
	}
	
	
}
