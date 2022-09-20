package evaluation.Employee;

final class Loan {
	public double calculateLoanAmount(Employee employeeObj) {
		if (employeeObj instanceof PermanentEmployee) {
				return employeeObj.salary*0.15;
		}
		else if(employeeObj instanceof TemporaryEmployee) {
			return employeeObj.salary*0.10;
		}
		
		return 0.0;
		
	}
	
	Loan(){
		
	}
}
