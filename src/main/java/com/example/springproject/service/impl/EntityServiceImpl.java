package com.example.springproject.service.impl;

import com.example.springproject.exception.ResourceNotFoundException;
import com.example.springproject.model.Book;
import com.example.springproject.repository.EntityRepository;
import com.example.springproject.service.EntityService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntityServiceImpl implements EntityService {

    private final EntityRepository entityRepository;


    public EntityServiceImpl(EntityRepository entityRepository) {
        super();
        this.entityRepository = entityRepository;
    }

    @Override
    public List<Book> getAll() {
        return entityRepository.findAll();
    }

    @Override
    public Book get(long id) {
        return entityRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Bus", "id", id));
    }

    @Override
    public List<Book> getByNameLength() {
        List<Book> entities = entityRepository.findAll();
        List<Book> filteredEntities = entities.stream().filter(book -> book.getDenumire().length() > 5).collect(Collectors.toList());
        return filteredEntities;
    }

}
