package com.morimorig3.learningSpringApp;

public interface UserRepository {
    User userByUsername(String username);
}
