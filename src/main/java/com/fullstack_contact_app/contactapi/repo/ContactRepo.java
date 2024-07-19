package com.fullstack_contact_app.contactapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ContactRepo extends JpaRepository<Contact, String> {
    Optional<Contact> findByEmail(String email);
    Optional<Contact> findById(String id);
    Optional<Contact> findByName(String name);
}
