package liga.medical.medicalmonitoring.core.repository;

import liga.medical.medicalmonitoring.dto.PatientDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientDtoRepository extends JpaRepository<PatientDto, Long> {

}
