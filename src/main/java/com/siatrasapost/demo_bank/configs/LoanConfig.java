package com.siatrasapost.demo_bank.configs;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoanConfig {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
