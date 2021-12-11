package com.project.HMS.Repository;
import java.sql.Date;
import com.project.HMS.Entity.Operation;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation, Long> {
    List<Operation> findByDate(Date date);
    List<Operation> findByPatient(Long patient);
    List<Operation> findByHid(Long hid);
}
