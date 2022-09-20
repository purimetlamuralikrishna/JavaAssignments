package dao.pattern.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadDriver {

	public static Connection db3Connection() {
		
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

		String sc = "jdbc:mysql://localhost:3306/db3";
		
		try{
			conn =  DriverManager.getConnection(sc, "root","Veni33@sai");
		}
		catch(SQLException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return conn;
	}
	
}
