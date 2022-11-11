package com.pradip.dev.controller;

import com.pradip.dev.model.Contact;
import com.pradip.dev.repository.ContactRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/contacts")
public class ContactRestController {

    private final ContactRepository contactRepository;

    @GetMapping
    List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @GetMapping("/{phone}")
    Contact getContactByPhone(@PathVariable String phone) {
        return contactRepository.findById(phone).get();
    }

    @PostMapping
    Contact saveContact(Contact newContact) {
        return contactRepository.save(newContact);
    }

    @PutMapping("/{phone}")
    Contact updateContact(@PathVariable String phone, @RequestBody Contact updatedContact) {
        return contactRepository.findById(phone)
                .map(contact -> {
                    contact.setEmail(updatedContact.getEmail());
                    return contactRepository.save(contact);
                }).orElseGet(() -> {
                    return contactRepository.save(updatedContact);
                });
    }

    @DeleteMapping("/{phone}")
    void deleteContact(@PathVariable String phone) {
        contactRepository.deleteById(phone);
    }


}
