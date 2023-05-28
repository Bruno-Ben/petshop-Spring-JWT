package com.petshop.jwt.payload;

import lombok.Data;

@Data
public class UserEditAdminPayload {

    private String cpf;

    private String password;

    private String email;

    private String phone;

    private String city;

    private String neighborhood;

    private String complement;

    private String petName;
}
