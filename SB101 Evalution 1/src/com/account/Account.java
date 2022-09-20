package com.account;

public class Account {
	
	int balance;
	int accountNo;
	
	public void displayBalance() {
		System.out.println("Account no. : "+accountNo+" Balance: "+balance);
	}
	public void deposit(int amount){
		if(amount>0) {
			balance += amount;
			System.out.println("Amount Depostied Successfully");
			displayBalance();
		}
		else {
			System.out.println("InValid Amount");
		}
		
	}
	public void withdraw(int amount){
		
		if(amount<=balance) {
			balance -= amount;
			System.out.println("Amount Withdraw Successfully");
			displayBalance();
		}
		else {
			System.out.println("Invalid Amount");
		}
		
	}
}
