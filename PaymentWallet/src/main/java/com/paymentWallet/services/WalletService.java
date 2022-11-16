package com.paymentWallet.services;

import java.math.BigDecimal;
import java.util.List;

import com.paymentWallet.exception.WalletException;
import com.paymentWallet.module.Customer;
import com.paymentWallet.module.Wallet;

public interface WalletService {

	
	public Customer createAccount(String name, String mobNo, BigDecimal amount) throws WalletException;
	public Customer showBalance(String mobNO) throws WalletException;
	public void fundTransfer(String sourceMobileNo, String targetMobileNo, BigDecimal amount) throws WalletException;
	public Customer depositAmount(String mobileNO,  BigDecimal amount) throws WalletException;
	public List<Customer> getList() throws WalletException;
	public Customer updateAccount(Customer customer) throws WalletException;
	public Customer addMoney(Wallet wallet, double amount) throws WalletException;
}
