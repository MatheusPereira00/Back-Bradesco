package com.example.list.controller;

// import org.hibernate.mapping.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.list.ProductsSpringApplication.ConsumirApiService;

// import com.example.crud.model.Course;

@RestController
@RequestMapping("/api/courses")

public class ProductsController {

    private final ConsumirApiService consumirApiService;


    public void ConsumirApiController(ConsumirApiService consumirApiService){
        this.consumirApiService = consumirApiService;
    }

    @GetMapping("/")
    public String getAll() {
        return consumirApiService.getAll();
    }

    @GetMapping("/id/{id}")
    public String getById(@PathVariable int id) {
        return consumirApiService.getById(id);
    }
}
