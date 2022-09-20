package murali.practise;

public class Demo {

	public static void main(String[] args) {
		
		Intr i1 = new Intr() {
			public void sayHello(String str){
				System.out.println(str);
			}
		};
		
		i1.sayHello("Murali");
	}

}
