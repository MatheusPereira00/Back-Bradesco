package com.example.list.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

// DATA É DO lOMBOK E FACILITA QUANDO VOCE TEM MUITOS ATRIBUTOS
@Data

// FAZ PARTE DO JPA E FALANDO QUE É UMA ENTIDADE QUE VAI FAZER O MAP COM O DB
@Entity

// @Table(name = "course") CASO JA TENHA UMA TABELA CRIADO NO DB

public class Products {

    // gerando um id automaticamente no banco
    // dando uma quantidade de caracteres 200
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome", length = 200, nullable = false) 
    // associando com o nome da tabela caso seja diferente 
    // o nullable fala que nao aceita valores nulos
    private String name;

    @Column(length = 10, nullable = false) 
    private String category;
    
}
