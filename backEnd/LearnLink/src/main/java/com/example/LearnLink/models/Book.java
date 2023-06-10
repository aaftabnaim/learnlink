package com.example.LearnLink.models;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private int BarCode;
    private String author;
    private String image;

    public Book(Long id, String name, String description, int capacity, String facilities, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.BarCode = capacity;
        this.author = facilities;
        this.image = image;
    }

    public Book() {

    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", capacity=" + BarCode +
                ", author=" + author +
                ", image='" + image + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book Book = (Book) o;
        return BarCode == Book.BarCode && Objects.equals(id, Book.id) && Objects.equals(name, Book.name)
                && Objects.equals(description, Book.description) && Objects.equals(author, Book.author)
                && Objects.equals(image, Book.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, BarCode, author, image);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBarCode() {
        return BarCode;
    }

    public void setBarCode(int capacity) {
        this.BarCode = capacity;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String facilities) {
        this.author = facilities;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
