package com.pisarevdmitrii.medicalmonitiring.core.mapper;

import com.pisarevdmitrii.medicalmonitiring.core.model.entity.Patient;
import com.pisarevdmitrii.medicalmonitiring.dto.PatientDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class PatientMapper {

	ModelMapper modelMapper;

	public Patient toEntity(PatientDto dto) {
		return Objects.isNull(dto) ? null : modelMapper.map(dto, Patient.class);
	}

	public PatientDto toDto(Patient entity) {
		return Objects.isNull(entity) ? null : modelMapper.map(entity, PatientDto.class);
	}
}