package com.siatrasapost.demo_bank.bank_officer;

import javax.persistence.*;

@Entity
@Table
public class BankOfficer {
    @Id
    @SequenceGenerator(
            name = "client_sequence",
            sequenceName = "client_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "client_sequence"
    )
    //@Id
    //@GeneratedValue(generator = "UUID")
    //@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private Long id;
    private String username;
    private String password;

    public BankOfficer() {}

    public BankOfficer(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public BankOfficer(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
