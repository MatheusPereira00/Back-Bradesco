package com.example.crud.controller;

// import org.hibernate.mapping.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import com.example.crud.model.Course;

@RestController
@RequestMapping("/api/courses")

public class CourseController {

    @GetMapping
    public String list() {
        return "api/courses";
    }
}
