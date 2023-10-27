package com.example.list.controller;

// import org.hibernate.mapping.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import com.example.crud.model.Course;

@RestController
@RequestMapping("/api/courses")

public class ProductsController {

    @GetMapping
    public String list() {
        return "api/courses";
    }


    @GetMapping
    public String listById() {
        return "api/courses";
    }


    @GetMapping
    public String serarc() {
        return "api/courses";
    }
}
