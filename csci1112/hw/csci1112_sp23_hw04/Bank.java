/*--------------------------------------------------------------------------
GWU CSCI 1112 Spring 2023
author: Charles Peeke, Ilinca Hirtopanu

TODO - Summarize this class

--------------------------------------------------------------------------*/

public class Bank {
    // TODO:
    public String bankName;
    private Account[] accounts;
    private Queue transactions;
    private int count;
    private int transactionNum;
    
    ///bank constructor
    public Bank(String name) {
	bankName = name;
	count = getNumberOfAccounts();
	accounts = new Account[2];
	transactions = new Queue();
    }

    //creates a new account
    public int createAccount(String name) {
	
	//if the array is full, it needs to be resized
	if (count == accounts.length) {
	    reallocateAccounts();
	}
	Account account = new Account(name);
	accounts[count] = account;
	count++;
	return account.getAccountNumber();
    }


    //closes the new account
    public double closeAccount(int accountNumber) {
        // finds the account being looked for
        for (int i = 0; i < count; i++) {
	    
            if (accounts[i].getAccountNumber() == accountNumber) {
                double deletedBalance = accounts[i].getBalance();
		
                //Move all the elements down one index to remove the account from the array
                for (int j = i; j < count - 1; j++) {
                    accounts[j] = accounts[j+1];
                }
                accounts[count - 1] = null;
                count--;
                return deletedBalance;
            }
        }
        return -1;
    }

    // returns the balance of a specific account
    public double getBalance(int accountNumber) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i].getBalance();
            }
        }
        return -1;
    }
    

    ///add the amount to the account number
    // goes through all the elements in the array and if it's found deposits that amount of money
    public void deposit(int accountNumber, double amount) {
	//searches the array to see if it's in it, and record the position
	 for (int i = 0; i < count; i++) {
	    if (accounts[i].getAccountNumber() == (accountNumber)) {
	        accounts[i].deposit(amount);
	    }
	 }       
    }

    /// withdraw the amount from the account number
    public void withdraw(int accountNumber, double amount) {

        //searches the array to see if it's in it, and record the position
	 for (int i = 0; i < count; i++) {
	    if (accounts[i].getAccountNumber() == (accountNumber)) {
	        accounts[i].withdraw(amount);
	    }
	 }       
    }

    // ----------------------------------------
    // Transactions Methods
    /// adds the transaction to the queue
    public void addTransaction(Transaction t) {
	transactions.enqueue(t);
	transactionNum++;
	
    }

    /// processes which operation goes through from the front of the queue
    //0: open account, 1/2: deposit/withdraw
    public void processTransaction() {
        Transaction toProcess = transactions.dequeue();

	//opening or closing an account
	if (toProcess.getOperation() == 0) {

	    //if it's tried to close the account using the account number associated with the transaction,
	    //and it's returned -1, the account doesn't exist which means that the 0 operation
	    //must be to open a new account

	    boolean inQueue = false;
	    for(int i = 0; i < count; i++){
		if (toProcess.getAccountNumber() == accounts[i].getAccountNumber()) {
		    closeAccount(toProcess.getAccountNumber());
		    inQueue = true;
		    break;
		}
	    }

	    if(inQueue == false) {
		createAccount(Character.toString((char)toProcess.getAccountNumber()));
	    }
	}
	//if it's depositing
	else if (toProcess.getOperation() == 1 ) {
	    deposit(toProcess.getAccountNumber(), toProcess.getAmount());
	}
	//deposit
	else if (toProcess.getOperation() == 2) {
	    withdraw(toProcess.getAccountNumber(), toProcess.getAmount());
	}
	transactionNum--;
	    
    }	    

    //
    private void reallocateAccounts () {
	// if the array is full, double the size of it
	Account[] tempArr = new Account[2 * accounts.length];
	
	//make a deep copy of the original array
	for (int i = 0; i < count; i++) {
	    tempArr[i] = accounts[i];
	}
        //make accounts be a pointer to the larger arraylist, so it can still be accessed

	accounts = tempArr; 
	    
	  
    }

    // ----------------------------------------
    /// TODO:  
    public String getBankName() {
        return bankName;
    }

    public int getNumberOfAccounts() {
        return count;
    }

    public int getNumberOfTransactions() {
        return transactionNum;
    }

    // TODO:
    @Override
    public String toString() {
        String s = "Bank Name: " + bankName + " \n";
        s += "Number of Accounts: " + count + " | ";
        s += "Number of Pending Transactions: " + transactions.size() + "\n";
        s += "Accounts: \n";
        for (int i = 0; i < count; i++) {
            s += accounts[i].toString() + " \n";
        }
        return s;
    }
}
