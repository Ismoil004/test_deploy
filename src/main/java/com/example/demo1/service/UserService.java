package com.example.demo1.service;


import com.example.demo1.entity.User;

public interface UserService {
    User findByUsername(String username);
}
