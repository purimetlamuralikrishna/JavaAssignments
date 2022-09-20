package xinterface.xyz;

public class Demo {

	public static void main(String[] args) {
		
		ZImpl implemented = new ZImpl();
		
		implemented.abstractMethodX();
		implemented.abstractMethodY();
		implemented.abstractMethodZ();
		implemented.defaultMethodX();
		X.staticMethodX();
		Y.staticMethodY();

	}

}
