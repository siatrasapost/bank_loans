package com.siatrasapost.demo_bank.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@EnableWebSecurity
//@EnableGlobalMethodSecurity
@Configuration
public class WebSecurity{ // extends WebSecurityConfigurerAdapter

    @Bean
    public PasswordEncoder passwordEncoder(){return new BCryptPasswordEncoder();}

}
