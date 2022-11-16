package com.paymentWallet.services;

import com.paymentWallet.exception.CustomerException;
import com.paymentWallet.module.Customer;

public interface UserService {

	public Customer validateLogin(String mobNo, String password) throws CustomerException;
}
