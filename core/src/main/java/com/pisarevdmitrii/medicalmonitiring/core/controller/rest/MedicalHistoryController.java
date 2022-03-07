package com.pisarevdmitrii.medicalmonitiring.core.controller.rest;

import com.pisarevdmitrii.medicalmonitiring.dto.MedicalHistoryDto;
import com.pisarevdmitrii.medicalmonitiring.core.model.entity.MedicalHistory;
import com.pisarevdmitrii.medicalmonitiring.core.service.impl.MedicalHistoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/medical_histories")
public class MedicalHistoryController {

	private final MedicalHistoryServiceImpl medicalHistoryService;

	@Autowired
	public MedicalHistoryController(MedicalHistoryServiceImpl medicalHistoryService) {
		this.medicalHistoryService = medicalHistoryService;
	}

	@GetMapping("/{id}")
	public MedicalHistory getMedicalHistoryById(@PathVariable Long id) {
		return medicalHistoryService.findById(id);
	}

	@GetMapping()
	public List<MedicalHistory> getAllMedicalHistories() {
		return medicalHistoryService.findAll();
	}

	@PostMapping()
	public ResponseEntity<MedicalHistoryDto> createMedicalHistory(@RequestBody MedicalHistoryDto medicalHistory) {
		return ResponseEntity.ok(medicalHistoryService.save(medicalHistory));
	}

	@PatchMapping("/{id}")
	public ResponseEntity<MedicalHistoryDto> updateMedicalHistoryById(@PathVariable Long id, @RequestBody MedicalHistoryDto medicalHistory) {
		medicalHistoryService.deleteById(id);
		return ResponseEntity.ok(medicalHistoryService.save(medicalHistory));
	}

	@DeleteMapping("/{id}")
	public MedicalHistory deleteMedicalHistoryById(@PathVariable Long id) {
		return medicalHistoryService.deleteById(id);
	}

}
