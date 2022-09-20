package xinterface.xyz;

public interface X {

		abstract void abstractMethodX();
		
	 	default void defaultMethodX() {
	 		System.out.println("This is x default Method");
	 	}
	 	static void staticMethodX(){
	 		System.out.println("This is x static Method");
	 	}
}
