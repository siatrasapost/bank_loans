package com.siatrasapost.demo_bank.services;

import com.siatrasapost.demo_bank.entities.Loans;
import com.siatrasapost.demo_bank.repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoansService {

    private final LoanRepository loanRepository;

    @Autowired
    public LoansService(LoanRepository loanRepository){
        this.loanRepository = loanRepository;
    }

    public List<Loans> getLoans(){
        return loanRepository.findAll();
    }
}
