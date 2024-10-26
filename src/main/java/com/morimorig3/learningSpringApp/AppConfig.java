package com.morimorig3.learningSpringApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.morimorig3.learningSpringApp") // コンポーネントスキャンで@Componentが付与されているクラスをDIコンテナに登録する
public class AppConfig {
//    @Bean
//    JdbcTemplate jdbcTemplate(DataSource dataSource){
//        System.out.println(dataSource);
//        return new JdbcTemplate(dataSource);
//    }
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
