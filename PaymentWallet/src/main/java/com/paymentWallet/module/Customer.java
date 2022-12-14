package com.paymentWallet.module;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Customer {

	@Id
	private String name;
	private String mobileNumber;
	private String password;
	
	@OneToOne
	private Wallet wallet;
}
