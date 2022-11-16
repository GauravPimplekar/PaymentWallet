package com.paymentWallet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentWallet.module.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	
	
}
