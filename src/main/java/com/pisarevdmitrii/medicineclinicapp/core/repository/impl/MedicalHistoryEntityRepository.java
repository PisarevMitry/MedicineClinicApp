package com.pisarevdmitrii.medicineclinicapp.core.repository.impl;

import com.pisarevdmitrii.medicineclinicapp.core.model.entity.MedicalHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalHistoryEntityRepository extends JpaRepository<MedicalHistoryEntity, Long> {
}
