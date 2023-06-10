package com.example.springproject.service;

import com.example.springproject.model.Book;

import java.util.List;

public interface EntityService {
// write for  service for a method to get all the entities whose description length is greater than 5
    List<Book> getByNameLength();

    List<Book> getAll();
    Book get(long id);
}
