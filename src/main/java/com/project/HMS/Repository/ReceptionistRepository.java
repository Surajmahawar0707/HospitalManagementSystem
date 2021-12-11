package com.project.HMS.Repository;

import com.project.HMS.Entity.Receptionist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceptionistRepository extends JpaRepository<Receptionist, String>{
    
}
