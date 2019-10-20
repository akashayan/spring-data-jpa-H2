package com.akash.github.springdatajpah2.dao.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String author;

    @NotNull
    private String coverPhotoUrl;

    @NotNull
    private String isbn;

    @NotNull
    private String language;

    @NotNull
    private Double price;
}
