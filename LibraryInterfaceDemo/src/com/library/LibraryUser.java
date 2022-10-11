package com.library;

public interface LibraryUser {

	public LibraryUser registerAccount(int age) throws Exception;
	
	public void requestBook(String bookType);
}
