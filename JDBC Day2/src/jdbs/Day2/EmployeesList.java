package jdbs.Day2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeesList {

public static void main(String[] args) {
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		}
		
		

		String sc = "jdbc:mysql://localhost:3306/db2";
		
		try(Connection conn =  DriverManager.getConnection(sc, "root","Veni33@sai")) {
			
				PreparedStatement pr =  conn.prepareStatement("select * from employee;");
			
				ResultSet result =  pr.executeQuery();
				while(result.next()) {
					System.out.println("Employee ID is: "+result.getInt("eid"));
					System.out.println("Employee Name is: "+result.getString("name"));
					System.out.println("Employee Address is: "+result.getString("address"));
					System.out.println("Employee salary is: "+result.getInt("salary"));
					System.out.println("==================================================");
				}
		}
		 catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	


}
