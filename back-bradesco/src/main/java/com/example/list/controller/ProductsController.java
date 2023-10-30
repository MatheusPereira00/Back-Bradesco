package com.example.list.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.hibernate.mapping.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")

public class ProductsController {

    // private final ConsumirApiService consumirApiService;
    // @Autowired
    // private ProductsSpringApplication productsSpringApplication;

    // public void ConsumirApiController(ProductsSpringApplication consumirApiService){
    //     this.productsSpringApplication = consumirApiService;
    // }

    @GetMapping("/")
    public String getAll() {
        return getAll();
    }

    @GetMapping("/id/{id}")
    public String getById(@PathVariable int id) {
        return getById(id);
    }
}
