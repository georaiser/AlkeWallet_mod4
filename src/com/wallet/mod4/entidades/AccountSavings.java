/**
 * 
 */
package com.wallet.mod4.entidades;

import java.util.List;

/**
 * 
 */
public class AccountSavings extends AccountAbstract {
	
	private double interestRate;

	public AccountSavings(String accountNumber, double balance, String currency, double interestRate) {
		super(accountNumber, balance, currency);
		this.setInterestRate(interestRate);
	}

	@Override
    protected TransactionManagerAbstract createTransactionManager() {
        return new TransactionManagerSavings(interestRate);
    }

    public double getInterestRate() {
        return interestRate;
    }

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public void updateBalance(double amount) {
		// TODO Auto-generated method stub
		
	}
    
    
	
}
