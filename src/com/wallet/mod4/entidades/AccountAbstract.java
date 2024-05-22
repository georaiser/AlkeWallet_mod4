/**
 * 
 */
package com.wallet.mod4.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public abstract class AccountAbstract implements AccountInterface {
	
    private String accountNumber; // Atributo para número de cuenta
    private double balance; // Atributo para saldo de la cuenta
    private String currency; // define el tip de divisa
    private TransactionManagerAbstract transactionManager; // Atributo para transacciones
    
    
    public AccountAbstract(String accountNumber, double balance, String currency) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.currency = currency;
		this.transactionManager = createTransactionManager(); // Inicializar transaccionManager
	}

	protected abstract TransactionManagerAbstract createTransactionManager(); // create transactionManager

	public List<TransactionAbstract> getTransactions() {
        return transactionManager.getTransactions();
    }

    public void addTransaction(TransactionAbstract transaction) {
        transactionManager.addTransaction(transaction);
        updateBalance(transaction.getAmount());
    }
    
	// override/ implemet methods AccountInterface, ObserverFactoryInterface
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public double getBalance() {
        return balance;
    }	
	
}
