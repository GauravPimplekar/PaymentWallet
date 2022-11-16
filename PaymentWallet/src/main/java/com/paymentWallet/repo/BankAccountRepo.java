package com.paymentWallet.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.paymentWallet.module.BankAccount;
import com.paymentWallet.module.Wallet;

public interface BankAccountRepo extends JpaRepository<BankAccount, Integer> {

	@Query("select s from BankAccount s")
	public List<BankAccount> getList(Wallet wallet);
}
