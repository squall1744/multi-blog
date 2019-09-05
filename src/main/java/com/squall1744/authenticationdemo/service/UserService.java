package com.squall1744.authenticationdemo.service;

import com.squall1744.authenticationdemo.dao.UserMapper;
import com.squall1744.authenticationdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User gerUserByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }
}
