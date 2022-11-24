package com.siatrasapost.demo_bank.controllers;

import com.siatrasapost.demo_bank.dtos.GetClientDTO;
import com.siatrasapost.demo_bank.dtos.RegisterClientDTO;
import com.siatrasapost.demo_bank.services.ClientService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class ClientController {

    private final ClientService clientService;

    ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @GetMapping("/")
    public List<GetClientDTO> getClients(){
        return clientService.getClients();
    }

    @GetMapping(path = "/{clientId}")
    public GetClientDTO getClient(@PathVariable Long clientId){
        return clientService.getClient(clientId);
    }

    @PostMapping(path = "/")
    public void createClient(@RequestBody @Validated RegisterClientDTO newClient){
        clientService.createClient(newClient);
    }

    @PatchMapping(path = "/{clientId}")
    public GetClientDTO updateClient(@PathVariable("clientId") Long clientId, @RequestBody RegisterClientDTO registerClientDTO) {
        return clientService.updateClient(clientId, registerClientDTO);
    }

    @DeleteMapping("/{clientId}")
    public void deleteClient(@PathVariable Long clientId){
        clientService.deleteClient(clientId);
    }
}
