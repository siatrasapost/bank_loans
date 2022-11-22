package com.siatrasapost.demo_bank.services;

import com.siatrasapost.demo_bank.dtos.ClientDTO;
import com.siatrasapost.demo_bank.entities.Client;
import com.siatrasapost.demo_bank.repositories.ClientRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepository clientRepository;
    private final PasswordEncoder passwordEncoder;

    public ClientService(ClientRepository clientRepository, PasswordEncoder passwordEncoder){

        this.clientRepository = clientRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public List<Client> getClients(){
        return clientRepository.findAll();
    }

    public ClientDTO getOneClient(Long clientId){return ClientDTO.singleClientDto(clientRepository.findById(clientId));}

    public void deleteClientById(Long clientId) {
        this.clientRepository.deleteById(clientId);
    }

    public ClientDTO setClient(ClientDTO newClient){
        var client = new Client(newClient);
        client.setPassword(passwordEncoder.encode(newClient.password()));

        try{
            clientRepository.save(client);
            return ClientDTO.clientDtoConverter(client);
        }
        catch(DataIntegrityViolationException e){
            throw new DuplicateKeyException("Cannot have more than 1 user with this username");
        }
    }


}
