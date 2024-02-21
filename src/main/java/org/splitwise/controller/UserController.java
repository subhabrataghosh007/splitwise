package org.splitwise.controller;

import org.splitwise.models.User;
import org.splitwise.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/create")
    public ResponseEntity<Void> createUser(@RequestBody User user) {
        System.out.println(user);
        userRepository.save(user);
        return ResponseEntity.accepted().build();
    }
}
