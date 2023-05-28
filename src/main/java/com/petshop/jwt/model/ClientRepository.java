package com.petshop.jwt.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface ClientRepository extends JpaRepository<Client, Integer> {

    @Query(value = """
      select c from Client c inner join User u\s
      on c.cpf = u.cpf\s
      where u.cpf = :cpf\s
      """)
    Optional<Client> findByCpf(String cpf);
}
