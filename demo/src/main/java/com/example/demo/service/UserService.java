package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
    public User login(String username,String password);

    public Integer insert(User user);
}
