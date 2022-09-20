package com.murali.accountDao;

import javax.persistence.EntityManager;

import com.murali.account.Account;
import com.murali.invalidaccount.InsufficientBalance;
import com.murali.invalidaccount.InvalidAccount;
import com.murali.utill.Emutill;

public class AccountDaoImpl implements AccountDao {

	public void save(Account account) {
		
		EntityManager em =  Emutill.createEntity();
		
		em.getTransaction().begin();
		em.persist(account);
		em.getTransaction().commit();
		em.close();
		
	}

	public Account findById(int id) throws InvalidAccount {
		
		
		
		EntityManager em =  Emutill.createEntity();
		
		em.getTransaction().begin();
		
		Account ac =em.find(Account.class,id);
		
		em.getTransaction().commit();
		em.close();
		if(ac==null) {
			throw new InvalidAccount();
		}
		return ac;
	}

	public void update(Account account) throws InvalidAccount {
		
		if(account != null) {
			EntityManager em =  Emutill.createEntity();
			
			Account ac=em.find(Account.class,account.getId());
			
			if(ac != null) {
				em.getTransaction().begin();
				
				ac.setId(account.getId());
				ac.setEmail(account.getEmail());
				ac.setAddress(account.getAddress());
				ac.setBalance(account.getBalance());
				
				em.merge(ac);
				
				em.getTransaction().commit();
				
				System.out.println("Sucessfully Updated");
			}
			
			else {
				System.out.println("Account Details Invalid");
				throw new InvalidAccount();
			}
			
			
			em.close();
		}
		else {
			System.out.println("Invalid Account Details");
			throw new InvalidAccount();
			
			
		}
		
		
		
	}

	public void remove(Account account) throws InvalidAccount {
		
		
		if(account != null) {
			EntityManager em =  Emutill.createEntity();
			
			Account ac=em.find(Account.class,account.getId());
			
			if(ac != null) {
				em.getTransaction().begin();
				
				em.remove(ac);
				
				em.getTransaction().commit();
				
				System.out.println("Sucessfully removed");
			}
			
			else {
				System.out.println("Account Details Invalid");
				throw new InvalidAccount();
			}
			
			
			em.close();
		}
		else {
			System.out.println("Invalid Account Details");
			throw new InvalidAccount();
		}
		
		
		
	}

	public int withdraw(double amount, Account account) throws InsufficientBalance {
		
		int withdraw = 0;
		
		if(account != null) {
			
			EntityManager em =  Emutill.createEntity();
			
			Account ac=em.find(Account.class,account.getId());
			
			if(ac != null) {
				
				if(ac.getBalance()>amount) {
					
					em.getTransaction().begin();
					
					ac.setBalance(ac.getBalance()-amount);
					
					em.merge(ac);
					
					
					em.getTransaction().commit();
					
					withdraw = (int) amount;
					
					System.out.println("withdraw Sucessfull");
				}
				else {
					System.out.println("Insufficient Fund");
					throw new InsufficientBalance();
				}
				
			}
			
			else {
				
				System.out.println("Account Details Invalid");
				throw new InsufficientBalance();
			}

			em.close();
		}
		else {
			System.out.println("Invalid Account");
			throw new InsufficientBalance();
			
		}
		
		
		return withdraw;
	}

	public String deposit(double amount, Account account) throws InvalidAccount {
		
		String result = "Invalid Account";
		
		if(account != null) {
			
			EntityManager em =  Emutill.createEntity();
			
			Account ac=em.find(Account.class,account.getId());
			
			if(ac != null) {
				
				if(amount>0) {
					
					em.getTransaction().begin();
					
					ac.setBalance(ac.getBalance()+amount);
					em.merge(ac);
					
					em.getTransaction().commit();
					
					result = "Deposit Sucessfull";
				}
				else {
					result = "Invalid Deposit Amount";
					throw new InvalidAccount();
				}
				
			}
			
			else {
				result = "Account Details Invalid";
				throw new InvalidAccount();
			}
			em.close();
		}
		else {
			result = "Invalid Account";
			throw new InvalidAccount();
			
		}
		
		
		
		return result;
	}

}
