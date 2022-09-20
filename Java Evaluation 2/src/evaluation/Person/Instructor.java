package evaluation.Person;

public class Instructor extends Person {

	public Instructor(String name, String gender, String city, String pincode, String state,int id,int salary) {
		super(name, gender, city, pincode, state);
		this.instructorId = id;
		this.salary = salary;
		
	}
	int instructorId;
	 int salary;
	 
	 
	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + ", name=" + name + ", gender="
				+ gender + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	 
	 
}
