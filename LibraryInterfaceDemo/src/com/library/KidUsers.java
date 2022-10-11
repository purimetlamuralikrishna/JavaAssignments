package com.library;

public class KidUsers implements LibraryUser {
	
	
	private int age;
	private String bookType;

	KidUsers(){
		
	}
	
	private KidUsers(int age,String bookType){
		
		this.age = age;
		this.bookType = bookType;
		
	}

	@Override
	public KidUsers registerAccount(int age) throws Exception {
		
		if(age<=12) {	
			System.out.println("You have successfully registered under a Kids Account");
			return new KidUsers(age,"Kids");
			
		}
		System.out.println("Sorry, Age must be less than 12 to register as a kid");
		throw new Exception("Invalid Age");
		
	}

	
	@Override
	public void requestBook(String bookType) {
		
		if(bookType.equals(this.bookType)) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
		
	}

}
