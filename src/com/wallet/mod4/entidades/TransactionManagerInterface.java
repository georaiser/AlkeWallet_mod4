/**
 * 
 */
package com.wallet.mod4.entidades;

import java.util.List;

/**
 *
 */
public interface TransactionManagerInterface {
	
	public void addTransaction(TransactionAbstract transaction);
	public List<TransactionAbstract> getTransactions(AccountInterface account);

}


