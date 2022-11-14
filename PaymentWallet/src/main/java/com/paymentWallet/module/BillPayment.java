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
public class BillPayment {

	@Id
	private Integer billId;
	private Wallet wallet;
	private String billType;
	private double amount;
	private LocalDate paymentDate;
}
