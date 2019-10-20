package com.akash.github.springdatajpah2.services.impls;

import com.akash.github.springdatajpah2.dao.entities.Book;
import com.akash.github.springdatajpah2.dao.repositories.BookRepository;
import com.akash.github.springdatajpah2.services.IDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookService implements IDbService<Book> {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Collection<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public Book saveOrUpdate(Book book) {
        return bookRepository.saveAndFlush(book);
    }

    @Override
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}
