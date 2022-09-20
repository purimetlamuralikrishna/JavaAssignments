package com.initiliazation;

public class InitDestroy {

	Print p;

	
	public void start() {
		System.out.println("object is initialised");
		System.out.println("By "+ p.getName());
	}
	
	public void stop() {
		System.out.println("object is Destroyed");
	}
	
	public void fun() {
		System.out.println("This is a Method in InitDestroy Object");
	}
	
	public InitDestroy() {
		super();
	}

	public InitDestroy(Print p) {
		super();
		this.p = p;
	}

	public void setP(Print p) {
		this.p = p;
	}
	
	
	
	
	
}
