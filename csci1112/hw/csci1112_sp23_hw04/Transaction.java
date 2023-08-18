/*--------------------------------------------------------------------------
GWU CSCI 1112 Spring 2023
author: Charles Peeke, <your name>

TODO - Summarize this class

--------------------------------------------------------------------------*/
public class Transaction {
    // TODO:
    public int accountNumber;
    private int operation;
    private double amount;

    /// set the parameters in Transaction to the global variables in the class
    //if operation is 0, opening/closing accounts & content = Double.parseDouble(content);
    //if operation is 1, deposit/2-withdraw so content is the value to be done
    //if operation is 4, it's a fake one
    public Transaction(int acctNumber, int operation, String content) {
	accountNumber = acctNumber;
	this.operation = operation;

	if (operation == 0) {
	    if (content == null || content == "") {
		amount = 0.0;
	    }
	    else {
		amount = Double.parseDouble(content);
	    }
	}

	//withdrawal or deposit
	else if (operation == 1 || operation == 2) {
	    amount = Double.parseDouble(content);
	}
	else if (operation == 4) {
	    amount = translateOldOperation(content);
	}
    }

    ///returns the account number of the Transaction
    public int getAccountNumber() {
        return accountNumber;
    }

    ///returns the operation number of the Transaction
    public int getOperation() {
        return operation;
    }

    ///returns the amount of the Transaction
    public double getAmount() {
        return amount;
    }

    //The function will parse the content of the logged transaction
    //(String[] contentArray = content.split(" ");),
    //calculate the amount and store into the instance variable,
    //and then determine whether the transaction should be a deposit or
    //withdrawal reflecting a positive or negative amount.
    private double translateOldOperation(String content) {

	Stack stack = new Stack();
        String[] contentArray = content.split(" ");
	double total = 0;
        for (int i = 0; i < contentArray.length; i++) {
	    
	    //if the item is a digit, push it into the stack
	    if (contentArray[i].matches("\\d+(\\.\\d+)?")) {
		stack.push(contentArray[i]);
	    }

	    //if the element is not a digit, pop the numbers, then push
	    //their combination onto the stack
	    else {

		//the product of the numbers' combination
		total = 0;
       
		if (contentArray[i].equals("+")){
		    double right = Double.parseDouble(stack.pop());
		    double left = Double.parseDouble(stack.pop());
		    total = left + right;
		}
		else if (contentArray[i].equals("-")) {
		    double right = Double.parseDouble(stack.pop());
		    double left = Double.parseDouble(stack.pop());
		    total = left - right;
		}
		else if (contentArray[i].equals("/")) {
		    double right = Double.parseDouble(stack.pop());
		    double left = Double.parseDouble(stack.pop());
		    total = left / right;
		}
		else if (contentArray[i].equals("*")) {
		    double right = Double.parseDouble(stack.pop());
		    double left = Double.parseDouble(stack.pop());
		    total = left * right;
		}
		//track the total each time by putting it on the stack	
		stack.push(total + "");
	    }
	}
	//deposit
	if (total >= 0) {
	    operation = 1;
	    return total;
	}

	//withdrawal
	else {
	    operation = 2;
	    return total * -1;
	}
	   
    }


    /// represents the bank opject as a string
    @Override
    public String toString() {
        String operationString = "";
        if (this.operation == 0) {
            operationString = "Create";
        }
        else if (this.operation == 1) {
            operationString = "Deposit";
        }
        else if (this.operation == 2) {
            operationString = "Withdraw";
        }
        else {
            operationString = "Error";
        }
        return "Transaction [accountNumber=" + accountNumber + ", operation=" + operationString + ", amount=" + amount + "]";
    }
}
