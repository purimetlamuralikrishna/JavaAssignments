package parent.override;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Enter in number in the range of 1 to 10");
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if(number>=1&&number<=10) {
			Parent child = new Child(number);
			child.method1();
			child.method2();
			child.method3();
			
			Child child2 = (Child)child;
			child2.method4();
		}
		else {
			System.out.println("Invalid Number");
		}
		
		
		sc.close();
		
		
		
		

	}

}
