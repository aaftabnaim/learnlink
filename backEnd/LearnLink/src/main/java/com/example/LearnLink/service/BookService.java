package com.example.LearnLink.service;

import com.example.LearnLink.db.BookDB;
import com.example.LearnLink.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookDB Bookdata;

    @Autowired
    public BookService(BookDB Bookdata) {
        this.Bookdata = Bookdata;
    }

    public List<Book> getAllBooks() {
        return Bookdata.getAllBookss();
    }

}
