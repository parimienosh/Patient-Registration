package com.example.patientservice.controller;

import com.example.patientservice.model.Patient;
import com.example.patientservice.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    private PatientService service;

    @PostMapping("/register")
    public Patient register(@RequestBody Patient patient) {
        return service.registerPatient(patient);
    }

    @GetMapping
    public List<Patient> getAll() {
        return service.getAllPatients();
    }

    @GetMapping("/{id}")
    public Patient getById(@PathVariable Long id) {
        return service.getPatientById(id);
    }
}
