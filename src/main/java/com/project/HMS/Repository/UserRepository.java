package com.project.HMS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.HMS.Entity.User;

public interface UserRepository extends JpaRepository<User, String> {

	List<User> findByEmail(String email);
}
