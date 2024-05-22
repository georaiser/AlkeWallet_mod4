/**
 * 
 */
package com.wallet.mod4.entidades;


/**
 * 
 */
public class AccountChecking extends AccountAbstract {
	
	private double overdraft;

	public AccountChecking(String accountNumber, double balance, String currency, double overdraft) {
		super(accountNumber, balance, currency);
		this.overdraft = overdraft;
	}

    @Override
    protected TransactionManagerAbstract createTransactionManager() {
        return new TransactionManagerChecking(overdraft);
    }

    public double getOverdraft() {
        return overdraft;
    }

	@Override
	public void updateBalance(double amount) {
		// TODO Auto-generated method stub
		
	}

	
}