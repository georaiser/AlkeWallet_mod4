/**
 * 
 */
package com.wallet.mod4.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class TransactionManager implements TransactionManagerInterface {
	
	private List<TransactionAbstract> transactions;
	
	public TransactionManager() {
		this.transactions = new ArrayList<>();
	}

	@Override
	public void addTransaction(TransactionAbstract transaction) {
		transactions.add(transaction);	
	}

	@Override
	public List<TransactionAbstract> getTransactions(AccountInterface account) {
		// TODO Auto-generated method stub
		return transactions;
	}

}
