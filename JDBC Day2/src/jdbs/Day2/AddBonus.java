package jdbs.Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddBonus {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		}
		
		

		String sc = "jdbc:mysql://localhost:3306/db2";
		
		try(Connection conn =  DriverManager.getConnection(sc, "root","Veni33@sai")) {
				
				PreparedStatement pr =  conn.prepareStatement("update employee set salary = salary+500");
				
				int i = pr.executeUpdate();
				
				if(i!=0) {
					System.out.println("Added 500 Bonus to Every Employee");
				}
		}
		 catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
