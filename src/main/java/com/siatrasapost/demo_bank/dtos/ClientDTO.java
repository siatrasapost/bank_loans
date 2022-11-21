package com.siatrasapost.demo_bank.dtos;

import com.siatrasapost.demo_bank.entities.Client;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public record ClientDTO(Long id,
                        @NotBlank String full_name,
                        @NotBlank String nationality,
                        String gender,
                        LocalDate birth_date,
                        Integer annual_income,
                        @NotBlank Integer balance,
                        @NotBlank String username,
                        @NotBlank String password,
                        String role){

    public static ClientDTO clientDtoConverter(Client client) {
        return new ClientDTO(client.getId(),
                client.getFull_name(),
                client.getNationality(),
                client.getGender(),
                client.getBirth_date(),
                client.getAnnual_income(),
                client.getBalance(),
                client.getUsername(),
                client.getPassword(),
                client.getRole());
    }
}
