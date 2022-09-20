package com.murali.account;

import com.murali.accountDao.AccountDao;
import com.murali.accountDao.AccountDaoImpl;
import com.murali.invalidaccount.InsufficientBalance;
import com.murali.invalidaccount.InvalidAccount;

public class Main {

	public static void main(String[] args) {
		AccountDao acc = new AccountDaoImpl();
		Account ac = new Account();
		ac.setId(1);
		ac.setEmail("Murali");
		ac.setAddress("kurnool");
		ac.setBalance(10000);
		//acc.save(ac);
		
		try {
			Account ac1 = acc.findById(1);
			System.out.println(ac1);
		} catch (InvalidAccount e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ac.setEmail("Sai");
		
		try {
			acc.update(ac);
		} catch (InvalidAccount e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(acc.withdraw(100, ac));
		} catch (InsufficientBalance e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(acc.deposit(10000, ac));
		} catch (InvalidAccount e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			acc.remove(ac);
		} catch (InvalidAccount e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
