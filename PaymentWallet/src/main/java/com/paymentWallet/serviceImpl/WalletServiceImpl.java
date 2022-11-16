package com.paymentWallet.serviceImpl;

import java.math.BigDecimal;
import java.util.List;

import com.paymentWallet.exception.WalletException;
import com.paymentWallet.module.Customer;
import com.paymentWallet.module.Wallet;
import com.paymentWallet.services.WalletService;

public class WalletServiceImpl implements WalletService {

	@Override
	public Customer createAccount(String name, String mobNo, BigDecimal amount) throws WalletException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer showBalance(String mobNO) throws WalletException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fundTransfer(String sourceMobileNo, String targetMobileNo, BigDecimal amount) throws WalletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer depositAmount(String mobileNO, BigDecimal amount) throws WalletException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getList() throws WalletException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateAccount(Customer customer) throws WalletException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer addMoney(Wallet wallet, double amount) throws WalletException {
		// TODO Auto-generated method stub
		return null;
	}

}
