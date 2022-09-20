package evaluation.Student;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number Of students");
		
		int numberOfStudents = sc.nextInt();
		
		Student[] student = new Student[numberOfStudents];
		
		int totalMarks =0;
		
		for(int i=0;i<student.length;i++) {
			
			System.out.println("Enter Student "+(i+1)+" Details");
			student[i] = new Student();
			
			
			System.out.println("Enter Student Roll No");
			int roll = sc.nextInt();
			student[i].setRoll(roll);
			
			
			System.out.println("Enter Student Name");
			String name = sc.next();
			student[i].setName(name);
			
			
			System.out.println("Enter Student Address");
			String address = sc.next();
			student[i].setAddress(address);
			
			
			System.out.println("Enter Student Marks");
			int marks = sc.nextInt();
			student[i].setMarks(marks);
			
			
			System.out.println("====================");
			System.out.println(student[i].toString());
			
			totalMarks += student[i].getMarks();
			
		}
		
		System.out.println("====================");
		System.out.println("Average Marks Of Total Student: "+totalMarks/numberOfStudents);
		
		sc.close();

	}

}
