package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

	@Id
	private int product_id;
	private String name;
	private String description;
	private int cost;
	private double weight;

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", name=" + name + ", description=" + description + ", cost="
				+ cost + ", weight=" + weight + "]";
	}

	public Product(int product_id, String name, String description, int cost, double weight) {
		super();
		this.product_id = product_id;
		this.name = name;
		this.description = description;
		this.cost = cost;
		this.weight = weight;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
