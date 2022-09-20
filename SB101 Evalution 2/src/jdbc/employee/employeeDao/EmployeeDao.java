package jdbc.employee.employeeDao;

import java.util.List;

public interface EmployeeDao {

	public String saveEmployeeDetails(Employee employee);
	public Employee getEmployeeById(int empId) throws EmployeeException;
	public List<Employee> getAllEmployees();
	public String deleteEmployee(int empId)throws EmployeeException;
	
}
