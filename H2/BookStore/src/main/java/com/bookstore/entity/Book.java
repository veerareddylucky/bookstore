package com.bookstore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	private long id;
	private String bookName;
	private String author;
	private String genre;
	private String language;
	public Book() {
		
	}
	
	public Book(long id, String bookName, String author, String genre, String language) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.genre = genre;
		this.language = language;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}
	
