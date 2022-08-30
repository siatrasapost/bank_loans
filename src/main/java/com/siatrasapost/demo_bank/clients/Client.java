package com.siatrasapost.demo_bank.clients;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Client {
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
    private String full_name, nationality, gender;
    private LocalDate birth_date;
    private Integer annual_income;
    private String username;
    private String password;

    public Client(){}

    public Client(Long id, String full_name, String nationality, String gender, LocalDate birth_date, Integer annual_income, String username, String password) {
        this.id = id;
        this.full_name = full_name;
        this.nationality = nationality;
        this.gender = gender;
        this.birth_date = birth_date;
        this.annual_income = annual_income;
        this.username = username;
        this.password = password;
    }

    public Client(String full_name, String nationality, String gender, LocalDate birth_date, Integer annual_income, String username, String password) {
        this.full_name = full_name;
        this.nationality = nationality;
        this.gender = gender;
        this.birth_date = birth_date;
        this.annual_income = annual_income;
        this.username = username;
        this.password = password;
    }
}
