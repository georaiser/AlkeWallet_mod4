/**
 * 
 */
package com.wallet.mod4.entidades;

/**
 * 
 */
public class AccountFactoryChecking implements AccountFactoryInterface {
	
	private double overdraft;

	public AccountFactoryChecking() {
	}

	@Override
	public AccountInterface createAccount(String Customer, String accountNumber, String currency, double balance) {
		
		return new AccountChecking(accountNumber, balance, currency, overdraft);
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	

}
