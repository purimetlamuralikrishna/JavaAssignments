package jdbc.employee.employeeDao;

public class EmployeeException extends Exception {

	@Override
	public String getMessage() {
		
		return "Error Occured";
	}
}
