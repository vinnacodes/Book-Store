package com.vinna.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinna.bookstore.model.Book;
import com.vinna.bookstore.repo.Bookrepo;

@Service
public class Bookservice {


    // br is the book repository object
    @Autowired
    private Bookrepo br;

    // Method to get all books
    public List<Book> getAllBooks() {
        return br.findAll();
    }

    // Method to save a book

    public Book saveBook(Book book) {
        return br.save(book);
    }

    // Method to get all books (this seems redundant with getAllBooks)

    public List<Book> getBooks() {
        return br.findAll();
    }

    // Method to get a book by ID (implemented properly)

    public Book getBookById(Long id) {
        return br.findById(id).orElse(null);
    }

    // Method to update a book by ID

    public Book updateBook(Long id, Book bookDetails) {
        return br.findById(id).map(book -> {
            book.setTitle(bookDetails.getTitle());
            book.setAuthor(bookDetails.getAuthor());
            book.setPrice(bookDetails.getPrice());
            return br.save(book);
        }).orElse(null);
    }
}
