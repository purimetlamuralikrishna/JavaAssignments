package evaluation.Person;

public class Person extends Address {
	

	public Person(String name, String gender,String city,String pincode,String state) {
		super(city, pincode, state);
		this.name = name;
		this.gender = gender;
	}
	String name;
	String gender;
	
}