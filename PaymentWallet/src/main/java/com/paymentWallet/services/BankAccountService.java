package com.paymentWallet.services;

import java.util.List;

import com.paymentWallet.exception.BankAccountException;
import com.paymentWallet.exception.WalletException;
import com.paymentWallet.module.BankAccount;
import com.paymentWallet.module.Wallet;

public interface BankAccountService {

	
	public Wallet addAccount(BankAccount account) throws BankAccountException, WalletException;
	public Wallet removeAccount(Integer id) throws BankAccountException, WalletException;
	public BankAccount viewAccount(Wallet wallet) throws BankAccountException;
	public List<BankAccount> viewAllAccount(Wallet wallet) throws BankAccountException;
	
}
