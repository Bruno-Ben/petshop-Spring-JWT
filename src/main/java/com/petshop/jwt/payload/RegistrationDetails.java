package com.petshop.jwt.payload;

import lombok.Data;

@Data
public class RegistrationDetails {

    private String email;

    private String phone;

    private String city;

    private String neighborhood;

    private String complement;

}
