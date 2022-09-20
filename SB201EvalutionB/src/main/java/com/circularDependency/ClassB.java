package com.circularDependency;

public class ClassB {

	ClassA a;

	public void setA(ClassA a) {
		this.a = a;
	}

	public ClassB() {
		super();
	}
	
	public void printMsg() {
		System.out.println("This is message from B class");
		System.out.println("Hello World");
	}
}
