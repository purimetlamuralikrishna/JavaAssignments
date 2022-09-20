package parent.override;


public class Parent {
	
		
		final int number;
		
		public Parent(int n){
			this.number = n;
		}

		void method1() {
			System.out.println("This is Parent class method1 and final number is: "+number);
			
		}
		void method2() {
			System.out.println("This is Parent class method2");
		}
		void method3() {
			System.out.println("This is Parent class method3");
		}
}
