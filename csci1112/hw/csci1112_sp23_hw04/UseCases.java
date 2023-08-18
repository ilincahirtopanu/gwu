import java.util.Random;
/*--------------------------------------------------------------------------
GWU CSCI 1112 Spring 2023
author: Charles Peeke

This class contains example use cases for the banking system.
Simple withdraw and deposit transactions are performed on a set of accounts.
Creating and printing accounts is also demonstrated.

--------------------------------------------------------------------------*/

public class UseCases {
    public static void main(String[] args) {
        // Simple Create, Withdraw, and Deposit
        useCase1();

        // Same as useCase1, but with transactions only
        useCase2();

        // Old Transactions that requires Translation
        useCase3();

    }

    /// Use Case 1 - Create an account, deposit, withdraw, and print account information
    public static void useCase1() {
        Bank b = new Bank("GWU Bank");
        // Create a new account
        int[] accounts = new int[6];

        accounts[0] = b.createAccount("Charles");
        accounts[1] = b.createAccount("James");
        accounts[2] = b.createAccount("Tim");
        accounts[3] = b.createAccount("Peter");
        accounts[4] = b.createAccount("Ezekiel");
        accounts[5] = b.createAccount("Marcus");
        
        System.out.println(b);

        Random r = new Random();

        // Deposit and withdraw money
        for (int i = 0; i < 20; i++) {
            // Get a random account number and a random amount
            // Deposit money
            int accountNumber = r.nextInt(6);
            double amount = r.nextDouble() * 100;
            b.deposit(accounts[accountNumber], amount);

            // Get a random account number and a random amount
            // Withdraw money
            accountNumber = r.nextInt(6);
            amount = r.nextDouble() * 10;
            b.withdraw(accounts[accountNumber], amount);
            System.out.println(b);
        }
    }
    
    /// Use Case 2 - Create an account, deposit, withdraw, and print account information
    public static void useCase2() {
        Bank b = new Bank("GWU Bank");
        Random r = new Random();
        // Create a new account
        Transaction t = new Transaction(65, 0, null);
        // Add 20 transactions
        for (int i = 0; i < 20; i++) {
            // Get a random account number
            int accountNumber = r.nextInt(26)+65;
            t = new Transaction(accountNumber, 0, "");
            b.addTransaction(t);
        }

        System.out.println(b);

        // Deposit and withdraw money
        for (int i = 0; i < 20; i++) {
            // Get a random account number and a random amount
            double amount = r.nextDouble() * 100;
            t = new Transaction(65, 1, amount+"");
            b.addTransaction(t);
        }
        System.out.println(b);

        int allTrans = b.getNumberOfTransactions();
        for (int i = 0; i < allTrans; i++) {
            b.processTransaction();
        }
        System.out.println(b);
    }

    /// Use Case 3 - Create an account, deposit, withdraw, and print account information
    /// Using only transactions that require translation
    public static void useCase3() {
        Bank b = new Bank("GWU Bank");

        // Create a new account
        Transaction t = new Transaction(67, 0, null);
        System.out.println(t);
        b.addTransaction(t);
        // Deposit Money
        t = new Transaction(67, 1, "16.4");
        System.out.println(t);
        b.addTransaction(t);
        // Deposit? Withdraw? It's an old transaction
        t = new Transaction(67, 5, "16 4 / 2 5 * + 4 +");
        System.out.println(t);
        b.addTransaction(t);
        
        // Process all transactions
        System.out.println(b);
        b.processTransaction();
        System.out.println(b);
        b.processTransaction();
        System.out.println(b);
        b.processTransaction();
        System.out.println(b);

        // Close the account
        System.out.println("Closing account 67");
        t = new Transaction(67, 0, null);
        b.addTransaction(t);
        b.processTransaction();

        System.out.println(b);
    }
}
