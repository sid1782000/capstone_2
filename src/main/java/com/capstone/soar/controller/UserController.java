package com.capstone.soar.controller;

import com.capstone.soar.entity.User;
import com.capstone.soar.services.UserService;
import com.capstone.soar.entity.UserRole;
import com.capstone.soar.entity.Role;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserService userService;
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		Set<UserRole> roles= new HashSet<>();
		Role role = new Role();
		role.setRoleId((long) 45);
		role.setRole("Manager");
		UserRole userRole=new UserRole();
		userRole.setUser(user);
		userRole.setRole(role);
		roles.add(userRole);
		return this.userService.createUser(user, roles);
		
	}
	@GetMapping("/{name}")
	public User getUser(@PathVariable("name") String name) {
		return this.userService.getUser(name);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		this.userService.deleteUser(id);
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return this.userService.updateUser(user);
		
	}
	
	
	
}
