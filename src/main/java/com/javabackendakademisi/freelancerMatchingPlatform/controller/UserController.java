package com.javabackendakademisi.freelancerMatchingPlatform.controller;

import com.javabackendakademisi.freelancerMatchingPlatform.model.User;
import com.javabackendakademisi.freelancerMatchingPlatform.model.request.UserRequestDTO;
import com.javabackendakademisi.freelancerMatchingPlatform.repository.UserRepository;
import com.javabackendakademisi.freelancerMatchingPlatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserRequestDTO userRequestDTO){
        User user= new User();
        user.setName(userRequestDTO.getName());
        user.setEmail(userRequestDTO.getEmail());
        user.setRole(userRequestDTO.getRole());
        //User createUser= userService.createUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<User> getUserById(@PathVariable Long Id){
        User user = userService.getUserById(Id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
