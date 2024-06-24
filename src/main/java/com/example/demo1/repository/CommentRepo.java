package com.example.demo1.repository;


import com.example.demo1.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CommentRepo extends JpaRepository<Comment, UUID> {
    List<Comment> findByAdminstatus(boolean adminStatus);
}
