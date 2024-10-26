package com.morimorig3.learningSpringApp;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class PoolingDataSourceConfig {
    @Bean(destroyMethod = "close")
    public DataSource dataSource(
            @Value("${database.driverClassName}") String driverClassName,
            @Value("${database.url}") String url,
            @Value("${database.username}") String username,
            @Value("${database.password}") String password,
            @Value("${cp.maxIdle}") int maxIdle,
            @Value("${cp.minIdle}") int minIdle,
            @Value("${cp.maxWaitMills}") long maxWaitMills){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDefaultAutoCommit(false);
        dataSource.setMaxIdle(maxIdle);
        dataSource.setMinIdle(minIdle);
        dataSource.setMaxWait(maxWaitMills);
        return dataSource;
    }
}
