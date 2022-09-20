package dao.pattern.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dao.pattern.driver.LoadDriver;

public class EmployeeDao implements EmployeeIntr {

	@Override
	public List<Employee> employeeList() {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		Connection conn = LoadDriver.db3Connection();
		
		try {
			PreparedStatement pr = conn.prepareStatement("select * from employee3");
			
			ResultSet result = pr.executeQuery();
			
			while(result.next()) {
				
				Employee emp = new Employee();
				
				
				emp.setEid(result.getInt("eid"));
				emp.setName(result.getString("name"));
				emp.setAddress(result.getString("address"));
				emp.setSalary(result.getInt("salary"));
				
				employees.add(emp);
				
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		return employees;
	}

	@Override
	public String addBonus(int bonus) {
		
		String rowsAffected = "Not Added...";
		
		Connection conn = LoadDriver.db3Connection();
		
		try {
			PreparedStatement pr = conn.prepareStatement("update employee3 set salary = salary+?");
			
			pr.setInt(1, bonus);
			int i = pr.executeUpdate();
			
			if(i!=0) {
				rowsAffected = "Bonus Added sucessfully...";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rowsAffected;
	}

	@Override
	public int getEmpSalary(int id) {
		
		int salary =0;
		
		Connection conn = LoadDriver.db3Connection();
		
		try {
			PreparedStatement pr = conn.prepareStatement("select salary from employee3 where eid=?");
			
			pr.setInt(1,id);
			ResultSet result  = pr.executeQuery();
			
			if(result.next()) {
				salary = result.getInt("salary");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return salary;
	}

	@Override
	public String insertWithoutAddress(int id, String name, int salary) {
		
		String result = "Not Inserted...";
		
		Connection conn = LoadDriver.db3Connection();
		
		try {
			PreparedStatement pr = conn.prepareStatement("insert into employee3(eid,name,salary) values(?,?,?)");
			
			pr.setInt(1,id);
			pr.setString(2,name);
			pr.setInt(3,salary);
			int i = pr.executeUpdate();
			
			if(i!=0) {
				result = "Inserted Successfully...";
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		return result;
	}

	@Override
	public Employee getEmpDetails(int id) {
		
		Employee emp = new Employee();
		
		Connection conn = LoadDriver.db3Connection();
		
		try {
			PreparedStatement pr = conn.prepareStatement("select * from employee3 where eid=?");
			
			pr.setInt(1,id);
			ResultSet result  = pr.executeQuery();
			
			if(result.next()) {
				emp.setSalary(result.getInt("salary"));
				emp.setEid(result.getInt("eid"));
				emp.setName(result.getString("name"));
				emp.setAddress(result.getString("address"));
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		return emp;
	}

	@Override
	public List<Employee> employeelistSalarylessthan(int salary) {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		Connection conn = LoadDriver.db3Connection();
		
		try {
			PreparedStatement pr = conn.prepareStatement("select * from employee3 where salary < ?");
			
			pr.setInt(1,salary);
			ResultSet result = pr.executeQuery();
			while(result.next()) {
				
				Employee emp = new Employee();
				
				emp.setEid(result.getInt("eid"));
				emp.setName(result.getString("name"));
				emp.setAddress(result.getString("address"));
				emp.setSalary(result.getInt("salary"));
				
				employees.add(emp);		
			}
			
			if(employees.isEmpty()) {
				System.out.println("No Data Found");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return employees;
	}

}
