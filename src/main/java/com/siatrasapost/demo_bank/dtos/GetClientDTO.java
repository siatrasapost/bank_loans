package com.siatrasapost.demo_bank.dtos;

import com.siatrasapost.demo_bank.entities.Client;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Optional;

public record GetClientDTO(String full_name,
                           String nationality,
                           String gender,
                           LocalDate birth_date,
                           Integer annual_income,
                           Integer balance,
                           String username,
                           String role){

}
