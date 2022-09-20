package member.inheritance;

public class Employee extends Member {
	
	String specialisation;
	String department;
	
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	void printSalary() {
		System.out.println("This is Employee Salary: "+this.salary);
	}
}
