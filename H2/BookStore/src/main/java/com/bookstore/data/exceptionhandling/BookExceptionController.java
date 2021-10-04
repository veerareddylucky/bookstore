package com.bookstore.data.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BookExceptionController {
	@ExceptionHandler(value = BookNotFoundException.class)
	public ResponseEntity<String> notFound(BookNotFoundException e){
		return new ResponseEntity<>("Book Not Found",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value = BookAlreadyExistException.class)
	public ResponseEntity<String> alreadyExist(BookAlreadyExistException e){
		return new ResponseEntity<>("Book already exist",HttpStatus.BAD_REQUEST);
	}
}
