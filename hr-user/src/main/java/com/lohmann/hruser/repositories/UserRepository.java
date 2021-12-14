package com.lohmann.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lohmann.hruser.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
