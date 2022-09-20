package jdbs.Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertWithoutAddress {

public static void main(String[] args) {
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		}
		
		

		String sc = "jdbc:mysql://localhost:3306/db2";
		
		try(Connection conn =  DriverManager.getConnection(sc, "root","Veni33@sai")) {
				
				PreparedStatement pr =  conn.prepareStatement("insert into employee(eid,name,salary)values(3,'sai',40000);");
				
				int i = pr.executeUpdate();
				
				if(i!=0) {
					System.out.println("Added Employee detailes without Address");
				}
		}
		 catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}


}
