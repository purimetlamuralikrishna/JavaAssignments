package exception.student;

public class UserRegistration {

	static void registerUser(String username,String userCountry) throws InvalidCountryException {
		
		if(userCountry.equalsIgnoreCase("india")) {
			System.out.println("User registration done successfully");
		}
		else {
			InvalidCountryException ice = new InvalidCountryException();
			throw ice;
		}
	}
}
