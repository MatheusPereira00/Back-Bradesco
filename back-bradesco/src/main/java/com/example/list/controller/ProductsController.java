package com.example.list.controller;

import com.example.list.model.ProductsList;
import com.example.list.service.ProductsFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.list.model.Products;

@RestController
@RequestMapping("products")

@CrossOrigin(origins = "http://localhost:4200/")
public class ProductsController {

    @Autowired
    private ProductsFeignClient productsFeignClient;

    @GetMapping("{id}")
    public ResponseEntity<Products> getProductsId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(productsFeignClient.getProductsId(id));
    }

    @GetMapping
    public ResponseEntity<ProductsList> getAllProducts() {
        return ResponseEntity.ok(productsFeignClient.getAllProducts());
    }

}
