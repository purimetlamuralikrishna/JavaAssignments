package com.library;

public class LibraryInterfaceDemo {
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		KidUsers k1 = new KidUsers().registerAccount(12);
		AdultUser a1 = new AdultUser().registerAccount(15);
		
		k1.requestBook("Fiction");
		a1.requestBook("Kids");

	}

}
