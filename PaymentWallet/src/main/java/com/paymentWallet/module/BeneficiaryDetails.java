package com.paymentWallet.module;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class BeneficiaryDetails {

	
	private String name;
	@Id
	private String mobileNumber;
}
