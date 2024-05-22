/**
 * 
 */
package com.wallet.mod4.entidades;

/**
 * Método para convertir un monto de una divisa a otra
 */
public interface CurrencyConverterInterface {
	
	public double convert(double amount, String fromCurrency, String toCurrency);

}
