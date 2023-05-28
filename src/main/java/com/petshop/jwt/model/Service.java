package com.petshop.jwt.model;

import com.petshop.jwt.pet.Pet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Service {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name="pet_id")
    private Pet pet;

    private String serviceDescription;

    private Double value;

    private LocalDate date;

}
