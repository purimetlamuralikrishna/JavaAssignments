package evaluation.customer;

public class Customer {

	String username;
	String password;
	String mobileNumber;
	String email;
	
	public Customer(String username, String password, String mobileNumber, String email) {
		
		this.username = username;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [username=" + username + ", password=" + password + ", mobileNumber=" + mobileNumber
				+ ", email=" + email + "]";
	}
	
}
