package com.project.HMS.Repository;
import com.project.HMS.Entity.Patient;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByHid(Long hid);
    List<Patient> findByDid(Long did);
}
