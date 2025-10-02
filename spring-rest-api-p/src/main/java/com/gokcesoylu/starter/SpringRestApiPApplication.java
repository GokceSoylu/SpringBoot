package com.gokcesoylu.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "com.gokcesoylu" })
@SpringBootApplication
public class SpringRestApiPApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiPApplication.class, args);
	}

}
