// MessageController.java
package com.example.demo1.controller;

import com.example.demo1.service.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("/api/message")
@RequiredArgsConstructor
@RestController
public class MessageController {

    private final MailService mailService;

    @PostMapping
    public HttpEntity<?> sendMessage(@RequestBody Map<String, String> payload) {
        String to = payload.get("to");
        String subject = payload.get("subject");
        String body = payload.get("body");
        return mailService.send(to, subject, body);
    }
}
