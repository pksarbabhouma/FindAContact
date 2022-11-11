package com.pradip.dev.repository;

import com.pradip.dev.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, String> {

    List<Contact> findAll();

    Optional<Contact> findById(String s);

    Contact save(Contact contact);

    void deleteById(String s);
}
