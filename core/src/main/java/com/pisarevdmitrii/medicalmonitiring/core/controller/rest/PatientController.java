package com.pisarevdmitrii.medicalmonitiring.core.controller.rest;

import com.pisarevdmitrii.medicalmonitiring.core.model.entity.Patient;
import com.pisarevdmitrii.medicalmonitiring.core.service.impl.PatientServiceImpl;
import com.pisarevdmitrii.medicalmonitiring.dto.PatientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

	private final PatientServiceImpl patientService;

	@Autowired
	public PatientController(PatientServiceImpl patientService) {
		this.patientService = patientService;
	}

	@GetMapping("/{id}")
	public Patient getPatientById(@PathVariable Long id) {
		return patientService.findById(id);
	}

	@GetMapping()
	public List<Patient> getAllPatients() {
		return patientService.findAll();
	}

	@PostMapping()
	public ResponseEntity<PatientDto> createPatient(@RequestBody PatientDto patient) {
		return ResponseEntity.ok(patientService.save(patient));
	}

	@PatchMapping("/{id}")
	public ResponseEntity<PatientDto> updatePatientById(@PathVariable Long id, @RequestBody PatientDto patient) {
		patientService.deleteById(id);
		return ResponseEntity.ok(patientService.save(patient));
	}

	@DeleteMapping("/{id}")
	public Patient deletePatientById(@PathVariable Long id) {
		return patientService.deleteById(id);
	}

}