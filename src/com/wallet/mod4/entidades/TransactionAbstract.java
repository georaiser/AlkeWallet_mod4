/**
 * 
 */
package com.wallet.mod4.entidades;

import java.time.LocalDateTime;

/**
 * 
 */
public abstract class TransactionAbstract {
	
	private double amount; // Atributo para monto de la transacción
    private String currency; // Atributo para divisa de la transacción
    private LocalDateTime timestamp; // Atributo para fecha y hora de la transacción
    protected AccountInterface account; // atributo para obtener cuenta
    
	public TransactionAbstract(double amount, String currency, LocalDateTime timestamp, AccountInterface account) {
		this.amount = amount;
		this.currency = currency;
		this.timestamp = timestamp;
		this.account = account;
	}


	 public double getAmount() {
	        return amount;
	    }

	    public String getCurrency() {
	        return currency;
	    }

	    public LocalDateTime getTimestamp() {
	        return timestamp;
	    }
	    
	    public AccountInterface getAccount() {
	        return account;
	    }


		
}
