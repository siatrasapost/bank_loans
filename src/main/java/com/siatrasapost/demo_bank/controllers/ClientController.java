package com.siatrasapost.demo_bank.controllers;

import com.siatrasapost.demo_bank.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @PostMapping
    public void registerNewClient(){}

    @PutMapping(path = "{clientId}")
    public void updateClient(
        @PathVariable("clientId") Long clientId,
        @RequestParam(required = false) String name
    ){}
}
