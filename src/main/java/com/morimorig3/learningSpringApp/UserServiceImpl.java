package com.morimorig3.learningSpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    @Qualifier("lightWeight")
    PasswordEncoder passwordEncoder;

    private String name;

    public void register(){
        if(name == null){
            name = "popopo";
            System.out.println(name);
        }
        userRepository.userByUsername("execute register!!");
        passwordEncoder.encode("test");
    }
}
