package com.gokcesoylu.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.gokcesoylu.model")
public class SpringDataJpaPApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaPApplication.class, args);
	}

}
