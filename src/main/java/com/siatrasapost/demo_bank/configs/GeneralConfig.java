package com.siatrasapost.demo_bank.configs;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class GeneralConfig {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
