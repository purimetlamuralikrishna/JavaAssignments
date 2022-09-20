package evaluation.vote;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
	
	public static void checkEligibility(StringBuilder date) {
		
			try {
		
			LocalDate dob = LocalDate.parse(date);
			if(dob.isAfter(LocalDate.now())) {
				System.out.println("Date of birth should not be in future");
			}
			else {
				if(ChronoUnit.YEARS.between(dob,LocalDate.now())>=18) {
					System.out.println("You are eligible to cast your vote");
				}
				else {
					System.out.println("You are not eligible to cast your vote");
				}
				if(ChronoUnit.DAYS.between(dob,LocalDate.now())==0&&ChronoUnit.MONTHS.between(dob,LocalDate.now())==0) {
					System.out.println("Happy Birthday");
				}
			}
			}
			catch(Exception e) {
				System.out.println("please pass the date in the proper format");
			}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Date of Birth in yyyy-MM-dd Formate");
		
		StringBuilder date = new StringBuilder(sc.next());
		Main.checkEligibility(date);
		
		

	}

}
