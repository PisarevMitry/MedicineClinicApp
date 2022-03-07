package com.pisarevdmitrii.medicalmonitiring.core.service.impl;

import com.pisarevdmitrii.medicalmonitiring.core.mapper.MedicalHistoryMapper;
import com.pisarevdmitrii.medicalmonitiring.core.model.entity.MedicalHistory;
import com.pisarevdmitrii.medicalmonitiring.core.repository.impl.MedicalHistoryDtoRepository;
import com.pisarevdmitrii.medicalmonitiring.core.repository.impl.MedicalHistoryRepository;
import com.pisarevdmitrii.medicalmonitiring.core.service.MedicalHistoryService;
import com.pisarevdmitrii.medicalmonitiring.dto.MedicalHistoryDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalHistoryServiceImpl implements MedicalHistoryService {

	private final MedicalHistoryRepository medicalHistoryRepository;
	private final MedicalHistoryDtoRepository dtoRepository;
	private final MedicalHistoryMapper mapper;

	public MedicalHistoryServiceImpl(MedicalHistoryRepository medicalHistoryRepository, MedicalHistoryDtoRepository dtoRepository, MedicalHistoryMapper mapper) {
		this.medicalHistoryRepository = medicalHistoryRepository;
		this.dtoRepository = dtoRepository;
		this.mapper = mapper;
	}

	@Override
	public MedicalHistory findById(Long id) {
		return medicalHistoryRepository.getOne(id);
	}

	@Override
	public List<MedicalHistory> findAll() {
		return medicalHistoryRepository.findAll();
	}

	@Override
	public MedicalHistory save(MedicalHistory medicalHistory) {
		return medicalHistoryRepository.save(medicalHistory);
	}

	public MedicalHistoryDto save(MedicalHistoryDto medicalHistory) {
		return mapper.toDto(medicalHistoryRepository.save(mapper.toEntity(medicalHistory)));
	}

	@Override
	public MedicalHistory deleteById(Long id) {
		MedicalHistory medicalHistory = findById(id);
		medicalHistoryRepository.deleteById(id);
		return medicalHistory;
	}
}
