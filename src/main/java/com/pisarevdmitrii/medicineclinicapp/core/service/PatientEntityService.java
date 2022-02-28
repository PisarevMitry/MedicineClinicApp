package com.pisarevdmitrii.medicineclinicapp.core.service;

import com.pisarevdmitrii.medicineclinicapp.core.model.entity.PatientEntity;

import java.util.List;
import java.util.UUID;

public interface PatientEntityService {

    PatientEntity findById(Long id);

    List<PatientEntity> findAll();

    PatientEntity save(PatientEntity patient);

    PatientEntity removeById(Long id);
}
