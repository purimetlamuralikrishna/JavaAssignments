package com.blog.repositery;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.entites.Register;

@Repository
public interface RegisterRepo extends JpaRepository<Register, Integer> {

	public Optional<Register> findByEmail(String email);
	
}
