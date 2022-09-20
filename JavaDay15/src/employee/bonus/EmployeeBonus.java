package employee.bonus;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmployeeBonus {

		public double bonus(String date) {
			
			
			try {
				LocalDate doj = LocalDate.parse(date);
				
				if(doj.isBefore(LocalDate.now())) {
					if(ChronoUnit.YEARS.between(doj,LocalDate.now())<1) {
						return 5000;
					}
					if(ChronoUnit.YEARS.between(doj,LocalDate.now())<2) {
						return 8000;
					}
					return 10000;
					
				}
				else {
					new InvalidAge("Age should not be in the future");
				}
				
			}
			catch(Exception e) {
				new InvalidAge();
			}
			return 0;
		}
}
