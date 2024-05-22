/**
 * 
 */
package com.wallet.mod4.entidades;

import java.util.List;

/**
 * 
 */
public class TransactionManagerChecking extends TransactionManagerAbstract {
	
	private double overdraftLimit;	
	
	public TransactionManagerChecking(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
    public void addTransaction(TransactionAbstract transaction) {
        AccountInterface account = transaction.getAccount();
        double amount = transaction.getAmount();

        if (transaction instanceof TransactionWithdrawal) {
            double newBalance = account.getBalance() - amount;
            if (newBalance < -overdraftLimit) {
                // Sobregiro excedido, no se permite la transacción
                System.out.println("Transacción rechazada: Sobregiro excedido");
                return;
            }
        }

        super.addTransaction(transaction);
        account.updateBalance(-amount); // Actualizar el saldo de la cuenta      
	}
	
}
