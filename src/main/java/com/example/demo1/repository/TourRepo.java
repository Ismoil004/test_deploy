package com.example.demo1.repository;

import com.example.demo1.entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TourRepo extends JpaRepository<Tour, UUID> {
}
