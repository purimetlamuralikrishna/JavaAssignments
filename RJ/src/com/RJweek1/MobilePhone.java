package com.RJweek1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class MobilePhone {
	
	String myNumber;
	List<Contacts> list;
	
	public MobilePhone(String myNumber) throws Exception {
		
		if(!Pattern.matches("[789][0-9]{9}", myNumber)){
			throw new Exception("Invalid Phone Number");
		}	
		this.myNumber = myNumber;
		this.list = new ArrayList<>();
	}
	
	public int findContact(Contacts contact) {
		
		int index = -1;
		for(int i=0;i<list.size();i++) {
			if(contact.getName().equals(list.get(i).getName())&&contact.getPhoneNumber().equals(list.get(i).getPhoneNumber())) {
				return i;
			}
		}
		
		return index;	
	}
	
	public int findContact(String str) {
		
		int index = -1;
		for(int i=0;i<list.size();i++) {
			if(str.equals(list.get(i).getName())||str.equals(list.get(i).getPhoneNumber())) {
				return i;
			}
		}
		
		return index;	
	}
	
	public boolean removeContact(Contacts contact) {
		
		int index = findContact(contact);
		
		if(index!=-1) {
			list.remove(index);
			return true;
		}
		return false;
		
	}
	
	
	public boolean addNewContact(Contacts contact) {
		
		int index = findContact(contact);
		
		if(index==-1) {
			list.add(contact);
			return true;
		}
		return false;
		
	}
	
	public boolean updateContact(Contacts oldContact,Contacts updateContact) {
		
		int index = findContact(oldContact);
		
		if(index==-1) {
			return false;
		}
		
		list.add(index, updateContact);
		return true;
		
	}
	
	
	public Contacts queryContact(String name){
		
		for(Contacts c:list) {
			if(c.getName().equals(name)) {
				return c;
			}
		}
		
		return null;	
	}
	
	public void printContacts() {
		
		for(Contacts c:list) {
			System.out.println(c.getName()+"  ->  "+c.getPhoneNumber());
		}
		
	}
	
	
	
}
