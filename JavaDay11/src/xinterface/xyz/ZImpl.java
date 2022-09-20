package xinterface.xyz;

public class ZImpl implements Z {

	@Override
	public void abstractMethodX() {
		System.out.println("This is x abstract Method Overrided in ZImpl class");
	}
	
	@Override
	public void defaultMethodX(){
		System.out.println("This is X default Method Overrided in ZImpl class");
	}

	@Override
	public void abstractMethodY() {
		System.out.println("This is Y abstract Method Overrided in ZImpl class");
	}

	@Override
	public void abstractMethodZ() {
		System.out.println("This is Z abstract Method Overrided in ZImpl class");
	}

}
