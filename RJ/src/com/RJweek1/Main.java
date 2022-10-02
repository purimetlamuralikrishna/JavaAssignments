package com.RJweek1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		
		try {
			
			
			Contacts c1 = new Contacts("ab", "9874563212");
			Contacts c2 = new Contacts("abc", "8874563455");
			Contacts c3 = new Contacts("abd", "7974563212");
			Contacts c4 = new Contacts("abg", "8789563123");
			Contacts c5 = new Contacts("abdfr", "9874563321");
			
			
			MobilePhone mp = new MobilePhone("9874563213");
			
			mp.addNewContact(c1);
			mp.addNewContact(c2);
			mp.addNewContact(c3);
			mp.addNewContact(c4);
			mp.addNewContact(c5);
			
			mp.printContacts();
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}


