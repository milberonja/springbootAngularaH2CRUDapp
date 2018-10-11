package com.milan.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.milan.crudapp.entities.User;
import com.milan.crudapp.repositories.UserRepository;

@SpringBootApplication
public class SpringbootAngularCruDappApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAngularCruDappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("prvi", "Jedan"));
		userRepository.save(new User("drugi", "Dva"));
		userRepository.save(new User("treci", "Tri"));
		
	}
}
