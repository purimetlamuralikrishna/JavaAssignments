package com.library;

public class AdultUser implements LibraryUser {
	
	private int age;
	private String bookType;

	
	
	AdultUser(){
		
	}
	
	
	
	private AdultUser(int age,String bookType){
		
		this.age = age;
		this.bookType = bookType;
		
	}
	
	
	
	@Override
	public AdultUser registerAccount(int age) throws Exception {
		
		if(age>12) {	
			System.out.println("You have successfully registered under an Adult Account");
			return new AdultUser(age,"Fiction");
			
		}
		System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		throw new Exception("Invalid Age");
		
	}

	
	
	
	@Override
	public void requestBook(String bookType) {
		
		if(bookType.equals(this.bookType)) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
		
		
	}

}
