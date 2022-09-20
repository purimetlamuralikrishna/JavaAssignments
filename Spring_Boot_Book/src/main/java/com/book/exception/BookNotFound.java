package com.book.exception;

public class BookNotFound extends RuntimeException {

	public BookNotFound() {
		
	}
	
	public BookNotFound(String msg) {
		super(msg);
	}
}
