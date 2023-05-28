package com.petshop.jwt.payload;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserEditUserPayload {

    private String password;

    private String city;

    private String neighborhood;

    private String complement;


    public static UserEditUserPayload fixPayload(UserEditAdminPayload payload) {
        UserEditUserPayload p = new UserEditUserPayload();
        p.setPassword(payload.getPassword());
        p.setCity(payload.getCity());
        p.setNeighborhood(payload.getNeighborhood());
        p.setPassword(payload.getPassword());
        return p;
    }
}
