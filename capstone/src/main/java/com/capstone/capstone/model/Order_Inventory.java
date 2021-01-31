package com.capstone.capstone.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class Order_Inventory {

	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
	private UUID OI_id;
	@ManyToOne
    @JoinColumn(name="order_id", nullable=false)
	private Orders order_id;
	@ManyToOne
    @JoinColumn(name="product_id", nullable=false)
	private Product product_id;
	private Integer quantity;
	
	public Order_Inventory(Orders order_id, Product product_id, Integer quantity) {
		super();
		this.order_id = order_id;
		this.product_id = product_id;
		this.quantity = quantity;
	}
	
	
}
