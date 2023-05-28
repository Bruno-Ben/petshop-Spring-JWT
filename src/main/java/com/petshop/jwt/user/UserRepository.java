package com.petshop.jwt.user;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByCpf(String cpf);

  List<User> findAll();

//
//  @Query(value = """
//          select u from User inner join Token t\s
//          on user.id = t.user.id\s
//          where :token = t.token\s
//          """)
//  Optional<User>findUserByToken(String token);
}
