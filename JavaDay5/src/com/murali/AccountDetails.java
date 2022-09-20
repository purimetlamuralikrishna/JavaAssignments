package com.murali;

public class AccountDetails {
	
	public Account getAccountDetails(int id,String typeOfAccount,int amount) {
		
		if(amount>0) {
			Account createAccount = new Account(id,typeOfAccount,amount);
			return createAccount;
		}
		System.out.println("Balance should be positive");
		return null;
			
	}
	
	public int getWithdrawAmount(int amount) {
		if(amount>0) {
			return amount;
		}
		System.out.println("Amount should be positive");
		return 0;
		
	}
	public void printdetails() {
		
	}

	public static void main(String[] args) {
		
		int enterAccountid=100;
		String enterAccountType="Savings";
		int enterBalance=1000;
		int enterAmountToBeWithdrawn=10;
			
		AccountDetails person = new AccountDetails();
		if(person.getWithdrawAmount(enterAmountToBeWithdrawn)!=0) {
			
			Account A = person.getAccountDetails(enterAccountid, enterAccountType, enterBalance);
			
			if(A!=null && A.withdraw(enterAmountToBeWithdrawn)) {	
				System.out.println("Balance Amount After Withdral "+ A.getbalance());
			}
		}
		}
		
}

class Account{
	
	private int accountid;
	private String accountType;
	private int balance;
	
	public boolean withdraw(int amount) {
		
		if(amount>0&&amount<this.balance) {
			this.balance -= amount;
			return true;
		}
		System.out.println("Sorry!!! No enough balance");
		return false;
		
	}
	
	public int getbalance(){
		return this.balance;
	}
	
	Account(int id,String typeOfAccount,int amount){
		
		this.setAccountid(id);
		this.setAccountType(typeOfAccount);
		this.balance = amount;
		
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getAccountid() {
		return accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
}
