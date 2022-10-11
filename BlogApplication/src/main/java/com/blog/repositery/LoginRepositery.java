package com.blog.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entites.LoginDetails;

public interface LoginRepositery extends JpaRepository<LoginDetails, Integer> {

	
}
