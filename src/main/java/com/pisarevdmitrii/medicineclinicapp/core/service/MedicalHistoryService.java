package com.pisarevdmitrii.medicineclinicapp.core.service;

import com.pisarevdmitrii.medicineclinicapp.core.model.entity.MedicalHistory;

import java.util.List;

public interface MedicalHistoryService {
    MedicalHistory findById(Long id);

    List<MedicalHistory> findAll();

    MedicalHistory save(MedicalHistory medicalHistory);

    MedicalHistory removeById(Long id);
}
