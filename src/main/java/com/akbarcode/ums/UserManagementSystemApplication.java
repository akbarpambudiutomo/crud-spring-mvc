package com.akbarcode.ums;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.akbarcode.ums.entity.User;
import com.akbarcode.ums.repository.UserRepository;

@SpringBootApplication
public class UserManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(UserManagementSystemApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		
//		User user1 = new User(null, "Akbar", "Pambudi", "akbar@indopay.com");
//		userRepository.save(user1);
//		
//		User user2 = new User(null, "Pandu", "Widyaksono", "pandu@indopay.com");
//		userRepository.save(user2);
//		
//		User user3 = new User(null, "Riezky", "Maiysar", "riezky@indopay.com");
//		userRepository.save(user3);
		
	}
}
