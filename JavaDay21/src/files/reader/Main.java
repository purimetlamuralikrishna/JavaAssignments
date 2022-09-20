package files.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		
				
		try {
			
			File file = new File("abc.txt");
			file.createNewFile();
			
			FileWriter fw = new FileWriter(file);
			fw.write("Hello");
			fw.write("\n");
			fw.write("My Name is Murali");
			fw.close();
			
			
			BufferedReader f = new BufferedReader(new FileReader("abc.txt"));
			
			String s = f.readLine();
			while(s != null) {
				System.out.println(s);
				s = f.readLine();
			}
			f.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
