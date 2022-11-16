package com.paymentWallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
public class PaymentWalletApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(PaymentWalletApplication.class, args);
	}

}
