package com.morimorig3.learningSpringApp;

import javax.sql.DataSource;

public class JdbcUserRepository implements UserRepository {
    public JdbcUserRepository(DataSource dataSource){}
    public User userByUsername(String username){
        return new User();
    };
}
