/**
 * 
 */
package com.wallet.mod4.entidades;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
    	////////////////////////////////////
    	
        // Crear instancias de las fábricas de cuentas cn tasa de interes en cuenta ahorro y sobregiro en cuenta crriente
        AccountFactoryInterface savingsAccountFactory = new AccountFactorySaving();
        AccountFactoryInterface checkingAccountFactory = new AccountFactoryChecking();

        // Crear instancia del administrador de transacciones
        TransactionManagerInterface transactionManager = new TransactionManager();

        // Crear instancia del convertidor de divisas
        CurrencyConverterInterface currencyConverter = new CurrencyConverter();
        
        
        ////////////////////////////////////

        // Crear un cliente
        Customer cliente1 = new Customer("Jorge Antonio", "13400000-3", "jorge.survey@gmail.com", "+56930000000");
        System.out.println(cliente1.getName());
        
        ////////////////////////////////////

        // Crear una cuenta de ahorros
        //se utiliza cast para convertir savingsAccount del tipo AccountAbstract
        AccountSavings savingsAccount1 = (AccountSavings) savingsAccountFactory.createAccount("cliente1", "123456789", "USD", 1000.0);
        savingsAccount1.setInterestRate(0.12);
        System.out.println(savingsAccount1.getInterestRate());
        
        AccountSavings savingsAccount2 = (AccountSavings) savingsAccountFactory.createAccount("cliente1", "123456789", "USD", 1000.0);
        savingsAccount2.setInterestRate(0.15);
        System.out.println(savingsAccount2.getInterestRate());
        
        // Crear una cuenta corriente
        AccountAbstract checkingAccount = (AccountAbstract) checkingAccountFactory.createAccount("cliente1", "987654321", "USD", 2000.0);

        
        ////////////////////////////////////

        // Realizar transacciones
        LocalDateTime timestamp = LocalDateTime.now();
        transactionManager.addTransaction(new TransactionDeposit(500.0, "USD", timestamp, checkingAccount));
        transactionManager.addTransaction(new TransactionDeposit(8500.0, "USD", timestamp, savingsAccount1));
        
        // a traves de cuentas
        savingsAccount1.addTransaction(new TransactionDeposit(500.0, "USD", timestamp, savingsAccount1));
        checkingAccount.addTransaction(new TransactionWithdrawal(300.0, "USD", timestamp, checkingAccount));
        
        checkingAccount.addTransaction(new TransactionTransfer(200.0, "USD", timestamp, savingsAccount1, checkingAccount));

        
        ////////////////////////////////////
        
        // Obtener e imprimir el saldo de las cuentas
        System.out.println("Saldo de la cuenta de ahorros: " + savingsAccount1.getBalance());
        System.out.println("Saldo de la cuenta corriente: " + checkingAccount.getBalance());

        // Obtener e imprimir el historial de transacciones de las cuentas
        List<TransactionAbstract> savingsTransactions = savingsAccount1.getTransactions();
        List<TransactionAbstract> checkingTransactions = checkingAccount.getTransactions();
        
        // Obtener e imprimir el historial de transacciones de las cuentas
        List<TransactionAbstract> savingsTransactionsMan = transactionManager.getTransactions(savingsAccount1);
        List<TransactionAbstract> checkingTransactionsMan = transactionManager.getTransactions(checkingAccount);

        System.out.println("Historial de transacciones de la cuenta de ahorros:");
        for (TransactionAbstract transaction : savingsTransactions) {
            System.out.println(transaction.getAmount() + " " + transaction.getCurrency() + " " + transaction.getTimestamp());
        }

        System.out.println("Historial de transacciones de la cuenta corriente:");
        for (TransactionAbstract transaction : checkingTransactions) {
            System.out.println(transaction.getAmount() + " " + transaction.getCurrency() + " " + transaction.getTimestamp());
        }
        
        ////////////////////////////////////
        
        // Realizar una conversión de divisa
        double amountToConvert = 1000.0;
        String fromCurrency = "CLP";
        String toCurrency = "CAD";
        double convertedAmount = currencyConverter.convert(amountToConvert, fromCurrency, toCurrency);
        System.out.println("Convert " + amountToConvert + " " + fromCurrency + " to " + convertedAmount + " " + toCurrency);

	}

}
