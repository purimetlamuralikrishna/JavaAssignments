package student.inheritance;

public class Main {

	public static void main(String[] args) {
		
		DayScholar student1 = new DayScholar(25,"Murali");
		student1.displayDetails();
		student1.payFee(2500);
		
		
		
		Hostler student2 = new Hostler(32,"Krishna");
		student2.displayDetails();
		student2.payFee(3000);
		
		
		
	}

}
