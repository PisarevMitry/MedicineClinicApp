package com.pisarevdmitrii.medicalmonitiring.core.controller.rest;

import com.pisarevdmitrii.medicalmonitiring.core.model.entity.PatientEntity;
import com.pisarevdmitrii.medicalmonitiring.core.service.impl.PatientEntityServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
@RequiredArgsConstructor
public class PatientEntityController {

    private final PatientEntityServiceImpl patientEntityService;


    @GetMapping("/{id}")
    public PatientEntity getPatientById(@PathVariable Long id) {
        return patientEntityService.findById(id);
    }

    @GetMapping()
    public List<PatientEntity> getAllPatients() {
        return patientEntityService.findAll();
    }

    @PostMapping()
    public ResponseEntity<PatientEntity> createPatient(@RequestBody PatientEntity patient) {
        patientEntityService.save(patient);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<PatientEntity> updatePatientById(@PathVariable Long id, @RequestBody PatientEntity patient) {
        patientEntityService.removeById(id);
        patientEntityService.save(patient);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public PatientEntity deletePatientById(@PathVariable Long id) {
        return patientEntityService.removeById(id);
    }
}