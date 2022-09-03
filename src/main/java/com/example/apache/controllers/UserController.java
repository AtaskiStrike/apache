package com.example.apache.controllers;

import com.example.apache.entities.User;
import com.example.apache.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    UserService service;

    public UserController(UserService service){
        this.service =service;
    }

    @GetMapping("/users")
    public List<User> UserList(){
        return this.service.getUserList();
    }
}
