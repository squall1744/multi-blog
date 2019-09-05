package com.squall1744.authenticationdemo.controller;

import com.squall1744.authenticationdemo.entity.User;
import com.squall1744.authenticationdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private UserService userService;

    @Autowired
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/auth")
    public User getUser() {
       return userService.gerUserByUsername("Adam");
    }
}
