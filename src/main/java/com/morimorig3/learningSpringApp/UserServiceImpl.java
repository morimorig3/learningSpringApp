package com.morimorig3.learningSpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    @Qualifier("lightWeight")
    PasswordEncoder passwordEncoder;

    public void register(){
        userRepository.userByUsername("execute register!!");
        passwordEncoder.encode("test");
    }
}
