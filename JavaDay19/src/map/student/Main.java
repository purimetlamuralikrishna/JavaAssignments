package map.student;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
	
	static int x = 10;

	public static void main(String[] args) {
		
		Map<String,Student> students = new HashMap<>();
		
		students.put("Hyd",new Student(123,"Murali",580));
		students.put("Delhi",new Student(124,"Krishna",600));
		students.put("Bangloare",new Student(125,"Sai",900));
		students.put("pune",new Student(126,"Kittu",800));
		
		List<Map.Entry<String,Student>> studentsList = new LinkedList<>(students.entrySet());
		
		
		Collections.sort(studentsList,(s1,s2)-> s1.getValue().getMarks() > s2.getValue().getMarks() ? +1:-1);
		
		System.out.println(studentsList);
		
		for(Map.Entry<String,Student> details:studentsList) {
			
			System.out.println(details.getKey());
			System.out.println("---------------");
			System.out.println(details.getValue().marks);
			System.out.println(details.getValue().name);
			System.out.println(details.getValue().roll);
			System.out.println("================");
			
		}

	}

}
