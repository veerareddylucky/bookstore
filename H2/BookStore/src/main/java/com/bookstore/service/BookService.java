package com.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bookstore.entity.Book;


@Service
public interface BookService {
	public List<Book> getAllBooks();
	public Optional<Book> getBookById(long id);
	public Book addBook(Book book);
	public Book updateBook(Book book);
	public void deleteBookById(long id);
	public void deleteAllBooks();

}
