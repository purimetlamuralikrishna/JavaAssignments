package com.murali.invalidaccount;

public class InsufficientBalance extends Exception {

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
		System.out.println("Insufficient Fund");
	}
}
