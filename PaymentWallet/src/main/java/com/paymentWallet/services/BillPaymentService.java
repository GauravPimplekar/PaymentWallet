package com.paymentWallet.services;

import com.paymentWallet.exception.BillPaymentException;
import com.paymentWallet.module.BillPayment;

public interface BillPaymentService {

	
	public BillPayment addBillPayment(BillPayment bill) throws BillPaymentException;
	public BillPayment viewBilPayment(BillPayment bill) throws BillPaymentException;
}
