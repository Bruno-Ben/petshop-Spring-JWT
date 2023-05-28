package com.petshop.jwt.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository  extends JpaRepository<Service, Integer> {
}
