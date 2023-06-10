package com.example.LearnLink.controller;

import com.example.LearnLink.models.Book;
import com.example.LearnLink.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Book")
public class BookController {

    private final BookService Bookservices;

    @Autowired
    public BookController(BookService Bookservices) {
        this.Bookservices = Bookservices;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return Bookservices.getAllBooks();
    }

    @PostMapping
    public void addBook() {

    }

    @PutMapping(path = "{BookId}")
    public void updateSopace() {

    }

    @DeleteMapping(path = "{BookId}")
    public void deleteBook() {

    }

}
