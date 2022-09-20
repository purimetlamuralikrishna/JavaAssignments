package student.Abstract;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name");
		String name = sc.next();
		
		System.out.println("Enter Student Address");
		String address = sc.next();
		
		System.out.println("Enter Student Phisics Marks");
		int phisicsMarks = sc.nextInt();
		
		System.out.println("Enter Student Chemistry Marks");
		int chemistryMarks = sc.nextInt();
		
		System.out.println("Enter Student Maths Marks");
		int mathsMarks = sc.nextInt();
		
		ScienceStudent student1 = new ScienceStudent(name, address, phisicsMarks, chemistryMarks, mathsMarks);
		System.out.println("Overall Percentage is : "+student1.getPercentage());
		
		
		
		
		System.out.println("Enter Student Name");
		name = sc.next();
		
		System.out.println("Enter Student Address");
		address = sc.next();
		
		System.out.println("Enter Student History Marks");
		int historyMarks = sc.nextInt();
		
		System.out.println("Enter Student Civics Marks");
		int civicsMarks = sc.nextInt();
		
		HistoryStudent student2 = new HistoryStudent(name, address, historyMarks, civicsMarks);
		System.out.println("Overall Percentage is : "+student2.getPercentage());
		
		sc.close();
	}

}
