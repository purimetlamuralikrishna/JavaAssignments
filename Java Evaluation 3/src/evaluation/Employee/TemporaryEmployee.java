package evaluation.Employee;

public class TemporaryEmployee extends Employee {
	
	TemporaryEmployee(int id, String name,int workedhours,int hourlywages) {
		super(id, name);
		this.hoursWorked = workedhours;
		this.hourlyWages = hourlywages;
	}



	int hoursWorked;
	int hourlyWages;
	
	
	
	@Override
	void calculateSalary() {
		
		salary = hoursWorked*hourlyWages;
		
	}

}
