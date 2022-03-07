package com.pisarevdmitrii.medicalmonitiring.core.repository.impl;

import com.pisarevdmitrii.medicalmonitiring.dto.MedicalHistoryDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalHistoryDtoRepository extends JpaRepository<MedicalHistoryDto, Long> {
}
