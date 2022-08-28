package com.capstone.soar;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capstone.soar.entity.User;
import com.capstone.soar.services.UserService;

@SpringBootApplication
//@EnableJpaRepositories("com.capstone.soar.repository")
public class Soar2Application  {

//	@Autowired
//	private UserService userService;
//	@Autowired
//	private RoleRepository rolerepo;
	public static void main(String[] args) {
		SpringApplication.run(Soar2Application.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("hi");
//		User user = new User();
//		user.setName("Siddhesh");					implements CommandLineRunner
//		user.setEmail("sid@gmail.com");
//		user.setPassword("sid");
//		user.setType("dev");
		
//		Role role1=new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("Software Developer");
//	}
	
	
}
