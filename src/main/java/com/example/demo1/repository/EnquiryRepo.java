package com.example.demo1.repository;


import com.example.demo1.entity.Enquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EnquiryRepo extends JpaRepository<Enquiry, UUID> {

}
