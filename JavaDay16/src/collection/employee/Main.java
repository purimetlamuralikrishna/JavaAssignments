package collection.employee;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Employee> employes = new TreeSet<>();
		
		
		int count = 0;
		
		while(count<4) {
			
			Employee emp = new Employee();
			
			System.out.println("Enter Employee Id");
			emp.setEmpId(sc.nextInt());
			System.out.println("Enter Employee Name");
			emp.setEmpName(sc.next());
			System.out.println("Enter Employee Salary");
			emp.setEmpSalary(sc.nextDouble());
			
			employes.add(emp);
			count++;
		}
		
		for(Employee e : employes) {
			System.out.println("Employee Id: "+e.getEmpId());
			System.out.println("Employee Name: "+e.getEmpName());
			System.out.println("Employee Salary: "+e.getEmpSalary());
			System.out.println("===============");
		}
		sc.close();

	}

}
