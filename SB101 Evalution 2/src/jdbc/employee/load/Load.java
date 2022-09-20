package jdbc.employee.load;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Load {

	public static Connection getDb1connection() {
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String path = "jdbc:mysql://localhost:3306/db1";
		
		try {
			conn =  DriverManager.getConnection(path,"root","Veni33@sai");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
		
	}
}
