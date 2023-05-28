package com.petshop.jwt.pet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface PetRepository extends JpaRepository<Pet, Integer> {

    @Query(value = """
            select p from Pet p inner join Client c\s
            on p.client.id = c.id\s
            where p.client.id = :client_id\s
            """)
    List<Pet> getAllPetsFromClient(Integer client_id);
}
