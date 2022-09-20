package JDBC.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpSalary {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		}
		
		

		String sc = "jdbc:mysql://localhost:3306/db1";
		
		try(Connection conn =  DriverManager.getConnection(sc, "root","Veni33@sai")) {
			
			try {
				int empID = input.nextInt();
				Statement st =  conn.createStatement();
			
				ResultSet result =  st.executeQuery("select salary from employee where eid ="+empID+";");
				if(result.next()) {
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
