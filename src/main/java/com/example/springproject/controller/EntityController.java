package com.example.springproject.controller;

import com.example.springproject.model.Book;
import com.example.springproject.service.EntityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EntityController {
    private final EntityService entityService;

    public EntityController(EntityService entityService) {
        super();
        this.entityService = entityService;
    }

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome!\nBest regards,\nThis is Maidacenco Anastasia\nIf you want to see all type /all, if something specific /id, more specific /param";
    }


    @GetMapping("all")
    public List<Book> get() {
        return entityService.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Book> get(@PathVariable("id") long id) {
        return new ResponseEntity<Book>(entityService.get(id), HttpStatus.OK);
    }

    @GetMapping("/param")
    public ResponseEntity<List<Book>> getProductsByName() {
        List<Book> filteredEntities = entityService.getByNameLength();
        return ResponseEntity.ok(filteredEntities);
    }
}
