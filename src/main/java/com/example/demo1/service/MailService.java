package com.example.demo1.service;

import org.springframework.http.HttpEntity;

public interface MailService {
    HttpEntity<?> send(String to, String subject, String body);
}