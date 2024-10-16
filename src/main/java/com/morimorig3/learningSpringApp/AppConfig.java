package com.morimorig3.learningSpringApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.morimorig3.learningSpringApp") // コンポーネントスキャンで@Componentが付与されているクラスをDIコンテナに登録する
public class AppConfig {
//    @Bean
//    UserRepository userRepository(){
//        return new UserRepositoryImpl();
//    }
//    @Bean
//    PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    UserService userService(){
//        return new UserServiceImpl(userRepository(),passwordEncoder());
//    }
}
