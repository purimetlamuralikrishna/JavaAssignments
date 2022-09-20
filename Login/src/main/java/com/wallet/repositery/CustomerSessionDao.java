package com.wallet.repositery;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wallet.userLogin.CustomerSession;

public interface CustomerSessionDao extends JpaRepository<CustomerSession,Integer> {

	public Optional<CustomerSession> findByCustomerId(Integer customerId);
	
	public Optional<CustomerSession> findByUuid(String uuid);
}
