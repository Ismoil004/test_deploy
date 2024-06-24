package com.example.demo1.service;

import com.example.demo1.entity.Enquiry;
import com.example.demo1.repository.EnquiryRepo;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EnquiryServiceImp implements EnquiryService {
    private final EnquiryRepo enquiryRepo;

    @Override
    public Enquiry saveEnquiry(Enquiry enquiry) {
        return enquiryRepo.save(enquiry);
    }

    @Override
    public List<Enquiry> getAllEnquiries() {
        return enquiryRepo.findAll();
    }

    @Override
    public Enquiry updateEnquiryAnswer(UUID id, String answer) {
        Enquiry enquiry = enquiryRepo.findById(id).orElseThrow(() -> new RuntimeException("Enquiry not found"));
        enquiry.setAnswer(answer);
        return enquiryRepo.save(enquiry);
    }
}
