package com.paymentWallet.module;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Digits;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class BankAccount {

	@Id
	private Integer accountNo;
	private String ifscCode;
	private String backname;
	private double balance;
	private Wallet wallet;
	
}
