package com.siatrasapost.demo_bank.entities;

import com.siatrasapost.demo_bank.dtos.GetClientDTO;
import com.siatrasapost.demo_bank.enums.Role;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "client")
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
    private Integer annual_income, balance;
    private String username;
    private String password;
    private String role;
    @OneToMany(targetEntity = Loans.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private List<Loans> loans;

    public Client(){}

    public Client(Long id, String full_name, String nationality, String gender, LocalDate birth_date, Integer annual_income, Integer balance, String username, String password, String role) {
        this.id = id;
        this.full_name = full_name;
        this.nationality = nationality;
        this.gender = gender;
        this.birth_date = birth_date;
        this.annual_income = annual_income;
        this.balance = balance;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public Integer getAnnual_income() {
        return annual_income;
    }

    public void setAnnual_income(Integer annual_income) {
        this.annual_income = annual_income;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Loans> getLoans() {
        return loans;
    }

    public void setLoans(List<Loans> loans) {
        this.loans = loans;
    }
}
