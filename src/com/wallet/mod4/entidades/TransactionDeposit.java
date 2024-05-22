/**
 * 
 */
package com.wallet.mod4.entidades;

import java.time.LocalDateTime;

/**
 * 
 */
public class TransactionDeposit extends TransactionAbstract {

	public TransactionDeposit(double amount, String currency, LocalDateTime timestamp, AccountInterface account) {
		super(amount, currency, timestamp, account);
	}

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		return super.getAmount();
	}

	@Override
	public String getCurrency() {
		// TODO Auto-generated method stub
		return super.getCurrency();
	}

	@Override
	public LocalDateTime getTimestamp() {
		// TODO Auto-generated method stub
		return super.getTimestamp();
	}

	@Override
	public AccountInterface getAccount() {
		// TODO Auto-generated method stub
		return super.getAccount();
	}


	
	
	
}
