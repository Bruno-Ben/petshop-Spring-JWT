package com.petshop.jwt.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Client client;

    private String street;

    private String city;

    private String neighborhood;

    private String complement;
}
