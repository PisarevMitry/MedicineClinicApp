package com.pisarevdmitrii.medicalmonitiring.core.repository.impl;

import com.pisarevdmitrii.medicalmonitiring.core.model.entity.MedicalHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalHistoryEntityRepository extends JpaRepository<MedicalHistoryEntity, Long> {
}
