package com.project.HMS.Repository;

import java.util.List;
import com.project.HMS.Entity.user_queries;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserqueriesRepository extends JpaRepository<user_queries, Long> {
    List<user_queries> findByEmail(String email);
}
