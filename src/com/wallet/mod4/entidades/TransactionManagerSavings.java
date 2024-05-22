/**
 * 
 */
package com.wallet.mod4.entidades;

/**
 * 
 */
public class TransactionManagerSavings extends TransactionManagerAbstract{
	
	private double interestRate;

    public TransactionManagerSavings(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void addTransaction(TransactionAbstract transaction) {
        super.addTransaction(transaction);

        if (transaction instanceof TransactionDeposit) {
            AccountInterface account = transaction.getAccount();
            double amount = transaction.getAmount();
            double interest = amount * interestRate;
            account.updateBalance(interest); // Agregar interés al saldo de la cuenta
        }
    }
	
	

}