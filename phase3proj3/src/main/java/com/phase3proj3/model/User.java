package com.phase3proj3.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
@Builder
public class User {

	private String username;
	private String password;
	
}
