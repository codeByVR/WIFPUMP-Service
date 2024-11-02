package com.wifpump.controller;

import com.wifpump.model.User;
import com.wifpump.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //All User
    @GetMapping
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    //By ID
    @GetMapping("/{id}")
    public Optional<User> getUserbyId(@PathVariable Long id){
        return userRepository.findById((id));
    }
}
