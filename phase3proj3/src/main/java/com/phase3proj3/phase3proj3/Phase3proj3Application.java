package com.phase3proj3.phase3proj3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com")
@EnableJpaRepositories(basePackages="com")
@EntityScan(basePackages="com")
public class Phase3proj3Application {

	public static void main(String[] args) {
		SpringApplication.run(Phase3proj3Application.class, args);
	}

}
