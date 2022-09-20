package student.Abstract;

public abstract class Student {
	
	String name;
	String address;
	
	
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	abstract double getPercentage();
	
	
}
