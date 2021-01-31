package com.capstone.capstone.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
	private UUID product_id;
	private String prod_name;
	private String image_url;
	private String prod_category;
	private String prod_condition;
	private Double prod_price;
	private String prod_manufacturer;
	private String prod_genre;
	
	public Product(String name) {
		this.prod_name=name;
		this.image_url = "shorturl.at/doELU";
		this.prod_category = "cacti";
		this.prod_condition = "like new";
		this.prod_price = 65.90;
		this.prod_manufacturer = "Honda";
		this.prod_genre = "Spongecore";
	}
	
}
