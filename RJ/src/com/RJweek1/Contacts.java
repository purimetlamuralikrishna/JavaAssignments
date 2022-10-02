package com.RJweek1;

import java.util.regex.Pattern;

public class Contacts {

	String name;
	String phoneNumber;
	
	
	
	public Contacts(String name, String phoneNumber) throws Exception {
		
		if(!Pattern.matches("[789][0-9]{9}", phoneNumber)){
			throw new Exception("Invalid Phone Number");
		}
		if(!Pattern.matches("[a-zA-Z]{2,}", name)){
			throw new Exception("Invalid Name");
		}
		
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name)throws Exception {
		if(!Pattern.matches("[a-zA-Z]{2,}", name)){
			throw new Exception("Invalid Name");
		}
		this.name = name;
	}
	
	
	public String getPhoneNumber() {	
		return phoneNumber;
	}
	
	
	public void setPhoneNumber(String phoneNumber) throws Exception {
		
		if(!Pattern.matches("[789][0-9]{9}", phoneNumber)){
			throw new Exception("Invalid Phone Number");
		}
		this.phoneNumber = phoneNumber;		
	}
	
	
	public static Contacts createContact(String name, String phoneNumber) throws Exception {
		
		
		Contacts c = new Contacts(name,phoneNumber);
		
		return c;
		
		
	}
	
	
}
