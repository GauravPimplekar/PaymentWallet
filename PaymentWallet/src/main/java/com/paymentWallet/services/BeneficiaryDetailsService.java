package com.paymentWallet.services;

import java.util.List;

import com.paymentWallet.exception.BeneficiaryDetailsException;
import com.paymentWallet.module.BeneficiaryDetails;
import com.paymentWallet.module.Customer;

public interface BeneficiaryDetailsService {

	
	public BeneficiaryDetails addBenificiary(BeneficiaryDetails bd) throws BeneficiaryDetailsException;
	public BeneficiaryDetails removeBeneficiary(BeneficiaryDetails bd) throws BeneficiaryDetailsException;
	public BeneficiaryDetails viewBeneficiary(String mobNo) throws BeneficiaryDetailsException;
	public List<BeneficiaryDetails> viewAllBeneficiary(Customer customer) throws BeneficiaryDetailsException;
}
