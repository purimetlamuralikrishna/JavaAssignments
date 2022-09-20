package dao.pattern.employee;

import java.util.List;

public interface EmployeeIntr {

	public List<Employee> employeeList();
	
	public String addBonus(int bonus);
	
	public int getEmpSalary(int id);
	
	public String insertWithoutAddress(int id,String name,int salary);
	
	public Employee getEmpDetails(int id);
	
	public List<Employee> employeelistSalarylessthan(int salary);
}
