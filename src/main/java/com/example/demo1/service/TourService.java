package com.example.demo1.service;



import com.example.demo1.dto.TourDto;
import com.example.demo1.entity.Tour;

import java.util.List;
import java.util.UUID;

public interface TourService {
    Tour addTour(TourDto tourDto);
    List<Tour> getAllTours();
    Tour updateTour(UUID id, TourDto tourDto); // Existing method
    void deleteTour(UUID id); // Existing method
}
