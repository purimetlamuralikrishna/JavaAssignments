package com.library.exceptions;

public class BookNotFound extends Exception {

	@Override
	public void printStackTrace() {
		System.out.println("Book Not Found");
	}
	
}
