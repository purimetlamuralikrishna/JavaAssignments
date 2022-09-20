package member.inheritance;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
// -----------Creating employee1 Object with Employee Class and assigning values using getter,setter methods------
		
		Employee employee1 = new Employee();
		
		employee1.setName("Murali");
		employee1.setAge(28);
		employee1.setPhoneNumber("98996589778");
		employee1.setAddress("Kurnool");
		employee1.setSalary(23000.25);
		employee1.setSpecialisation("Backend");
		employee1.setDepartment("Development");
		employee1.printSalary();
		
		
// --Creating manager Object with Manager Class and assigning values by using constructer function--
		
		Manager manager = new Manager("Krishna",27,"8594784585","Kurnool",28000.56,"FWD","Developement");
		manager.printSalary();
	}

}
