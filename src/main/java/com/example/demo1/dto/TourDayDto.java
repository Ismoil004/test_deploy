package com.example.demo1.dto;

import java.util.UUID;

 public record TourDayDto(String title, String description, String photo, UUID tourId) {
}
