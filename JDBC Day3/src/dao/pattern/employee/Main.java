package dao.pattern.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		EmployeeDao employee = new EmployeeDao();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id");
		int empid = sc.nextInt();
		System.out.println("Enter Employee Name");
		String empName = sc.next();
		System.out.println("Enter Employee Salary");
		int empSalary = sc.nextInt();
		String msg = employee.insertWithoutAddress(empid,empName,empSalary);
		System.out.println(msg);
		
		
		System.out.println("Enter Employee Id to get Salary  details");
		int empId  = sc.nextInt();
		int i = employee.getEmpSalary(empId);
		System.out.println("Employee Salary is: "+i);
		
		
		
		
		System.out.println("Enter Salary Amount to get employees list less than entered amount");
		int empMaxSalary = sc.nextInt();
		ArrayList<Employee> list = (ArrayList<Employee>)employee.employeelistSalarylessthan(empMaxSalary);
		System.out.println(list.toString());
		
		
		
		
		System.out.println("Enter Id to Get Employee Details");
		int employeeId = sc.nextInt();
		Employee emp = employee.getEmpDetails(employeeId);
		System.out.println(emp.toString());
		
		
		
		System.out.println("Enter Bonous Amount to Employees");
		int empBonus = sc.nextInt();
		String msg2  = employee.addBonus(empBonus);
		System.out.println(msg2);
		
		
		List<Employee> employees =  employee.employeeList();
		System.out.println(employees.toString());
		
		
		sc.close();
	}

}
