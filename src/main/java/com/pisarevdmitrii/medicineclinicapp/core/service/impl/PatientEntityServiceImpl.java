package com.pisarevdmitrii.medicineclinicapp.core.service.impl;

import com.pisarevdmitrii.medicineclinicapp.core.model.entity.PatientEntity;
import com.pisarevdmitrii.medicineclinicapp.core.repository.impl.PatientEntityRepository;
import com.pisarevdmitrii.medicineclinicapp.core.service.PatientEntityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientEntityServiceImpl implements PatientEntityService {

    private final PatientEntityRepository patientEntityRepository;

    public PatientEntityServiceImpl(PatientEntityRepository patientEntityRepository) {
        this.patientEntityRepository = patientEntityRepository;
    }

    @Override
    public PatientEntity findById(Long id) {
        return patientEntityRepository.getById(id);
    }

    @Override
    public List<PatientEntity> findAll() {
        return patientEntityRepository.findAll();
    }

    @Override
    public PatientEntity save(PatientEntity patient) {
        return patientEntityRepository.save(patient);
    }

    @Override
    public PatientEntity removeById(Long id) {
        PatientEntity patient = findById(id);
        patientEntityRepository.deleteById(id);
        return patient;
    }
}
