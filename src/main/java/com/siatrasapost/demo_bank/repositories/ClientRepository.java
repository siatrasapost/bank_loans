package com.siatrasapost.demo_bank.repositories;

import com.siatrasapost.demo_bank.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
