package com.example.demo.service.imp;

import com.example.demo.mapper.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImp implements UserService {
    @Resource
    private UserDao userDao;

    public User login(String username, String password){
        return userDao.login(username,password);
    }

    public Integer insert(User user){
        return userDao.insert(user);
    }
}
