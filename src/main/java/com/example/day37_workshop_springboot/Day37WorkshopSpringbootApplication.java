package com.example.day37_workshop_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.day37_workshop_springboot.model.Users;
import com.example.day37_workshop_springboot.service.UserService;

@SpringBootApplication
public class Day37WorkshopSpringbootApplication{

	public static void main(String[] args) {
		SpringApplication.run(Day37WorkshopSpringbootApplication.class, args);
	}

	@Autowired
	private UserService svc;

	// @Override
	// public void run(String... args) throws Exception {

	// 	svc.makeOrder(Users user, null)
		

	// }

}
