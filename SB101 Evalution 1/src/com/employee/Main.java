package com.employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		
		File f = new File("emp.txt");
		
		Employee employee = new Employee("123","Murali",new Address("Andhra","Kurnool","08523"),"murali.com","123456");
		
		
		
		try {
			f.createNewFile();
			
			FileOutputStream fo = new FileOutputStream(f);
			
			ObjectOutputStream oos = new ObjectOutputStream(fo);
			
			oos.writeObject(employee);
			
			FileInputStream fi = new FileInputStream("emp.txt");
			
			ObjectInputStream ooi = new ObjectInputStream(fi);
			
			Employee list = (Employee)ooi.readObject();
			
			System.out.println(list);
			oos.close();
			ooi.close();
			System.out.println("Done....");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
