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
public class Orders {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(columnDefinition = "BINARY(16)")
	private UUID order_id;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	private String orderStatus;
	private String order_date;
	private String saStreet;
	private String saCity;
	private String saState;
	private String saZip;
	
	public Orders(User user, String order_date, String saStreet, String saCity, String saState, String saZip) {
		super();
		this.user = user;
		this.order_date = order_date;
		this.saStreet = saStreet;
		this.saCity = saCity;
		this.saState = saState;
		this.saZip = saZip;
	}

	

}
