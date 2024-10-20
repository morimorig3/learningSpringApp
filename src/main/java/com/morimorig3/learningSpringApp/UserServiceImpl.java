package com.morimorig3.learningSpringApp;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    public void register() {
        // AOP: Before Advice
        // AOP: Around Advice
        userRepository.userByUsername("execute register!!");
        passwordEncoder.encode("test");
        // AOP: After Returning Advice
        // AOP: After Throwing Advice
        // AOP: After Advice
        // AOP: Around Advice
    }
}
