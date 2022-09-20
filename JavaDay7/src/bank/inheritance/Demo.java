package bank.inheritance;

import java.util.Scanner;

public class Demo {
	
	public static Bank getBank(String bank) {
		
		if(bank .equals("axis")) {
			AxisBank axis = new AxisBank("Axis","axis00003255");
			axis.rateOfIntrest = 7.5;
			return axis;
		}
		else if(bank.equals("icici")) {
			IciciBank icici = new IciciBank("ICICI","icici00254");
			icici.rateOfIntrest = 7.1;
			return icici;
		}
		
		return null;
	}

	public static void main(String[] args) {
		
		
		System.out.println("Enter Bank Name");
		Scanner sc = new Scanner(System.in);
		
		String bank = sc.next();
		
		Bank BankDetails = Demo.getBank(bank);
		BankDetails.displayDetails();
		sc.close();
		
	}

}
