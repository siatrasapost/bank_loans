package com.siatrasapost.demo_bank.services;

import com.siatrasapost.demo_bank.entities.Client;
import com.siatrasapost.demo_bank.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public List<Client> getClients(){
        return clientRepository.findAll();
    }

}
