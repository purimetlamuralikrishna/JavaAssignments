package com.murali;

public class Demo {
	
	Demo(){
		this(25000.00f);
	}
	Demo(String s){
		System.out.println("Hiii");
		System.out.println("My name is "+ s);
	}
	Demo(int i){
		this("Murali");
		System.out.println("My Experence as engineer is "+ i);
	}
	Demo(float f){
		this(3);
		System.out.println("My salary package is "+f);
	}

	public static void main(String[] args) {
		
		new Demo();
		
	}

}
