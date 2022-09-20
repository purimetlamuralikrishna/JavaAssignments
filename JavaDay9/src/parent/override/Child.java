package parent.override;

final class Child extends Parent {	
	
	
	
	
	 Child(int n) {
		super(n);
	}

	@Override
	void method1() {
		System.out.println("This is child class method1 and final number is: "+number);
	}
	
	void method4() {
		System.out.println("This is Childe class Method4");
	}
	
}