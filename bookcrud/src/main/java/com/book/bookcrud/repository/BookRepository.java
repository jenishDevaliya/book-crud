package com.book.bookcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.bookcrud.model.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

}
