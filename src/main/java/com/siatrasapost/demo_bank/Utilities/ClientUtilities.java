package com.siatrasapost.demo_bank.Utilities;

import com.siatrasapost.demo_bank.dtos.GetClientDTO;
import com.siatrasapost.demo_bank.dtos.RegisterClientDTO;
import com.siatrasapost.demo_bank.entities.Client;

public class ClientUtilities {

    public static GetClientDTO clientToGetClientDtoConverter(Client client){
        return new GetClientDTO(client.getFull_name(),
                client.getNationality(),
                client.getGender(),
                client.getBirth_date(),
                client.getAnnual_income(),
                client.getBalance(),
                client.getUsername(),
                client.getRole());
    }

    public static Client registerClientDtoToClientConverter(RegisterClientDTO registerClientDTO){
        var client = new Client();
        client.setFull_name(registerClientDTO.full_name());
        client.setNationality(registerClientDTO.nationality());
        client.setGender(registerClientDTO.gender());
        client.setBirth_date(registerClientDTO.birth_date());
        client.setAnnual_income(registerClientDTO.annual_income());
        client.setBalance(0);
        client.setUsername(registerClientDTO.username());
        client.setPassword(registerClientDTO.password());
        return client;
    }
}
