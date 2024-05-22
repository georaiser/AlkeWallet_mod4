/**
 * 
 */
package com.wallet.mod4.entidades;

import java.time.LocalDateTime;

/**
 * 
 */
public class TransactionTransfer extends TransactionAbstract {

	private AccountInterface fromAccount;
    private AccountInterface toAccount;
	
    
    public TransactionTransfer(double amount, String currency, LocalDateTime timestamp, AccountInterface fromAccount,
			AccountInterface toAccount) {
		super(amount, currency, timestamp, toAccount);
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
	}


	public AccountInterface getFromAccount() {
		return fromAccount;
	}


	public void setFromAccount(AccountInterface fromAccount) {
		this.fromAccount = fromAccount;
	}


	public AccountInterface getToAccount() {
		return toAccount;
	}


	public void setToAccount(AccountInterface toAccount) {
		this.toAccount = toAccount;
	}
    
    
	
	

	
}
