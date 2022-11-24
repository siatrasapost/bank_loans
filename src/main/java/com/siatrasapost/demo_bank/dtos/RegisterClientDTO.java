package com.siatrasapost.demo_bank.dtos;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public record RegisterClientDTO(@NotBlank String full_name,
                                String nationality,
                                String gender,
                                LocalDate birth_date,
                                Integer annual_income,
                                @NotBlank String username,
                                @NotBlank String password) {
}
