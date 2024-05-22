/**
 * 
 */
package com.wallet.mod4.entidades;

/**
 * Método para crear una nueva cuenta generica
 */
public interface AccountFactoryInterface {

    public  AccountInterface createAccount(String Customer, String accountNumber, String currency, double balance);
    
}