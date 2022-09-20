package com.employee;

import java.io.Serializable;

public class Employee implements Serializable {
	    String empId;
	    String empName;
	    Address address;
		String email;
		transient String password;
		public Employee(String empId, String empName, Address address, String email, String password) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.address = address;
			this.email = email;
			this.password = password;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + ", email=" + email
					+ "]";
		}
		
		
		
		
}
