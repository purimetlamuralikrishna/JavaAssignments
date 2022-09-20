package murali.practise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Runnable c = new Calculator()::fun; 
		
		Thread tr = new Thread(c);
		Thread tr1 = new Thread(c);
		
		tr1.setName("Sai");
		tr.setName("Murali");
		
		tr.start();
		tr.join();
		tr1.start();
		tr1.join();
		
		for(int i=10;i<20;i++) {
			System.out.println(i);
		}
		
		String[] str = {"5","6","7"};
		
//		Scanner sc = new Scanner(System.in);
	}

}
