package evaluation.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		try {
			System.out.println("Enter the number of elements in the array");
			Scanner sc = new Scanner(System.in);
			int sizeOfArray = sc.nextInt();
			int[] array = new int[sizeOfArray];
			for(int i=0;i<array.length;i++) {
				System.out.println("Enter the elements in the array");
				array[i] = sc.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access");
			int accessIndex = sc.nextInt();
			System.out.println("The array element at index "+accessIndex +" = "+array[accessIndex]);
			System.out.println("The array element successfully accessed");
			sc.close();
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(InputMismatchException e) {
			System.out.println("java.lang.NumberFormatException");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
