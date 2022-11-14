package com.paymentWallet.module;

import java.time.LocalDate;

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
public class Transaction {

	@Id
	private Integer transactionId;
	private String transactionType;
	private LocalDate transactionDate;
	private Wallet wallet;
	private String description;
}
