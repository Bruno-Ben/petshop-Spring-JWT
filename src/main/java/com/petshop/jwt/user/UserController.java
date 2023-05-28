package com.petshop.jwt.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;



    @PreAuthorize("hasAuthority('admin:read')")
    @GetMapping("")
    public List<User> get() { return service.findAll(); }

//    @PutMapping("")
//    public String put(@RequestHeader("Authorization") String token) {
//        User user = service.findUserByToken(token.split(" ")[1]);
//        return user.getCpf();
//        Optional<User> u = service.findUserByToken(token);
//        if (u != null)  {
//            return u.get().getCpf();
//        } else {
//            return "null";
//        }
//    }
//    @PutMapping("")
//    public String put(@RequestHeader("Authorization") String token, @RequestBody UserEditAdminPayload payload) {
//        User user = service.findUserByToken(token.split(" ")[1]);
//        Address address = service.findAddressByUser(user);
//        if (user.getRole().equals(Role.USER)) {
//            UserEditUserPayload userLoad = UserEditUserPayload.fixPayload(payload);
//            if (userLoad.getPassword() != null) {
//                user.setPassword(userLoad.getPassword());
//            }
//
//        } else {
//
//        }
//        service.save(user);
//    return "Ok";
//
//    }

//    @PostMapping("")
//    public String post(@RequestHeader("Authorization") String token,
//                       @RequestBody RegistrationDetails details) {
//        User user = service.findUserByToken(token.split(" ")[1]);
//        String email = RegistrationDetails.getEmail();
//
//
//    }

}
