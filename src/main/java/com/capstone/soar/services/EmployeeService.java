package com.capstone.soar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.capstone.soar.entity.Employee;
import com.capstone.soar.repository.EmployeeRepository;
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	 
	public Employee saveEmployee(@RequestBody Employee employee)  {
		return this.repository.save(employee);
	}
	
	public Employee getEmployeeById(int empid) {
		return repository.findById(empid).orElse(null);
	}
	public Employee getEmployeeByName(String empname) {
		return repository.findByEmpname(empname);
	}
	public void deleteEmployee(int empid) {
		repository.deleteById(empid);;
//		return "employee removed !!"+ empid;
	}
	public Employee updateEmployee(Employee employee) {
		Employee existingEmployee = repository.findById(employee.getEmpid()).orElse(null);
		existingEmployee.setEmpname(employee.getEmpname());
		existingEmployee.setEmpid(employee.getEmpid());
		existingEmployee.setEmpemail(employee.getEmpemail());
		existingEmployee.setPassword(employee.getPassword());
		return repository.save(existingEmployee);
		
	}
}
