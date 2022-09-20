package stringOverride.student;



public class Student {
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public void displayDetails() {

		System.out.println(toString());
		System.out.println("Grade is: "+calculateGrade());
	}
	
	public Student() {
		
	}
	
	public Student(int roll, String name, int marks) {
		this.name = name;
		this.roll = roll;
		this.marks = marks;
		
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	private char calculateGrade() {
		if (marks >= 500){
			return 'A';
		}
		
		else if(marks < 500 && marks >= 400) {
			return 'B';
		}
		
		return 'C';
	}

	public char getGrade() {
		return grade;
	}
	
}
