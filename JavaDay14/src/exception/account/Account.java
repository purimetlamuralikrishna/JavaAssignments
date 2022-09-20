package exception.account;

public class Account {

	String accountNumber;
	double Balance;
	
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	void deposit(double amount) {
		Balance += amount;
	}
	double withdraw(double amount) throws InsufficientFundsException {
		
		if(Balance>=amount) {
			return amount;
		}
		else {
			InsufficientFundsException ife = new InsufficientFundsException("Insufficient Fund Please enter Valid amount to withdral");
			throw ife;
		}
	}
}
