package com.project.HMS.Repository;

import com.project.HMS.Entity.Hospital;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {

    List<Hospital> findByName(String name);
    
}
