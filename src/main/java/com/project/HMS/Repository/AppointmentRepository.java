package com.project.HMS.Repository;

import com.project.HMS.Entity.Appointment;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findByContact(Long contact);
    List<Appointment> findByEmail(String email);
    List<Appointment> findByUser(String user);
    List<Appointment> findByDoctorid(Long doctor_id);
    List<Appointment> findByHid(Long hid);
}
