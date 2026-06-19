package com.example.springapiexperiments.api.controller;

import com.example.springapiexperiments.api.model.User;
import com.example.springapiexperiments.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public User getUser(@RequestParam Integer id) {
        return userService.getUser(id);
    }
}
