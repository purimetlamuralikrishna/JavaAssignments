package com.murali.invalidaccount;

public class InvalidAccount extends Exception {

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
		
		System.out.println("Invalid");
	}
}
