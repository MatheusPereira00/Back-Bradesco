package com.example.list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProductsSpringApplication {

	// INNIT
	public static void main(String[] args) {
		SpringApplication.run(ProductsSpringApplication.class, args);
	}
}
