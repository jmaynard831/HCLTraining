package com.phase3proj2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Feedback {

	@Id
	@GeneratedValue
    @JsonIgnore
	Integer feedbackId;
	String reviewer;
	String comment;

}
