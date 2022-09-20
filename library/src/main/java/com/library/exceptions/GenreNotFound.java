package com.library.exceptions;

public class GenreNotFound extends Exception {

	@Override
	public void printStackTrace() {
		System.out.println("Genere Not Found");
	}
}
