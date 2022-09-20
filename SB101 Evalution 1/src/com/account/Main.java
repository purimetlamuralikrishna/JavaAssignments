package com.account;

public class Main {

	public static void main(String[] args) {
		
		Account abc = new Account();
		abc.accountNo = 123;
		abc.balance = 1000;
		
		Deposit deposit = new Deposit(500,abc);
		Withdraw withdra = new Withdraw(200,abc);
		
		Thread tr1 = new Thread(deposit);
		Thread tr2 = new Thread(withdra);
		
		tr1.start();
		try {
			tr1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tr2.start();

	}

}
