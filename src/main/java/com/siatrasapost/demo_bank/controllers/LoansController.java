package com.siatrasapost.demo_bank.controllers;

import com.siatrasapost.demo_bank.entities.Loans;
import com.siatrasapost.demo_bank.services.LoansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/user/loans")
public class LoansController {

    private LoansService loansService;

    @Autowired
    public LoansController(LoansService loansService){
        this.loansService = loansService;
    }

    @GetMapping
    public List<Loans> getLoans(){
        return getLoans();
    }

}
