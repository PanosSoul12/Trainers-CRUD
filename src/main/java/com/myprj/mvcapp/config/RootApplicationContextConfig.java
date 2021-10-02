
package com.myprj.mvcapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.myprj.mvcapp")
@PropertySource(value={"classpath:application.properties"})
public class RootApplicationContextConfig {
    
     @Autowired
    Environment environment;
    
    @Bean
    public NamedParameterJdbcTemplate getJdbcTemplate(){
    
        DriverManagerDataSource dataSource = 
                new DriverManagerDataSource();
        
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        
    

        
        return new NamedParameterJdbcTemplate(dataSource);
    }
        
          @Bean
    public JdbcTemplate getJdbcTemplateADD(){
    
        DriverManagerDataSource dataSource = 
                new DriverManagerDataSource();
        
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        
    

        
        return new JdbcTemplate(dataSource);
    }
    
}
