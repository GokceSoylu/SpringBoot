package com.gokcesoylu.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.gokcesoylu.model")
@ComponentScan(basePackages = "com.gokcesoylu")
@EnableJpaRepositories(basePackages = "com.gokcesoylu")
@PropertySource(value = "app.properties")
public class SpringDataJpaPApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaPApplication.class, args);
	}

}
