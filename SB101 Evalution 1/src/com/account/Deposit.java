package com.account;



public class Deposit implements Runnable {

	int amount;
	Account account;
	
	
	
	public Deposit(int amount, Account account) {
		this.amount = amount;
		this.account = account;
	}



	@Override
	public void run() {
		
		account.deposit(amount);
		
	}
}
