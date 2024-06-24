package com.example.demo1.service;


import com.example.demo1.entity.Enquiry;

import java.util.List;
import java.util.UUID;

public interface EnquiryService {
    Enquiry saveEnquiry(Enquiry enquiry);
    List<Enquiry> getAllEnquiries();
    Enquiry updateEnquiryAnswer(UUID id, String answer);

}

