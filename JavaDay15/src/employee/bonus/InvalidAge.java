package employee.bonus;

public class InvalidAge extends Exception {

	InvalidAge(String error){
		System.out.println(error);
	}
	public InvalidAge() {
		System.out.println("Please pass the date in the correct format");
	}
}
