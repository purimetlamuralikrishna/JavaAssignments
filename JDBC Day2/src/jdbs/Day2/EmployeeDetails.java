package jdbs.Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeDetails {

public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		}
		
		

		String sc = "jdbc:mysql://localhost:3306/db2";
		
		try(Connection conn =  DriverManager.getConnection(sc, "root","Veni33@sai")) {
			
			try {
				int empID = input.nextInt();
				PreparedStatement pr =  conn.prepareStatement("select * from employee where eid =?");
				
				pr.setInt(1, empID);
				ResultSet result =  pr.executeQuery();
				if(result.next()) {
					System.out.println("Employee ID is: "+result.getInt("eid"));
					System.out.println("Employee Name is: "+result.getString("name"));
					System.out.println("Employee Address is: "+result.getString("address"));
					System.out.println("Employee salary is: "+result.getInt("salary"));
				}
				else {
					System.out.println("Invalid Employee ID");
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid Input");
			}
		}
		 catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		input.close();
	}
	


}
