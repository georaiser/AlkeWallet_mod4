/**
 * 
 */
package com.wallet.mod4.entidades;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class TransactionWithdrawalTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.wallet.mod4.entidades.TransactionWithdrawal#TransactionWithdrawal(double, java.lang.String, java.time.LocalDateTime, com.wallet.mod4.entidades.AccountInterface)}.
	 */
	@Test
	void testTransactionWithdrawal() {
		double amount = 500.0;
        String currency = "EUR";
        LocalDateTime timestamp = LocalDateTime.now();
        TransactionWithdrawal transaction = new TransactionWithdrawal(amount, currency, timestamp, null);

        assertEquals(amount, transaction.getAmount());
        assertEquals(currency, transaction.getCurrency());
        assertEquals(timestamp, transaction.getTimestamp());
	}

	

}
