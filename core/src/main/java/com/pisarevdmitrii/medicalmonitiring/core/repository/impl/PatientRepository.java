package com.pisarevdmitrii.medicalmonitiring.core.repository.impl;

import com.pisarevdmitrii.medicalmonitiring.core.model.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
