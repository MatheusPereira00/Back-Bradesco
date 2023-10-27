package com.example.list.model;

// import jakarta.persistence.Entity;
import lombok.Data;

// DATA É DO lOMBOK E FACILITA QUANDO VOCE TEM MUITOS ATRIBUTOS
@Data
// @Entity
public class Products {

    public int id;
    public String title;
    public String description;
    public int price;
    public double discountPercentage;
    public double rating;
    public int stock;
    public String brand;
    public String category;
    public String thumbnail;
    // public List<String> images;

}
