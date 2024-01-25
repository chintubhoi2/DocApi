package com.digital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digital.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

	List<Doctor> findByFistName(String fistName);
	
	
}