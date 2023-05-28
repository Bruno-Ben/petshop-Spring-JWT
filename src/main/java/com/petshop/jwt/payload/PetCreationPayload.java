package com.petshop.jwt.payload;

import lombok.Data;

import java.time.LocalDate;


@Data
public class PetCreationPayload {

    private String name;

    private LocalDate birthDate;

    private String race;

}
