package files.reader;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("abc.txt");
			
			long l = file.length();
			
			
			FileReader fr = new FileReader(file);
			
			char[] ch = new char[(int)l];
			
			fr.read(ch);
			
			System.out.println(ch);
			
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
