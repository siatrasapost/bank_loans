package com.siatrasapost.demo_bank.repositories;

import com.siatrasapost.demo_bank.entities.Loans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loans, Long> {
}
