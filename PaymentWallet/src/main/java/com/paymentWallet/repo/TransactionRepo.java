package com.paymentWallet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentWallet.module.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Integer> {

}
