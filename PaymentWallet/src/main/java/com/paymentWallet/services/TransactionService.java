package com.paymentWallet.services;

import java.time.LocalDate;
import java.util.List;

import com.paymentWallet.exception.TransactionException;
import com.paymentWallet.module.Transaction;
import com.paymentWallet.module.Wallet;

public interface TransactionService {

	
	public Transaction addTransaction(Transaction tran) throws TransactionException;
	public Transaction viewAllTransaction(Wallet wallet) throws TransactionException;
	public List<Transaction> viewTransactionByDate(LocalDate from, LocalDate to) throws TransactionException;
	public List<Transaction> viewAllTransaction(String type) throws TransactionException;
}
