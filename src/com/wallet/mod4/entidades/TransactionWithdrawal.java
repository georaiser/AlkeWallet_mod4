/**
 * 
 */
package com.wallet.mod4.entidades;

import java.time.LocalDateTime;

/**
 * 
 */
public class TransactionWithdrawal extends TransactionAbstract {

	public TransactionWithdrawal(double amount, String currency, LocalDateTime timestamp, AccountInterface account) {
		super(amount, currency, timestamp, account);
	}
	
}
