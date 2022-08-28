package com.capstone.soar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.soar.entity.Employee;
import com.capstone.soar.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	 
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee)  {
		return service.saveEmployee(employee);
	}
	
	@GetMapping("/employeeById/{empid}")
	public Employee findEmployeeById(@PathVariable int empid) {
		return service.getEmployeeById(empid);
	}
	
	@GetMapping("/employee/{empName}")
	public Employee findEmployeeByName(@PathVariable String empName) {
		return service.getEmployeeByName(empName);
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee)  {
		return service.updateEmployee(employee);
	}
	
	@DeleteMapping("/delete/{empid}")
	public void deleteEmployee(@PathVariable int empid) {
		service.deleteEmployee(empid);
//		System.out.println("Deleted");
	}
}
