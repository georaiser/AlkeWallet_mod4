/**
 * 
 */
package com.wallet.mod4.entidades;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
public class CurrencyConverter implements CurrencyConverterInterface {


	private Map<String, Double> exchangeRates;

    public CurrencyConverter() {
        // Inicializar las tasas de cambio, base dolar US.
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.93);
        exchangeRates.put("CLP", 937.45);
        exchangeRates.put("CAD", 1.38);

    }

    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (fromCurrency.equals(toCurrency)) {
            return amount; // No se requiere conversión
        }

        // Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
        double fromRate = exchangeRates.getOrDefault(fromCurrency, 0.0);
        double toRate = exchangeRates.getOrDefault(toCurrency, 0.0);

        if (fromRate == 0.0 || toRate == 0.0) {
            throw new IllegalArgumentException("Divisa no soportada");
        }

        double convertedAmount = amount * (toRate / fromRate);
        return convertedAmount;
    }
	

}
