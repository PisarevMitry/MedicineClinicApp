package com.pisarevdmitrii.medicalmonitiring.core.repository.impl;

import com.pisarevdmitrii.medicalmonitiring.dto.PatientDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDtoRepository extends JpaRepository<PatientDto, Long> {
}
