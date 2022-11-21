package com.siatrasapost.demo_bank.controllers;

import com.siatrasapost.demo_bank.dtos.LoanDTO;
import com.siatrasapost.demo_bank.entities.Loans;
import com.siatrasapost.demo_bank.services.LoansService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/user/loans")
public class LoansController {

    private LoansService loansService;

//    "Field injection is not recommended" What should I do?
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    public LoansController(LoansService loansService){
        this.loansService = loansService;
    }

//    @GetMapping
//    @ResponseBody
//    public List<LoanDTO> getLoans(){
//        List<Loans> loans = loansService.getLoans();
//        return loans.stream()
//                .map(this::convertToDTO)
//                .collect(Collectors.toList());
//    }
//
//    private LoanDTO convertToDTO(Loans loan){
//        return modelMapper.map(loan, LoanDTO.class);
//    }
//
//    private Loans convertToEntity(LoanDTO loanDTO) throws ParseException{
//        Loans loan = modelMapper.map(loanDTO, Loans.class);
//        if (loanDTO.getId() != null){
//            Loans oldLoan = loansService.getLoanById(loanDTO.getId());
//            loan.setId(oldLoan.getId());
//        }
//        return loan;
//    }
}
