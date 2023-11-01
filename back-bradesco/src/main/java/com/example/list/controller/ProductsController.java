package com.example.list.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.list.model.Products;
import com.example.list.service.ConsumirApiService;

@RestController
@RequestMapping("api/products")

public class ProductsController {

    @Autowired
    private ConsumirApiService consumirApiService;

    @GetMapping("{products}")
    public ResponseEntity<Products> getProducts(@PathVariable("products") String products) {
        return ResponseEntity.ok(consumirApiService.getProducts(products));
    }
}
