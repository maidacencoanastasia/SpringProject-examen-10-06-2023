package com.example.springproject.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@jakarta.persistence.Entity
@Table(name = "Carti")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "denumire")
    private String denumire;

    @Column(name = "autor")
    private String autor;

    @Column(name = "an_editie")
    private String anEditie;

    @Column(name = "editura")
    private String editura;

    @Column(name = "nr_pagini")
    private int nrPagini;
}