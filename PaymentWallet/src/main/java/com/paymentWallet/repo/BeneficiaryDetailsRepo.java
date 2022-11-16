package com.paymentWallet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentWallet.module.BeneficiaryDetails;

public interface BeneficiaryDetailsRepo extends JpaRepository<BeneficiaryDetails, Integer> {

}
