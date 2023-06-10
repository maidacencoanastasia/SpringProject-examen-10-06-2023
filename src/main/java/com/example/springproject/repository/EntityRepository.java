package com.example.springproject.repository;

import com.example.springproject.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityRepository extends JpaRepository<Book, Long> {

}
