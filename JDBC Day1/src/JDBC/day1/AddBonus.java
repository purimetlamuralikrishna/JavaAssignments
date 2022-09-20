package JDBC.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddBonus {

	public static void main(String[] args) {
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		}
		
		

		String sc = "jdbc:mysql://localhost:3306/db1";
		
		try(Connection conn =  DriverManager.getConnection(sc, "root","Veni33@sai")) {
				
				Statement st =  conn.createStatement();
				
				int i = st.executeUpdate("update employee set salary = salary+500");
				
				if(i!=0) {
					System.out.println("Added 500 Bonus to Every Employee");
				}
		}
		 catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
