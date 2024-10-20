package com.morimorig3.learningSpringApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class sha256PasswordEncoder implements PasswordEncoder{
    public String encode(String rawPassword) {
        System.out.println("sha256PasswordEncoder Encode");
        return null;
    }
}
