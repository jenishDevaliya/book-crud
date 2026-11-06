package com.book.bookcrud.service;

import java.util.List;

import com.book.bookcrud.model.Book;
public interface BookService {

    List<Book> getAllBooks();

    Book getBookById(Long id);

    Book saveBook(Book book);

    void deleteBookById(Long id);


}
