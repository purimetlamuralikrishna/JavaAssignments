package com.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main2 {

	public static void main(String[] args) throws Exception {
		
		Student student = new Student(123, "Murali",new Address("AP","Kurnool","518347"),"murali.gmail.com","123456");
		
		FileOutputStream of = new FileOutputStream("student.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(of);
		
		oos.writeObject(student);
		
		oos.close();
		
		FileInputStream fi = new FileInputStream("student.txt");
		ObjectInputStream ois = new ObjectInputStream(fi);
		
		Student s = (Student)ois.readObject();
		
		System.out.println(s.toString());
		
		ois.close();
		System.out.println("success");
		
	}

}
