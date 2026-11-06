package com.book.bookcrud.model;

import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//import lombok.Data;

import lombok.*;

@Entity
@Table(name= "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book { 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private double price;

}
