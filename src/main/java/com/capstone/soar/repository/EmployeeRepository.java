package com.capstone.soar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.soar.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	Employee findByEmpname(String empname);
}
