package com.morimorig3.learningSpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringAppApplication.class, args);
		// インターフェースを外から渡す形にすることで、他クラスへの依存度が下がる
		UserRepository userRepository = new DummyUserRepository();
		PasswordEncoder passwordEncoder = new DummyPasswordEncoder();
		UserServiceImpl userService = new UserServiceImpl(userRepository, passwordEncoder);
	}
}
