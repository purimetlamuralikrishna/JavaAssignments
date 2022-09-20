package employee.bonus;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		EmployeeBonus e = new EmployeeBonus();
		System.out.println("Enter Date of Joining in yyyy-MM-dd Formate");
		
		double amount = e.bonus(sc.next());
		System.out.println("Bonus Amount is: "+amount);
		sc.close();

	}

}
