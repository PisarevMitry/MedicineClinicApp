package com.pisarevdmitrii.medicineclinicapp.core.service.impl;

import com.pisarevdmitrii.medicineclinicapp.core.model.entity.MedicalHistory;
import com.pisarevdmitrii.medicineclinicapp.core.repository.MedicalHistoryRepository;
import com.pisarevdmitrii.medicineclinicapp.core.service.MedicalHistoryService;

import java.util.List;

public class MedicalHistoryServiceImpl implements MedicalHistoryService {

    private final MedicalHistoryRepository medicalHistoryRepository;

    public MedicalHistoryServiceImpl(MedicalHistoryRepository medicalHistoryRepository) {
        this.medicalHistoryRepository = medicalHistoryRepository;
    }

    @Override
    public MedicalHistory findById(Long id) {
        return medicalHistoryRepository.getById(id);
    }

    @Override
    public List<MedicalHistory> findAll() {
        return medicalHistoryRepository.findAll();
    }

    @Override
    public MedicalHistory save(MedicalHistory medicalHistory) {
        return medicalHistoryRepository.save(medicalHistory);
    }

    @Override
    public MedicalHistory removeById(Long id) {
        MedicalHistory medicalHistory = findById(id);
        medicalHistoryRepository.deleteById(id);
        return medicalHistory;
    }
}
