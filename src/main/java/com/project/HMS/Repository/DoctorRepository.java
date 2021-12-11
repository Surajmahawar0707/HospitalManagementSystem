package com.project.HMS.Repository;

import java.util.List;

import com.project.HMS.Entity.Doctor;
import com.project.HMS.Entity.Hospital;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findByName(String name);
    List<Doctor> findByHospital(Hospital h);
    List<Doctor> findByEmail(String email);
}
