package com.example.demo1.controller;

import com.example.demo1.entity.Enquiry;
import com.example.demo1.repository.EnquiryRepo;
import com.example.demo1.service.EnquiryService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/enquiry")
public class EnquiryController {
    private final EnquiryService enquiryService;
  private final EnquiryRepo enquiryRepo;
    @PostMapping
    public ResponseEntity<Enquiry> createEnquiry(@RequestBody Enquiry enquiry) {
        System.out.println(enquiry);
        Enquiry savedEnquiry = enquiryService.saveEnquiry(enquiry);
        return ResponseEntity.ok(savedEnquiry);
    }


    @GetMapping
    public ResponseEntity<List<Enquiry>> getAllEnquiries() {
        List<Enquiry> enquiries = enquiryService.getAllEnquiries();
        return ResponseEntity.ok(enquiries);
    }
    @GetMapping("/{idd}")
    public HttpEntity<?> getByTourName(@PathVariable UUID idd){
       return ResponseEntity.ok(enquiryRepo.findById(idd));
    }
    @PatchMapping("/{id}/answer")
    public ResponseEntity<Enquiry> updateEnquiryAnswer(@PathVariable UUID id, @RequestBody String answer) {
        Enquiry updatedEnquiry = enquiryService.updateEnquiryAnswer(id, answer);
        return ResponseEntity.ok(updatedEnquiry);
    }
}
