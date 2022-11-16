package com.paymentWallet.serviceImpl;

import java.time.LocalDate;
import java.util.List;

import com.paymentWallet.exception.TransactionException;
import com.paymentWallet.module.Transaction;
import com.paymentWallet.module.Wallet;
import com.paymentWallet.services.TransactionService;

public class TransactionServiceImpl implements TransactionService {

	@Override
	public Transaction addTransaction(Transaction tran) throws TransactionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction viewAllTransaction(Wallet wallet) throws TransactionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> viewTransactionByDate(LocalDate from, LocalDate to) throws TransactionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> viewAllTransaction(String type) throws TransactionException {
		// TODO Auto-generated method stub
		return null;
	}

}
