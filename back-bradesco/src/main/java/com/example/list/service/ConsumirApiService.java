package com.example.list.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumirApiService {
	private final RestTemplate restTemplate;

	public ConsumirApiService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public String getAll() {
		return restTemplate.getForObject("https://dummyjson.com/products", String.class);
	}

	public String getById(int id) {
		return restTemplate.getForObject("https://dummyjson.com/products/{id}", String.class, id);
	}

	public String getByParam(int id) {
		return restTemplate.getForObject("https://dummyjson.com/products/search?q=phone", String.class);
	}
}