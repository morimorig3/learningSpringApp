package com.morimorig3.learningSpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LearningSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringAppApplication.class, args);
		// DIを利用することでこの実装でよくなる
		// 依存関係を記述するのはAppConfig.class
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserServiceImpl userService = context.getBean(UserServiceImpl.class);
		userService.register();
		UserServiceImpl userService2 = context.getBean(UserServiceImpl.class);
		userService2.register();
	}
}
