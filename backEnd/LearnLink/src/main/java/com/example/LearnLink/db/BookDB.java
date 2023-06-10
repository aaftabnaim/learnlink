package com.example.LearnLink.db;

import com.example.LearnLink.models.Book;
import com.example.LearnLink.repos.BookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookDB {

    private BookRepository BookRepository;

    @Autowired
    public BookDB(BookRepository BookRepository) {
        this.BookRepository = BookRepository;
    }

    public List<Book> getAllBookss() {
        return BookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return BookRepository.findById(id);
    }

    public void addBook(Book Book) {
        BookRepository.save(Book);
    }

    public void updateBook(Long id, Book Book) {
        Optional<Book> optionalBook = BookRepository.findById(id);
        if (optionalBook.isPresent()) {
            Book existingBook = optionalBook.get();
            existingBook.setName(Book.getName());
            existingBook.setDescription(Book.getDescription());
            BookRepository.save(existingBook);
        }
    }

    public void deleteBook(Long id, Book Book) {
        BookRepository.deleteById(id);
    }
}
