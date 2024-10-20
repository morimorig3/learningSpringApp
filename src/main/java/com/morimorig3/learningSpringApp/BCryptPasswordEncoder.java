package com.morimorig3.learningSpringApp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("lightWeight")
public class BCryptPasswordEncoder implements PasswordEncoder{
    public String encode(String rawPassword) {
        System.out.println("BCryptPasswordEncoder Encode");
        return null;
    }
}
