package com.pisarevdmitrii.medicineclinicapp.core.controller.rest;

import com.pisarevdmitrii.medicineclinicapp.core.model.entity.MedicalHistoryEntity;
import com.pisarevdmitrii.medicineclinicapp.core.service.impl.MedicalHistoryEntityServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medical_histories")
@RequiredArgsConstructor
public class MedicalHistoryEntityController {

    private final MedicalHistoryEntityServiceImpl medicalHistoryService;

    @GetMapping("/{id}")
    public MedicalHistoryEntity getMedicalHistoryById(@PathVariable Long id) {
        return medicalHistoryService.findById(id);
    }

    @GetMapping()
    public List<MedicalHistoryEntity> getAllMedicalHistories() {
        return medicalHistoryService.findAll();
    }

    @PostMapping()
    public ResponseEntity<MedicalHistoryEntity> createMedicalHistory(@RequestBody MedicalHistoryEntity medicalHistory) {
        medicalHistoryService.save(medicalHistory);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<MedicalHistoryEntity> updateMedicalHistoryById(@PathVariable Long id, @RequestBody MedicalHistoryEntity medicalHistory) {
        medicalHistoryService.removeById(id);
        medicalHistoryService.save(medicalHistory);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public MedicalHistoryEntity deleteMedicalHistoryById(@PathVariable Long id) {
        return medicalHistoryService.removeById(id);
    }
}
