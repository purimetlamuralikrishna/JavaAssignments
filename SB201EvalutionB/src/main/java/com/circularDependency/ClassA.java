package com.circularDependency;

public class ClassA {

	ClassB b;

	public ClassA(ClassB b) {
		super();
		this.b = b;
	}

	public ClassA() {
		super();
	}
	
	public void printMsg() {
		b.printMsg();
	}
	
	
}
