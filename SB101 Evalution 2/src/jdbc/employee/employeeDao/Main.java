package jdbc.employee.employeeDao;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		EmployeeDao employee = new EmployeeDaoImpl();
		
		Employee emp = new Employee();
		emp.setEid(2);
		emp.setName("krishna");
		emp.setAddress("HYd");
		emp.setSalary(50000);
		
		
		System.out.println(employee.saveEmployeeDetails(emp));
		
		try {
			System.out.println(employee.deleteEmployee(2));
		} catch (EmployeeException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		
		
		try {
			Employee e = employee.getEmployeeById(1);
			System.out.println(e);
			
		} catch (EmployeeException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		List<Employee> list=  employee.getAllEmployees();
		System.out.println(list);
		System.out.println("***********************");
		
	}

}
