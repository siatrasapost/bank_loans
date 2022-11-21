package com.siatrasapost.demo_bank.repositories;

import com.siatrasapost.demo_bank.entities.Loans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loans, Long> {
}
