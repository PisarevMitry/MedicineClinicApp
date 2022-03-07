package com.pisarevdmitrii.medicalmonitiring.core.repository.impl;

import com.pisarevdmitrii.medicalmonitiring.core.model.entity.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, Long> {
}
