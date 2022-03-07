package com.pisarevdmitrii.medicalmonitiring.core.service.impl;

import com.pisarevdmitrii.medicalmonitiring.core.mapper.PatientMapper;
import com.pisarevdmitrii.medicalmonitiring.core.model.entity.Patient;
import com.pisarevdmitrii.medicalmonitiring.core.repository.impl.PatientDtoRepository;
import com.pisarevdmitrii.medicalmonitiring.core.repository.impl.PatientRepository;
import com.pisarevdmitrii.medicalmonitiring.core.service.PatientService;
import com.pisarevdmitrii.medicalmonitiring.dto.PatientDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

	private final PatientRepository patientRepository;
	private final PatientDtoRepository dtoRepository;
	private final PatientMapper mapper;

	public PatientServiceImpl(PatientRepository patientRepository, PatientDtoRepository dtoRepository, PatientMapper mapper) {
		this.patientRepository = patientRepository;
		this.dtoRepository = dtoRepository;
		this.mapper = mapper;
	}

	@Override
	public Patient findById(Long id) {
		return patientRepository.getOne(id);
	}

	@Override
	public List<Patient> findAll() {
		return patientRepository.findAll();
	}

	@Override
	public Patient save(Patient patient) {
		return patientRepository.save(patient);
	}

	public PatientDto save(PatientDto patient) {
		return mapper.toDto(patientRepository.save(mapper.toEntity(patient)));
	}

	@Override
	public Patient deleteById(Long id) {
		Patient patient = findById(id);
		patientRepository.deleteById(id); return patient;
	}
}
