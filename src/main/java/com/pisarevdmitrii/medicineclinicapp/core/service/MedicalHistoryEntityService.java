package com.pisarevdmitrii.medicineclinicapp.core.service;

import com.pisarevdmitrii.medicineclinicapp.core.model.entity.MedicalHistoryEntity;

import java.util.List;

public interface MedicalHistoryEntityService {

    MedicalHistoryEntity findById(Long id);

    List<MedicalHistoryEntity> findAll();

    MedicalHistoryEntity save(MedicalHistoryEntity medicalHistory);

    MedicalHistoryEntity removeById(Long id);
}
