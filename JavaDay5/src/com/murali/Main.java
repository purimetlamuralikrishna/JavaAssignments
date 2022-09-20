package com.murali;

public class Main {

	public static void main(String[] args) {
		
		Employee Emp = new Employee(258,"Murali",20000.0);
		Emp.calculateNetSalary(7);
		Emp.printdetails();
		
		
		
		Employee Emp2 = Employee.getEmployeeDetails(25,"Krishna",3000.0);
		Emp2.calculateNetSalary(7);
		Emp2.printdetails();
		
	}

}

class Employee{
	
	int employeeId;
	String employeeName;
	double salary;
	double netSalary;
	
	public void calculateNetSalary(int pfpercentage) {
		
		double percent = 100-pfpercentage;
		this.netSalary = (this.salary*percent)/100;
			
	}
	
	public Employee(int id,String name,double salary) {
		this.employeeId = id;
		this.employeeName = name;
		this.salary = salary;
	}
	
	public static Employee getEmployeeDetails(int id,String name,double salary) {
		
		Employee E = new Employee(id, name, salary);
		return E;
	}
	
	public void printdetails() {
	
		System.out.println("Employee Id: "+this.employeeId);
		System.out.println("Employee Name: "+this.employeeName);
		System.out.println("Employee Salary: "+this.salary);
		System.out.println("Net Salary :"+this.netSalary);
	}

}
