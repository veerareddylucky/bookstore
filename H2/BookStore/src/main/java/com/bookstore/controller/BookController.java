package com.bookstore.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.entity.Book;
import com.bookstore.service.BookService;

@RestController
public class BookController {
@Autowired
BookService bookService;
@PostMapping("/book/add")
public String addBook(@RequestBody Book book) {
	Book addedbook = bookService.addBook(book);
	return "New Book has been added having id:"+addedbook.getId();
}
@GetMapping("/book/{id}")
public Optional<Book> getBookById(@PathVariable("id") long id) {
	Optional<Book> book = bookService.getBookById(id);
	return book;
}
@GetMapping("/book/all")
public List<Book> getAllBooks(){
	List<Book> booksList = new ArrayList<>();
	booksList = bookService.getAllBooks();
	return booksList;
}
@PutMapping("/book/update")
public String updateBook(@RequestBody Book book) {
	Book updatedBook = bookService.updateBook(book);
	return "Book has been updated having id"+updatedBook.getId();
}
@DeleteMapping("/book/delete/{id}")
public void deleBookById(@PathVariable("id") long id ) {
	bookService.deleteBookById(id);
	
}
@DeleteMapping("book/delete/all")
public void deleteAllBooks() {
	bookService.deleteAllBooks();
}
}
