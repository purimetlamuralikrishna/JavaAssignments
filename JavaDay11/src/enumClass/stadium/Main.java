package enumClass.stadium;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stadium Name");
		Ipl ipl = new Ipl();
		Stadium stadium = Stadium.valueOf(sc.next().toUpperCase());
		ipl.homeTeamStadium(stadium);
		sc.close();
		
		
		
		
		
		

	}

}
