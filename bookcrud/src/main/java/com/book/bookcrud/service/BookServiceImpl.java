package com.book.bookcrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.book.bookcrud.model.Book;
import com.book.bookcrud.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    // Constructor injection (recommended)
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Get all books
    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Save book
    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    // Get book by ID
    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    // Delete book by ID
    @Override
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }
}
