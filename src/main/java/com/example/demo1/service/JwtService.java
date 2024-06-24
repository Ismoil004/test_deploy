
package com.example.demo1.service;


import com.example.demo1.entity.User;

public interface JwtService {
    String generateJwtToken(User user);
    String extractSubject(String token);
    String generateRefreshToken(User user);

}
