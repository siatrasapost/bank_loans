package com.siatrasapost.demo_bank.dtos;

import com.siatrasapost.demo_bank.entities.Client;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Optional;

public record ClientDTO(Long id,
                        @NotBlank String full_name,
                        @NotBlank String nationality,
                        String gender,
                        LocalDate birth_date,
                        Integer annual_income,
                        Integer balance,
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

    public static ClientDTO clientDtoConverter(Optional<Client> client) {
        return new ClientDTO(client.get().getId(),
                client.get().getFull_name(),
                client.get().getNationality(),
                client.get().getGender(),
                client.get().getBirth_date(),
                client.get().getAnnual_income(),
                client.get().getBalance(),
                client.get().getUsername(),
                client.get().getPassword(),
                client.get().getRole());
    }

    public static ClientDTO singleClientDto(Optional<Client> client) throws NullPointerException{
        try{
            return ClientDTO.clientDtoConverter(client);
        }
        catch (RuntimeException e) {
            throw new NullPointerException("There is not a user with this id!");
        }
    }
}
