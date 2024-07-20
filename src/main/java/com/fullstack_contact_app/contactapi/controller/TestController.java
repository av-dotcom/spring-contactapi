package com.fullstack_contact_app.contactapi.controller;

import com.fullstack_contact_app.contactapi.domain.Contact;
import com.fullstack_contact_app.contactapi.repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private ContactRepo contactRepo;

    @GetMapping("/test")
    public String testConnection() {
        try {
            long count = contactRepo.count();
            return "Connected to database, number of contacts: " + count;
        } catch (Exception e) {
            return "Failed to connect to database: " + e.getMessage();
        }
    }
}