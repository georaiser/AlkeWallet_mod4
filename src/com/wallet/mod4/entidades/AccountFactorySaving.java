/**
 * 
 */
package com.wallet.mod4.entidades;

public class AccountFactorySaving implements AccountFactoryInterface {
	
	private double interestRate;

	
	public AccountFactorySaving() {
		super();
	}
	@Override
	public AccountInterface createAccount(String Customer, String accountNumber, String currency, double balance) {
		return new AccountSavings(accountNumber, balance, currency, interestRate);
	}
	
	
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	

}
