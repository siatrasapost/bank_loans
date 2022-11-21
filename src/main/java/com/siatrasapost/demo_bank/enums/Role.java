package com.siatrasapost.demo_bank.enums;

public enum Role {
    ADMIN("ADMIN"),
    USER("USER");

    public final String label;

    Role(String label){
        this.label = label;
    }

    @Override
    public String toString(){
        return this.label;
    }
}
