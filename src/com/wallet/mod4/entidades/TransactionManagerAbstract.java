/**
 * 
 */
package com.wallet.mod4.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public abstract class TransactionManagerAbstract {
	
	protected List<TransactionAbstract> transactions;

	public TransactionManagerAbstract() {
		this.transactions = new ArrayList<>();
	}
	
	public void addTransaction(TransactionAbstract transaction) {
        transactions.add(transaction);
    }

    public List<TransactionAbstract> getTransactions() {
        return transactions;
    }
	
}
