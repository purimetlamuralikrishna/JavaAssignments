package collection.product;


import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Main {
	
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		
		int count = 0;
		
		while(count<4) {
			
			System.out.println("Enter product Id");
			int id = sc.nextInt();
			
			System.out.println("Enter product Name");
			String name  = sc.next();
			
			System.out.println("Enter Product Price");
			double price = sc.nextDouble();
			
			Product product = new Product(id, name, price);
			products.add(product);
			count++;
			
		}
		
		System.out.println("Enter 1 to sort Products based on Price");
		System.out.println("Enter 2 to sort Products based on Name");
		System.out.println("Enter 3 to sort Products based on Id");
		try {
			int num = sc.nextInt();
			
			switch(num){
				
				case 1:
					Collections.sort(products,new ProductPriceSort());
					System.out.println(products.toString());
					break;
				case 2:
					Collections.sort(products,new ProductNameSort());
					System.out.println(products.toString());
					break;
				case 3:
					Collections.sort(products,new ProductIdSort());
					System.out.println(products.toString());
					break;
				default:
					System.out.println("Invalid Number");
			}
		}catch(InputMismatchException e) {
			System.out.println("Invalid Input");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		sc.close();	

	}


}
