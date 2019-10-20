package com.akash.github.springdatajpah2.dao.repositories;

import com.akash.github.springdatajpah2.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
