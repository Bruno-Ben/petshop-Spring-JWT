package com.petshop.jwt.pet;
import com.petshop.jwt.model.Client;
import com.petshop.jwt.model.ClientRepository;
import com.petshop.jwt.model.Race;
import com.petshop.jwt.model.RaceRepository;
import com.petshop.jwt.user.UserService;

import com.petshop.jwt.payload.PetCreationPayload;
import com.petshop.jwt.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/pet")
@RequiredArgsConstructor
public class PetController {

    private final PetRepository repository;
    private final UserService userService;
    private final RaceRepository raceRepository;
    private final ClientRepository clientRepository;
    @PostMapping("/create")
    public String register(
            @RequestHeader("Authorization") String token,
            @RequestBody PetCreationPayload petInfo
    ) {
        User user = userService.findUserByToken(token.split(" ")[1]);
        Optional<Client> client = clientRepository.findByCpf(user.getCpf());
        Pet pet = new Pet();
        Race race = raceRepository.getByName(petInfo.getRace());
        if (race == null ) {
            race = new Race();
            race.setDescription(petInfo.getRace());
            raceRepository.save(race);
        }
        pet.setRace(race);
        pet.setClient(client.get());
        pet.setBirthDate(petInfo.getBirthDate());
        pet.setName(petInfo.getName());
        repository.save(pet);

        return "ok";
    }

    @GetMapping("")
    public List<Pet> get(@RequestHeader("Authorization") String token) {
        User user = userService.findUserByToken(token.split(" ")[1]);
        Optional<Client> client = clientRepository.findByCpf(user.getCpf());
        List<Pet> pets = repository.getAllPetsFromClient(client.get().getId());
        return pets;
    }

}
