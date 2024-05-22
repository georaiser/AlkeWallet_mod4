package com.wallet.mod4.entidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CurrencyConverterTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
    public void testConvertSameCurrency() {
        CurrencyConverter converter = new CurrencyConverter();
        double amount = 1000.0;
        String currency = "USD";

        double convertedAmount = converter.convert(amount, currency, currency);

        assertEquals(amount, convertedAmount);
    }

    @Test
    public void testConvertDifferentCurrencies() {
        CurrencyConverter converter = new CurrencyConverter();
        double amount = 1.0;
        String fromCurrency = "USD";
        String toCurrency = "CLP";

        double convertedAmount = converter.convert(amount, fromCurrency, toCurrency);
        assertEquals(937.45, convertedAmount);
    }

    @Test
    public void testConvertUnsupportedCurrency() {
        CurrencyConverter converter = new CurrencyConverter();
        double amount = 1000.0;
        String fromCurrency = "USD";
        String toCurrency = "XYZ";

        assertThrows(IllegalArgumentException.class, () -> converter.convert(amount, fromCurrency, toCurrency));
    }
}
