import java.text.DecimalFormat;
/*--------------------------------------------------------------------------
GWU CSCI 1112 Spring 2023
author: Charles Peeke, <your name>

TODO - Summarize this class

--------------------------------------------------------------------------*/

public class Account {
    // TODO:
    public String accountName;
    public int accountNumber;
    public double balance;

    //since i'm making it a linked list
    public Account next;

    //when a new account is called, it uses 
    public Account(String name) {
	accountName = name;
	balance = getBalance();
	System.out.println(balance);
	assignAccountNumber();
	this.next = null;
	        
    }

    // finds the ascii value of the name
    private void assignAccountNumber() {
	for (int i = 0; i < accountName.length(); i++) {
	    accountNumber += (int)accountName.charAt(i);
        }
    }

    // Getters and setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit and Withdraw Methods
    // deposits a specific amount into the balance 
    public void deposit(double amount) {
	balance += amount;

    }

    // withdraws an amount from the current balance, doesn't care if negative
    public void withdraw(double amount) {
	balance -= amount;

    }

    // TODO:
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        String s = "";
        s += "Account Name: " + this.accountName + " \t";
        s += "Account Number: " + this.accountNumber + " \t";
        s += "Balance: " + df.format(this.balance);
        return s;
    }
}
