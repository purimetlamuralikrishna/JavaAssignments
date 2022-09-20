package collection.employee;

public class Employee implements Comparable<Employee> {

	int empId;
	String empName;
	double empSalary;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public int compareTo(Employee emp) {
		
		if(this.getEmpSalary()>emp.getEmpSalary()) {
			return +1;
		}
		else if(this.getEmpSalary()<emp.getEmpSalary()) {
			return -1;
		}		
		return 0;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
	
}
