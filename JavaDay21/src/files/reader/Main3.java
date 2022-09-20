package files.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter File name");
		try {
			
			
			FileReader fr = new FileReader(sc.next());
			
			BufferedReader br = new BufferedReader(fr);
			int count = 0;
			System.out.println("Enter character to count");
			String check = sc.next().toLowerCase();
			Pattern p = Pattern.compile(check);
			Pattern p2 = Pattern.compile(check.toUpperCase());
			
			String string = br.readLine();
			
			while(string != null) {
				
				Matcher m = p.matcher(string);
				Matcher m2 = p2.matcher(string);
				while(m.find()||m2.find()) {
					count++;
				}
				
				string = br.readLine();
			}
			
			
			
			System.out.println(count);
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sc.close();
	}

}
