
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;


public class Main {

	public static void main(String[] args) throws IOException {
		
		File f = new File("abc.txt");
		f.createNewFile();
		
		Path p = Paths.get("abc.txt");
		String msg="welcome to java";
		Files.write(p, msg.getBytes());
		
		
		
		
		List<String> str = Files.readAllLines(p);
		
		System.out.println(str.size());
		
		for(String s:str) {
			System.out.println(s);
		}
	}

}

