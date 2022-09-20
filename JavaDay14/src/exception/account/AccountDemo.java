package exception.account;

public class AccountDemo {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.setAccountNumber("11235487935");
		account.deposit(1500);
		try {
			account.withdraw(10000);
		} catch (InsufficientFundsException e) {
			
			e.printStackTrace();
		}

	}

}
