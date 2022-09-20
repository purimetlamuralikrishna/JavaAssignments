package evaluation.Employee;

public class Main {

	public static void main(String[] args) {
		
		Loan loan = new Loan();
		
		PermanentEmployee permanentEmployee = new PermanentEmployee(2354,"Murali",25000);
		permanentEmployee.calculateSalary();
		
		TemporaryEmployee temporaryemployee = new TemporaryEmployee(321,"Krishna",20,1000);
		temporaryemployee.calculateSalary();
		
		
		System.out.println("Loan Amount of Permanent Employee is "+loan.calculateLoanAmount(permanentEmployee));
		System.out.println("Loan Amount of Temporary Employee is "+loan.calculateLoanAmount(temporaryemployee));
		System.out.println(loan.calculateLoanAmount(null));

	}

}
