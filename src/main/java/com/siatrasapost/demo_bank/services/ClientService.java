package com.siatrasapost.demo_bank.services;

import com.siatrasapost.demo_bank.Utilities.ClientUtilities;
import com.siatrasapost.demo_bank.dtos.GetClientDTO;
import com.siatrasapost.demo_bank.dtos.RegisterClientDTO;
import com.siatrasapost.demo_bank.repositories.ClientRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {

    private final ClientRepository clientRepository;
    private final PasswordEncoder passwordEncoder;

    public ClientService(ClientRepository clientRepository, PasswordEncoder passwordEncoder){

        this.clientRepository = clientRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public GetClientDTO getClient(Long id){
        var client = clientRepository.findById(id);
        if (client.isPresent()){
            return ClientUtilities.clientToGetClientDtoConverter(client.get());
        }
        else{
            var errMsg = String.format("Client with id '%d' not found!", id);
            throw new EntityNotFoundException(errMsg);
        }
    }

    public List<GetClientDTO> getClients(){
        return clientRepository.findAll()
                .stream()
                .map(ClientUtilities::clientToGetClientDtoConverter)
                .collect(Collectors.toList());
    }

    public GetClientDTO updateClient(Long clientId, RegisterClientDTO registerClientDTO){
        var client = clientRepository.findById(clientId);
        if (client.isPresent()){
            client.get().setFull_name(registerClientDTO.full_name());
            client.get().setNationality(client.get().getNationality());
            client.get().setGender(client.get().getGender());
            client.get().setBirth_date(client.get().getBirth_date());
            client.get().setAnnual_income(registerClientDTO.annual_income());
            client.get().setUsername(client.get().getUsername());
            client.get().setPassword(registerClientDTO.password());
            clientRepository.save(client.get());
            return ClientUtilities.clientToGetClientDtoConverter(client.get());
        }
        else{
            throw new EntityNotFoundException("Can't find client with this id!");
        }

    }

    public void deleteClient(Long clientId) {
        clientRepository.deleteById(clientId);
    }

    public void createClient(RegisterClientDTO newClient){
        var client = ClientUtilities.registerClientDtoToClientConverter(newClient);
        client.setPassword(passwordEncoder.encode(newClient.password()));

        try{
            clientRepository.save(client);
        }
        catch(DataIntegrityViolationException e){
            throw new DuplicateKeyException("Cannot have more than 1 client with this username");
        }
    }


}
