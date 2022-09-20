package murali.practise;

public class Employee {

	String name;
	int id;
	final double salary;
	Address adderss = new Address();
	
	
	

	public double getSalary() {
		return salary;
	}

	public Employee(String name, int id, double salary, Address adderss) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.adderss = adderss;
	}

	public void print(String name,String...string) {
		
		String msg = name;
		for(String s:string) {
			msg += s;
		}
		System.out.println(msg);
		
	}
	 
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
}
