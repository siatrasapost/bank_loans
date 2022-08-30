package com.siatrasapost.demo_bank.bank_officer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users/bank_officer")
public class BankOfficerController {

    private final BankOfficerService bankOfficerService;

    @Autowired
    public BankOfficerController(BankOfficerService bankOfficerService){
        this.bankOfficerService = bankOfficerService;
    }

    @GetMapping
    public List<LoanRequest> getLoanRequests(){
        return bankOfficerService.getLoanRequests();
    }
}
