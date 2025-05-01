package com.gokcesoylu.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan(basePackages = { "com.gokcesoylu" })
@SpringBootApplication
public class SpringRestApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiApplication.class, args);
	}

}
