package com.example.list.service;

import com.example.list.model.Products;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient( name = "Dummy-Api",url = "https://dummyjson.com/products")
public interface ProductsFeignClient {

    @GetMapping("{id}")
    Products getProducts(@PathVariable Long id);
}
