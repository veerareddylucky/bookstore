package com.bookstore.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.data.exceptionhandling.BookAlreadyExistException;
import com.bookstore.data.exceptionhandling.BookNotFoundException;
import com.bookstore.entity.Book;
import com.bookstore.repository.BookRepository;
@Service
public class BookServiceImplementation implements BookService {
	@Autowired
	BookRepository bookRepository;

	public List<Book> getAllBooks() {
	
		List<Book> booksList = new ArrayList<>();
		booksList = bookRepository.findAll();
		return booksList;
	}

	public Optional<Book> getBookById(long id) {
		if(bookRepository.existsById(id)) {
		Optional<Book> book =  Optional.ofNullable(bookRepository.getById(id));
		return book;
		}
		else {
			throw new BookNotFoundException();
		}
	}

	public Book addBook(Book book) {
		if(bookRepository.existsById(book.getId())) {
			throw new BookAlreadyExistException();
		}
		else {
		Book addedBook = bookRepository.save(book);
		return addedBook;
		}
	}

	public Book updateBook(Book book) {
		if(bookRepository.existsById(book.getId())) {
		Book updatedBook = bookRepository.save(book);
		return updatedBook;
		}
		else {
			throw new BookNotFoundException();
		}
	}

	
	public void deleteBookById(long id) {
		if(bookRepository.existsById(id)) {
		bookRepository.deleteById(id);
		}
		else {
			throw new BookNotFoundException();
		}
	}

	public void deleteAllBooks() {
		bookRepository.deleteAll();

	}

}
