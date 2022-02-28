package com.pisarevdmitrii.medicineclinicapp.core.repository;

import com.pisarevdmitrii.medicineclinicapp.core.model.entity.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, Long> {
}
