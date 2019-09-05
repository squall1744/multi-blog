package com.squall1744.authenticationdemo.dao;

import com.squall1744.authenticationdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User getUserByUsername(String username);
}
