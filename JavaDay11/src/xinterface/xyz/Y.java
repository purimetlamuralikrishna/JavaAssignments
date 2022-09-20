package xinterface.xyz;

public interface Y  {
	
	abstract void abstractMethodY();
	
 	default void defaultMethodY() {
 		System.out.println("This is y default Method");
 	}
 	static void staticMethodY(){
 		System.out.println("This is Y static Method");
 	}
}
