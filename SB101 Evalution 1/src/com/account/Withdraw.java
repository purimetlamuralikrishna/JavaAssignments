package com.account;

public class Withdraw implements Runnable {

	int amount;
	Account account;
	
	
	
	public Withdraw(int amount, Account account) {
		this.amount = amount;
		this.account = account;
	}



	@Override
	public void run() {
		
		account.withdraw(amount);
		
	}
	
}
