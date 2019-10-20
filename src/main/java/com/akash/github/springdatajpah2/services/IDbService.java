package com.akash.github.springdatajpah2.services;

import java.util.Collection;

public interface IDbService<T> {

    Collection<T> findAll();

    T findById(Long id);

    T saveOrUpdate(T t);

    void deleteById(Long id);
}
