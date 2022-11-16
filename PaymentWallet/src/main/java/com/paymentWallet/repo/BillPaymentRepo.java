package com.paymentWallet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentWallet.module.BillPayment;

public interface BillPaymentRepo extends JpaRepository<BillPayment, Integer> {

}
