package com.paymentWallet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paymentWallet.exception.BankAccountException;
import com.paymentWallet.exception.WalletException;
import com.paymentWallet.module.BankAccount;
import com.paymentWallet.module.Wallet;
import com.paymentWallet.services.BankAccountService;




@RestController
public class BankAccountController {

	
	@Autowired
	public BankAccountService bService;
	
	@PostMapping("/addAccount")
	public ResponseEntity<Wallet> addAccount(@RequestBody BankAccount account) throws BankAccountException, WalletException {
		
		Wallet wallet = bService.addAccount(account);
		
		return new ResponseEntity<>(wallet, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteAccount/{id}")
	public ResponseEntity<Wallet> removeAccount(@PathVariable Integer id) throws BankAccountException, WalletException{
		
		Wallet wallet = bService.removeAccount(id);
		
		return new ResponseEntity<Wallet>(wallet, HttpStatus.ACCEPTED);
	}
	
	
	public ResponseEntity<BankAccount> viewAccount(@RequestBody Wallet wallet){
		
		return null;
	}
	
	
	@GetMapping("/getList")
	public ResponseEntity<String> getList(@RequestBody Wallet wallet) throws BankAccountException{
		
		List<BankAccount> list = bService.viewAllAccount(wallet);
		
		return new ResponseEntity<>("it's work", HttpStatus.ACCEPTED);
	}
	
}
