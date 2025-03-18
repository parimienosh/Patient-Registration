package com.example.patientservice.model;

import jakarta.persistence.*;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;

    // Getters and Setters
}
