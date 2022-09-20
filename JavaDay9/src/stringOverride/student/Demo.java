package stringOverride.student;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		int r;
		String n;
		int m;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student roll number");
		r = sc.nextInt();
		
		System.out.println("Enter Student Name");
		n = sc.next();
		
		System.out.println("Enter student marks");
		m = sc.nextInt();
		
		Student student = new Student(r,n,m);
		
		student.displayDetails();
		sc.close();
		

	}

}
