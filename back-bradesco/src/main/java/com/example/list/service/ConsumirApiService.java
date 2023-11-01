package com.example.list.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.list.model.Products;

@Service
public class ConsumirApiService {

	public Products getProducts(String products) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Products> resp = restTemplate
				.getForEntity(String.format("https://dummyjson.com/products", products), Products.class);
		return resp.getBody();
	}
}