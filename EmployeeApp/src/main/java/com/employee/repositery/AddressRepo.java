package com.employee.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.models.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {

}
