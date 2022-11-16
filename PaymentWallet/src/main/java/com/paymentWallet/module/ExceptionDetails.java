package com.paymentWallet.module;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExceptionDetails {

	private String details;
	private String massage;
	private LocalDateTime timestamp;
	
}
