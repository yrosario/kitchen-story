package com.kitchenstory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rating")
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final Long id;
	
	private Integer score;
	
	private String comment;
	
	@ManyToOne
	private Product product;

	protected Rating() {
		id = null;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("Rating [id=%s, score=%s, comment=%s, product=%s]", id, score, comment, product);
	}
	
	
	
}
