package com.example.demo1.service;



import com.example.demo1.dto.TourDayDto;
import com.example.demo1.entity.TourDay;

import java.util.List;
import java.util.UUID;

public interface TourDayService {
    TourDay addTourDay(TourDayDto tourDayDto);
    List<TourDay> getTourDays(UUID tourId);
    TourDay updateTourDay(UUID id, TourDayDto tourDayDto);
    void deleteTourDay(UUID id);
    List<TourDay> getById(UUID tourId);
    List<TourDay>getByIdd(UUID idd);
}
