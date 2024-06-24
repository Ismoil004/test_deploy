    package com.example.demo1.controller;

    import com.example.demo1.dto.TourDto;
    import com.example.demo1.entity.Tour;
    import com.example.demo1.service.TourService;
    import lombok.RequiredArgsConstructor;

    import org.springframework.http.HttpEntity;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;
    import java.util.UUID;

    @RestController
    @RequiredArgsConstructor
    @RequestMapping("/api/tour")
    public class  TourController {

        private final TourService tourService;

        @PostMapping
        public HttpEntity<?> addTour(@RequestBody TourDto tourDto) {
            System.out.println(tourDto);
            Tour addedTour = tourService.addTour(tourDto);
            return ResponseEntity.status(HttpStatus.CREATED).body(addedTour);
        }

        @GetMapping("/getAll")
        public ResponseEntity<List<Tour>> getAllTours() {
            List<Tour> tours = tourService.getAllTours();
            return ResponseEntity.ok(tours);
        }

        @PutMapping("/{id}")
        public ResponseEntity<Tour> updateTour(@PathVariable UUID id, @RequestBody TourDto tourDto) {
            Tour updatedTour = tourService.updateTour(id, tourDto);
            return ResponseEntity.ok(updatedTour);
        }


        // New method for deleting a tour
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteTour(@PathVariable UUID id) {
            System.out.println(id);
            tourService.deleteTour(id);
            return ResponseEntity.noContent().build();
        }
    }
