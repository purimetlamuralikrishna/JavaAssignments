package member.inheritance;

public class Manager extends Member {
	
	String specialisation;
	String department;
	
	Manager(String n,int age,String number,String address,double salary,String special,String dept) {
		this.name = n;
		this.age = age;
		this.phoneNumber = number;
		this.address = address;
		this.salary = salary;
		this.specialisation = special;
		this.department = dept;
	}
	
	@Override
	void printSalary() {
		System.out.println("This is Manager Salary: "+this.salary);
	}
}
