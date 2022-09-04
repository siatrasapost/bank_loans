package com.siatrasapost.demo_bank.entities;

import javax.persistence.*;

@Entity
@Table(name = "loan_requests")
public class Loans {
    @Id
    @SequenceGenerator(
            name = "loan_sequence",
            sequenceName = "loan_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "loan_sequence"
    )
    //@Id
    //@GeneratedValue(generator = "UUID")
    //@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private Long id;
    private Long customer_id;
    private Integer loan_amount;
    private Boolean accepted;

    public Loans() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getLoan_amount() {
        return loan_amount;
    }

    public void setLoan_amount(Integer loan_amount) {
        this.loan_amount = loan_amount;
    }

    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }
}
