package com.petshop.jwt.user;

import com.petshop.jwt.token.Token;
import com.petshop.jwt.token.TokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    private final TokenRepository tokenRepository;

    public List<User> findAll() {
        return repository.findAll();
    }

//    public Optional<User> findUserByToken(String token) {
//        return repository.findUserByToken(token);
//
//    }

    public User findUserByToken(String token) {
        Optional<Token> tok = tokenRepository.findByToken(token);
        if (tok.isEmpty()) return null;
        return tok.get().user;
    }

    public void save(User u) {
        repository.save(u);
    }

//    public Address findAddressByUser(User user) {
//        Client client
//    }

}
