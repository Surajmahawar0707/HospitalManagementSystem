package com.project.HMS.Repository;

import com.project.HMS.Entity.medical_staff;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Medical_staffRepository extends JpaRepository<medical_staff, String> {
    
    List<medical_staff> findByEmail(String email);
}
