package com.siatrasapost.demo_bank.controllers;

import com.siatrasapost.demo_bank.dtos.ClientDTO;
import com.siatrasapost.demo_bank.entities.Client;
import com.siatrasapost.demo_bank.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/user")
public class ClientController {

    private final ClientService clientService;

    ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getClients(){
        return clientService.getClients();
    }

    @GetMapping(path = "/{clientId}")
    public ClientDTO getClientProfile(@PathVariable Long clientId){return clientService.getOneClient(clientId);}

    @PostMapping(path = "/create")
    public ClientDTO registerNewClient(@RequestBody @Validated ClientDTO newClient){return clientService.setClient(newClient);}

    @PutMapping(path = "/update/{clientId}")
    public void updateClient(
        @PathVariable("clientId") Long clientId,
        @RequestParam(required = false) String name
    ){}

    @DeleteMapping("/{clientId}")
    public void deleteClient(@PathVariable Long clientId){
        clientService.deleteClientById(clientId);
    }
}
