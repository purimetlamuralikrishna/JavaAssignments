package jdbc.employee.employeeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.employee.load.Load;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String saveEmployeeDetails(Employee employee) {
		
		String result="Not Updated....";
		
		try(Connection conn = Load.getDb1connection()){
			
		PreparedStatement pr = conn.prepareStatement("insert into employee values(?,?,?,?);");
		
		pr.setInt(1,employee.getEid());
		pr.setString(2,employee.getName());
		pr.setString(3,employee.getAddress());
		pr.setInt(4,employee.getSalary());
		
		int i =pr.executeUpdate();
		if(i != 0) {
			result = "Updated Sucessfully....";
		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		
		Employee result= new Employee();
		
		try(Connection conn = Load.getDb1connection()){
			
		PreparedStatement pr = conn.prepareStatement("select * from employee where eid = ?;");
		
		pr.setInt(1,empId);
		
		ResultSet r =pr.executeQuery();
		if(r.next()) {
			result.setEid(r.getInt("eid"));
			result.setName(r.getString("name"));
			result.setAddress(r.getString("address"));
			result.setSalary(r.getInt("salary"));	
		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		List<Employee> result = new ArrayList<Employee>();
		
		
		
		try(Connection conn = Load.getDb1connection()){
			
		PreparedStatement pr = conn.prepareStatement("select * from employee;");
		
		
		ResultSet r =pr.executeQuery();
		while(r.next()) {
			Employee employee= new Employee();
			
			employee.setEid(r.getInt("eid"));
			employee.setName(r.getString("name"));
			employee.setAddress(r.getString("address"));
			employee.setSalary(r.getInt("salary"));	
			
			result.add(employee);
		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public String deleteEmployee(int empId) throws EmployeeException {
		
		String result="Not Deleted....";
		
		try(Connection conn = Load.getDb1connection()){
			
		PreparedStatement pr = conn.prepareStatement("delete from employee where eid = ?;");
		
		pr.setInt(1,empId);
		
		int i =pr.executeUpdate();
		if(i != 0) {
			result = "Deleted Sucessfully....";
		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}

}
