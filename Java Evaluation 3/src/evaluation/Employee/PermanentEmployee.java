package evaluation.Employee;

public class PermanentEmployee extends Employee {

	private double basicPay;
	
	@Override
	void calculateSalary() {
		
		double pfAmount = basicPay*0.12;
		salary += basicPay-pfAmount;
	}

	public PermanentEmployee(int id, String name,double basicpay) {
		super(id, name);
		basicPay = basicpay;
	}
	
	

		
}
