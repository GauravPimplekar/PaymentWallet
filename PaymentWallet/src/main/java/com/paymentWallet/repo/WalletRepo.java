package com.paymentWallet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentWallet.module.Wallet;

public interface WalletRepo extends JpaRepository<Wallet, Integer> {

}
