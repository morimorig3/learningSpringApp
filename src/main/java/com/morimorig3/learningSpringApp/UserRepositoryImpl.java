package com.morimorig3.learningSpringApp;

import org.springframework.stereotype.Component;

@Component
public class UserRepositoryImpl implements UserRepository {
    public User userByUsername(String username){
        System.out.println(username);
        return new User();
    };
}
