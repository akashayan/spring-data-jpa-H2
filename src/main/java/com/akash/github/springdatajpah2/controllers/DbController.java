package com.akash.github.springdatajpah2.controllers;

import com.akash.github.springdatajpah2.dao.entities.Book;
import com.akash.github.springdatajpah2.services.IDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/db")
public class DbController {

    @Autowired
    private IDbService bookService;

    @GetMapping(value = "/getAll")
    public Collection<Book> getAll() {
        return bookService.findAll();
    }

    @PostMapping(value = "/save")
    public Book save(@RequestBody Book book) {
        return (Book) bookService.saveOrUpdate(book);
    }

    @GetMapping(value = "/fetch/{id}")
    public Book getById(@PathVariable(value = "id") Long id) {
        return (Book) bookService.findById(id);
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteById(@PathVariable(value = "id") Long id) {
        bookService.deleteById(id);
        return "SUCCESS";
    }
}
