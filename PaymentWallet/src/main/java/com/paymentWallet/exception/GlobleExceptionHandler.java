package com.paymentWallet.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import com.paymentWallet.module.ExceptionDetails;

@ControllerAdvice
public class GlobleExceptionHandler {

	@ExceptionHandler(BankAccountException.class)
	public ResponseEntity<ExceptionDetails>  bankExceptionHandler(BankAccountException account, WebRequest req) {
		
		ExceptionDetails details = new ExceptionDetails();
		details.setMassage(account.getMessage());
		details.setTimestamp(LocalDateTime.now());
		details.setDetails(req.getDescription(false));
		
		return new ResponseEntity<>(details , HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(BeneficiaryDetailsException.class)
	public ResponseEntity<ExceptionDetails>  beneficiaryExceptionHandler(BeneficiaryDetailsException account, WebRequest req) {
		
		ExceptionDetails details = new ExceptionDetails();
		details.setMassage(account.getMessage());
		details.setTimestamp(LocalDateTime.now());
		details.setDetails(req.getDescription(false));
		
		return new ResponseEntity<>(details , HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(BillPaymentException.class)
	public ResponseEntity<ExceptionDetails>  billPaymentExceptionHandler(BillPaymentException account, WebRequest req) {
		
		ExceptionDetails details = new ExceptionDetails();
		details.setMassage(account.getMessage());
		details.setTimestamp(LocalDateTime.now());
		details.setDetails(req.getDescription(false));
		
		return new ResponseEntity<>(details , HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(TransactionException.class)
	public ResponseEntity<ExceptionDetails>  TransactionExceptionHandler(TransactionException account, WebRequest req) {
		
		ExceptionDetails details = new ExceptionDetails();
		details.setMassage(account.getMessage());
		details.setTimestamp(LocalDateTime.now());
		details.setDetails(req.getDescription(false));
		
		return new ResponseEntity<>(details , HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<ExceptionDetails>  CustomerExceptionHandler(CustomerException account, WebRequest req) {
		
		ExceptionDetails details = new ExceptionDetails();
		details.setMassage(account.getMessage());
		details.setTimestamp(LocalDateTime.now());
		details.setDetails(req.getDescription(false));
		
		return new ResponseEntity<>(details , HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(WalletException.class)
	public ResponseEntity<ExceptionDetails>  WalletExceptionHandler(WalletException account, WebRequest req) {
		
		ExceptionDetails details = new ExceptionDetails();
		details.setMassage(account.getMessage());
		details.setTimestamp(LocalDateTime.now());
		details.setDetails(req.getDescription(false));
		
		return new ResponseEntity<>(details , HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionDetails>  ExceptionHandler(Exception account, WebRequest req) {
		
		ExceptionDetails details = new ExceptionDetails();
		details.setMassage(account.getMessage());
		details.setTimestamp(LocalDateTime.now());
		details.setDetails(req.getDescription(false));
		
		return new ResponseEntity<>(details , HttpStatus.BAD_REQUEST);
	}
}
