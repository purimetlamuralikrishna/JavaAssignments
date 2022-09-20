package JDBC.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertWithoutAddress {

public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		}
		
		

		String sc = "jdbc:mysql://localhost:3306/db1";
		
		try(Connection conn =  DriverManager.getConnection(sc, "root","Veni33@sai")) {
				
				Statement st =  conn.createStatement();
				
				int i = st.executeUpdate("insert into employee(eid,name,salary)values(3,'sai',40000);");
				
				if(i!=0) {
					System.out.println("Added Employee detailes without Address");
				}
		}
		 catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
