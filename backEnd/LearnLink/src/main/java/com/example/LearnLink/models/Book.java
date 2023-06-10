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
    private int capacity;
    private String facilities;
    private String image;

    public Book(Long id, String name, String description, int capacity, String facilities, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.capacity = capacity;
        this.facilities = facilities;
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
                ", capacity=" + capacity +
                ", facilities=" + getFacilitiesList() +
                ", image='" + image + '\'' +
                '}';
    }

    public List<String> getFacilitiesList() {
        List<String> list = new ArrayList<>();

        for (String facilities : this.getFacilities().split("\\,")) {
            list.add(facilities);
        }

        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book Book = (Book) o;
        return capacity == Book.capacity && Objects.equals(id, Book.id) && Objects.equals(name, Book.name)
                && Objects.equals(description, Book.description) && Objects.equals(facilities, Book.facilities)
                && Objects.equals(image, Book.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, capacity, facilities, image);
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
