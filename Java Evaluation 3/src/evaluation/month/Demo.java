package evaluation.month;

import java.util.Scanner;

public class Demo {
	
	void showDetails(Month m) {
		switch (m) {
		case JAN:
			System.out.println("This is the 1st Month of the Year January");
			break;
		case FEB:
			System.out.println("This is the 2nt Month of the Year Febrvery");
			break;
		case MAR:
			System.out.println("This is the 3rd Month of the Year March");
			break;
		case APR:
			System.out.println("This is the 04th Month of the Year Aprial");
			break;
		case MAY:
			System.out.println("This is the 05th Month of the Year May");
			break;
		case JUN:
			System.out.println("This is the 06th Month of the Year June");
			break;
		case JUL:
			System.out.println("This is the 07th Month of the Year July");
			break;
		case AUG:
			System.out.println("This is the 08th Month of the Year Auguest");
			break;
		case SEP:
			System.out.println("This is the 09th Month of the Year September");
			break;
		case OCT:
			System.out.println("This is the 10th Month of the Year October");
			break;
		case NOV:
			System.out.println("This is the 11th Month of the Year November");
			break;
		case DEC:
			System.out.println("This is the 12th Month of the Year December");
			break;
		default:
			System.out.println("Invalid Month Name");
			break;
		}
	}

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Month Name");
			String month = sc.next().toUpperCase().trim().substring(0,3);
			Month m = Month.valueOf(month);
			Demo d= new Demo();
			d.showDetails(m);
			sc.close();
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Invalid Month Name");
		}
		catch(Exception e) {
			System.out.println("Invalid Month Name");
		}
		

	}

}
