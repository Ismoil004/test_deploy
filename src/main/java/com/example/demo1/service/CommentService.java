package com.example.demo1.service;


import com.example.demo1.dto.CommentDto;
import com.example.demo1.entity.Comment;
import org.springframework.http.HttpEntity;

import java.util.List;
import java.util.UUID;

public interface CommentService {
    Comment post(CommentDto commentDto);

    HttpEntity<?> get();

    Comment updateStatus(UUID id, boolean status);

    List<Comment> getApprovedComments();


    Comment updateAdminStatus(UUID id, boolean adminstatus);

    List<Comment> getAdminStatusTrueComments();
}
