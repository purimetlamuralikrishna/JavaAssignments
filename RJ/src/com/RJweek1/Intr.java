package com.RJweek1;

public interface Intr extends Intr2 {
	
	
	void method2();
	
	default void method5() {
		System.out .println("Method5");
	}
}
