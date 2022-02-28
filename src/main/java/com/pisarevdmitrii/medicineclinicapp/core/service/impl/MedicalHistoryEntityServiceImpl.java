package com.pisarevdmitrii.medicineclinicapp.core.service.impl;

import com.pisarevdmitrii.medicineclinicapp.core.model.entity.MedicalHistoryEntity;
import com.pisarevdmitrii.medicineclinicapp.core.repository.impl.MedicalHistoryEntityRepository;
import com.pisarevdmitrii.medicineclinicapp.core.service.MedicalHistoryEntityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalHistoryEntityServiceImpl implements MedicalHistoryEntityService {

    private final MedicalHistoryEntityRepository medicalHistoryEntityRepository;

    public MedicalHistoryEntityServiceImpl(MedicalHistoryEntityRepository medicalHistoryRepository) {
        this.medicalHistoryEntityRepository = medicalHistoryRepository;
    }

    @Override
    public MedicalHistoryEntity findById(Long id) {
        return medicalHistoryEntityRepository.getById(id);
    }

    @Override
    public List<MedicalHistoryEntity> findAll() {
        return medicalHistoryEntityRepository.findAll();
    }

    @Override
    public MedicalHistoryEntity save(MedicalHistoryEntity medicalHistory) {
        return medicalHistoryEntityRepository.save(medicalHistory);
    }

    @Override
    public MedicalHistoryEntity removeById(Long id) {
        MedicalHistoryEntity medicalHistory = findById(id);
        medicalHistoryEntityRepository.deleteById(id);
        return medicalHistory;
    }
}
