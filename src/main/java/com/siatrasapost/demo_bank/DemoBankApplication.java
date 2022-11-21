package com.siatrasapost.demo_bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class DemoBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoBankApplication.class, args);
    }

}
