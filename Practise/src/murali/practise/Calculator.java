package murali.practise;

public class Calculator {
	
	public void fun() {
		
		String tname = Thread.currentThread().getName();
		
		for(int x=0;x<10;x++) {
			System.out.println(tname+" "+x);
		}
		
	}
}
