package com.morimorig3.learningSpringApp;

import javax.sql.DataSource;

public class DummyUserRepository implements UserRepository {
    public User userByUsername(String username){
        return new User();
    };
}
