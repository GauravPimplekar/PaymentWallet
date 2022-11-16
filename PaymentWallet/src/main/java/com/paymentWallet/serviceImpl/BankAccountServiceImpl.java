package com.paymentWallet.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentWallet.exception.BankAccountException;
import com.paymentWallet.exception.WalletException;
import com.paymentWallet.module.BankAccount;
import com.paymentWallet.module.Wallet;
import com.paymentWallet.repo.BankAccountRepo;
import com.paymentWallet.services.BankAccountService;


@Service
public class BankAccountServiceImpl implements BankAccountService {
	
	@Autowired
	private BankAccountRepo bRepo;

	@Override
	public Wallet addAccount(BankAccount account) throws BankAccountException, WalletException {
		// TODO Auto-generated method stub
		
		if(account == null) {
			throw new BankAccountException("Account is not available");
		}
		
		bRepo.save(account);
		
		if(account.getWallet() == null) {
			throw new WalletException("Account not have a wallet");
		}
		
		return account.getWallet();
	}

	@Override
	public Wallet removeAccount(Integer id) throws BankAccountException, WalletException {
		// TODO Auto-generated method stub
		
		BankAccount acc = bRepo.findById(id).orElseThrow(() -> new BankAccountException("Account not available for deletation"));
		
		
		if(acc.getWallet() == null) {
			throw new WalletException("Account not have a wallet");
		}
		
		bRepo.deleteById(id);
		return acc.getWallet();
	}

	@Override
	public BankAccount viewAccount(Wallet wallet) throws BankAccountException {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public List<BankAccount> viewAllAccount(Wallet wallet) throws BankAccountException {
		// TODO Auto-generated method stub
		
		List<BankAccount> list = bRepo.getList(wallet);
		return list;
	}

}
