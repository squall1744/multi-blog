package com.squall1744.authenticationdemo.controller;

import com.squall1744.authenticationdemo.entity.User;
import com.squall1744.authenticationdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.message.AuthStatus;
import java.util.Map;

@RestController
public class AuthController {
    private UserService userService;
    private AuthenticationManager authenticationManager;

    @Autowired
    public AuthController(UserService userService, AuthenticationManager authenticationManager) {
        this.userService = userService;
        this.authenticationManager = authenticationManager;
    }

    @GetMapping("/auth")
    public User getUser() {
       return userService.gerUserByUsername("Adam");
    }

//    @PostMapping("/auth/login")
//    public AuthStatus login(@RequestBody Map<String, String> usernameAndPassword) {
//        String username = usernameAndPassword.get("username");
//        String password = usernameAndPassword.get("password");
//
//        try {
//            UserDetails userDetails = userService.loadUserByUsername(username);
//            UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());
//
//            authenticationManager.authenticate(token);
//            SecurityContextHolder.getContext().setAuthentication(token);
//
//        } catch () {
//
//        } catch () {
//
//        }
//    }
}
