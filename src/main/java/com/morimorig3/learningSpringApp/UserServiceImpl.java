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

    public void register(){
        log.info("registerメソッド開始: UserServiceImpl.register");// 冗長なログの仮実装例
        userRepository.userByUsername("execute register!!");
        passwordEncoder.encode("test");
        log.info("registerメソッド終了: UserServiceImpl.register");
    }
}
