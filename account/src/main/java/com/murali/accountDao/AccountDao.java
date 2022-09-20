package com.murali.accountDao;

import com.murali.account.Account;
import com.murali.invalidaccount.InsufficientBalance;
import com.murali.invalidaccount.InvalidAccount;

public interface AccountDao {

	void save(Account account);
	Account findById(int id) throws InvalidAccount;
	void update(Account account) throws InvalidAccount;
	void remove(Account account) throws InvalidAccount;
	int withdraw(double amount, Account account) throws InsufficientBalance;
	String deposit(double amount, Account account) throws InvalidAccount;
	
}
