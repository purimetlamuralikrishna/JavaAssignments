package com.employee.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.models.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
