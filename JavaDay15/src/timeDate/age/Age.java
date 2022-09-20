package timeDate.age;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Age {
	
	public void findAge(String date) {
		
		try {
				LocalDate dob = LocalDate.parse(date);
				
				if(dob.isBefore(LocalDate.now())){
					
					System.out.println("Date Of Birth: "+dob.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy")));
					
					System.out.println("Age is "+ChronoUnit.YEARS.between(LocalDate.now(),dob)+"Years");
					
				}
				else {
					System.out.println("Date should not be in Future");
				}
				
		}catch(Exception e){
			
				new InvalidDateFormat("Invalid Date Format");
				
		}
		
		
		
		
		
		   
			
			
		
		
	}
}
