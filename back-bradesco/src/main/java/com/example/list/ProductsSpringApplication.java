package com.example.list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProductsSpringApplication {

	
	@Service
	public class ConsumirApiService {

		private final RestTemplate restTemplate;

		public ConsumirApiService(RestTemplate restTemplate) {
			this.restTemplate = restTemplate;
		}
	
	public String getAll(){
		return restTemplate.getForObject("https://dummyjson.com/products", String.class);
	}

	public String getById(int id){
		return restTemplate.getForObject("https://dummyjson.com/products/{id}", String.class, id);
	}

	public String getByParam(int id){
		return restTemplate.getForObject("https://dummyjson.com/products/search?q=phone", String.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(ProductsSpringApplication.class, args);
	}
	}
}
