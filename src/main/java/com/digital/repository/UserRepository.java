package com.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digital.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	// User findByUsername(String username);
     User findByuserName(String userName);
}
