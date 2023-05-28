package com.petshop.jwt.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface RaceRepository extends JpaRepository<Race, Integer> {

    @Query(value = """
            select r from Race r\s
            where r.description = :description\s
            """)
    Race getByName(String description);
}
