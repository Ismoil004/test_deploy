package com.example.demo1.service;

import com.example.demo1.dto.LoginDto;

import java.util.Map;

public interface AuthService {
    Map<String, String> check(LoginDto loginDto);
}
