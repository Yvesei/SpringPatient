package ma.enset.gestion_patient.repositories;

import ma.enset.gestion_patient.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Page<Patient> findByNomContains(String nom, Pageable pageable);
}