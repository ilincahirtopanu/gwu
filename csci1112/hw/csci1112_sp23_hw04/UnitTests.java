/*--------------------------------------------------------------------------
GWU CSCI 1112 Spring 2023
author: Charles Peeke

TODO - Summarize this class

--------------------------------------------------------------------------*/

public class UnitTests {

    private static boolean equals(double a, double b) {
        double epsilon = 1e-8;
        double diff = Math.abs(a - b);
        if (diff < epsilon) { 
            return true;
        }
        return false;
    }

    /// The main function acts as the test harness.  Any unit tests must be
    /// registered in this function.
    public static void main(String[] args) {

        // passedAll tracks whether all tests have passed.
        boolean passedAll = true;

        // fail tracks whether any test has failed.
        boolean fail = false;

        // ---------------------------------------------------------------

        System.out.println("Block 1 Unit Tests");

        System.out.println("Unit Test 1.1 - Begin");
    	if( unitTest1_1() ) {
    	    System.out.println("Unit Test 1.1 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 1.1 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 1.2 - Begin");
    	if( unitTest1_2() ) {
    	    System.out.println("Unit Test 1.2 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 1.2 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 1.3 - Begin");
    	if( unitTest1_3() ) {
    	    System.out.println("Unit Test 1.3 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 1.3 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 1.4 - Begin");
    	if( unitTest1_4() ) {
    	    System.out.println("Unit Test 1.4 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 1.4 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 1.5 - Begin");
    	if( unitTest1_5() ) {
    	    System.out.println("Unit Test 1.5 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 1.5 - Failed");
            fail = true;
    	}

        if( fail ) {
            System.out.println("Failed Block 1 Unit Testing");
            return;
        } else {
            System.out.println("Passed Block 1 Unit Testing");
        }

        // ---------------------------------------------------------------

        fail = false;
        System.out.println("Block 2 Unit Tests");

        System.out.println("Unit Test 2.1 - Begin");
    	if( unitTest2_1() ) {
    	    System.out.println("Unit Test 2.1 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 2.1 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 2.2 - Begin");
    	if( unitTest2_2() ) {
    	    System.out.println("Unit Test 2.2 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 2.2 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 2.3 - Begin");
    	if( unitTest2_3() ) {
    	    System.out.println("Unit Test 2.3 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 2.3 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 2.4 - Begin");
    	if( unitTest2_4() ) {
    	    System.out.println("Unit Test 2.4 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 2.4 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 2.5 - Begin");
    	if( unitTest2_5() ) {
    	    System.out.println("Unit Test 2.5 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 2.5 - Failed");
            fail = true;
    	}

        if( fail ) {
            System.out.println("Failed Block 2 Unit Testing");
            return;
        } else {
            System.out.println("Passed Block 2 Unit Testing");
        }
 
        // ---------------------------------------------------------------

        fail = false;
        System.out.println("Block 3 Unit Tests");

        System.out.println("Unit Test 3.1 - Begin");
    	if( unitTest3_1() ) {
    	    System.out.println("Unit Test 3.1 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 3.1 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 3.2 - Begin");
    	if( unitTest3_2() ) {
    	    System.out.println("Unit Test 3.2 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 3.2 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 3.3 - Begin");
    	if( unitTest3_3() ) {
    	    System.out.println("Unit Test 3.3 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 3.3 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 3.4 - Begin");
    	if( unitTest3_4() ) {
    	    System.out.println("Unit Test 3.4 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 3.4 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 3.5 - Begin");
    	if( unitTest3_5() ) {
    	    System.out.println("Unit Test 3.5 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 3.5 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 3.6 - Begin");
    	if( unitTest3_6() ) {
    	    System.out.println("Unit Test 3.6 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 3.6 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 3.7 - Begin");
    	if( unitTest3_7() ) {
    	    System.out.println("Unit Test 3.7 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 3.7 - Failed");
            fail = true;
    	}

        if( fail ) {
            System.out.println("Failed Block 3 Unit Testing");
            return;
        } else {
            System.out.println("Passed Block 3 Unit Testing");
        }

        // ---------------------------------------------------------------

        fail = false;
        System.out.println("Block 4 Unit Tests");

        System.out.println("Unit Test 4.1 - Begin");
    	if( unitTest4_1() ) {
    	    System.out.println("Unit Test 4.1 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 4.1 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 4.2 - Begin");
    	if( unitTest4_2() ) {
    	    System.out.println("Unit Test 4.2 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 4.2 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 4.3 - Begin");
    	if( unitTest4_3() ) {
    	    System.out.println("Unit Test 4.3 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 4.3 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 4.4 - Begin");
    	if( unitTest4_4() ) {
    	    System.out.println("Unit Test 4.4 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 4.4 - Failed");
            fail = true;
    	}


        System.out.println("Unit Test 4.5 - Begin");
    	if( unitTest4_5() ) {
    	    System.out.println("Unit Test 4.5 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 4.5 - Failed");
            fail = true;
    	}

        if( fail ) {
            System.out.println("Failed Block 4 Unit Testing");
            return;
        } else {
            System.out.println("Passed Block 4 Unit Testing");
        }

        // ---------------------------------------------------------------

        fail = false;
        System.out.println("Block 5 Unit Tests");

        System.out.println("Unit Test 5.1 - Begin");
    	if( unitTest5_1() ) {
    	    System.out.println("Unit Test 5.1 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 5.1 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 5.2 - Begin");
    	if( unitTest5_2() ) {
    	    System.out.println("Unit Test 5.2 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 5.2 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 5.3 - Begin");
    	if( unitTest5_3() ) {
    	    System.out.println("Unit Test 5.3 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 5.3 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 5.4 - Begin");
    	if( unitTest5_4() ) {
    	    System.out.println("Unit Test 5.4 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 5.4 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 5.5 - Begin");
    	if( unitTest5_5() ) {
    	    System.out.println("Unit Test 5.5 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 5.5 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 5.6 - Begin");
    	if( unitTest5_6() ) {
    	    System.out.println("Unit Test 5.6 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 5.6 - Failed");
            fail = true;
    	}

        if( fail ) {
            System.out.println("Failed Block 5 Unit Testing");
            return;
        } else {
            System.out.println("Passed Block 5 Unit Testing");
        }

        // ---------------------------------------------------------------

        if (passedAll) {
            System.out.println("! Passed All Unit Tests !");
        } else {
            System.out.println("Failed Unit Tests");
        }
    }

    //========================= Unit Tests ========================= 
    /// Block 1: Account Class
    /// Validates the creation of a new account 
    /// Given a name for the account, the account number should be equal
    /// to the sum of the ascii values of the characters in the name
    public static boolean unitTest1_1() {
        // Create a new account to verify the constructor
        Account a = new Account("John");
        if (a.getAccountNumber() != 399) {
            System.out.println("Account number is not 399");
            return false;
        }

        a = new Account("A");
        if (a.getAccountNumber() != 65) {
            System.out.println("Account number is not 65");
            return false;
        }

        return true;
    }


    /// Validates the balance of a new account.
    /// By default, should be 0 when the account is created
    public static boolean unitTest1_2() {
        // Create a new account to verify the constructor
        Account a = new Account("Johm");
        if (a.getAccountNumber() != 398) {
            System.out.println("Account number is not 398");
            return false;
        }
        // A new account should have a balance of 0
        if(equals(a.getBalance(), 0) == false ) {
            System.out.println("Account balance is not 0");
            return false;
        }
	    return true;
    }

    /// Validates the deposit method for an already created account
    public static boolean unitTest1_3() {
        // Create a new account to verify the constructor
        Account a = new Account("Jphn");
        if (a.getAccountNumber() != 400) {
            System.out.println("Account number is not 400");
            return false;
        }
        // A new account should have a balance of 0
        if(equals(a.getBalance(), 0) == false) {
            System.out.println("Account balance is not 0");
            return false;
        }
        // Deposit 100 into the account
        a.deposit(100);
        // Verify the balance is now 100
        if(equals(a.getBalance(), 100) == false) {
            System.out.println("Account balance is not 100");
            return false;
        }
	    return true;
    }

    /// Creates an account, then deposits and withdraws money
    public static boolean unitTest1_4() {
        // Create a new account to verify the constructor
        Account a = new Account("John");
        if (a.getAccountNumber() != 399) {
            System.out.println("Account number is not 399");
            return false;
        }
        // A new account should have a balance of 0
        if(equals(a.getBalance(), 0) == false ) {
            System.out.println("Account balance is not 0");
            return false;
        }
        // Deposit 100 into the account
        a.deposit(101.54);
        // Verify the balance is now 101.54
        if(equals(a.getBalance(), 101.54) == false) {
            System.out.println("Account balance is not 101.54");
            return false;
        }
        // Withdraw 99.99 from the account
        a.withdraw(99.99);
        // Verify the balance is now 1.55
        if(equals(a.getBalance(), 1.55) == false) {
            System.out.println("Account balance is not 1.55");
            return false;
        }
	    return true;
    }

    /// Creates an account, then deposits and withdraws money with overdraft
    public static boolean unitTest1_5() {
        // Create a new account to verify the constructor
        Account a = new Account("John");
        if (a.getAccountNumber() != 399) {
            System.out.println("Account number is not 399");
            return false;
        }
        // A new account should have a balance of 0
        if( a.getBalance() != 0 ) {
            System.out.println("Account balance is not 0");
            return false;
        }
        // Deposit 100 into the account
        a.deposit(101.54);
        // Verify the balance is now 100
        if(equals(a.getBalance(), 101.54) == false) {
            System.out.println("Account balance is not 101.54");
            return false;
        }
        // Withdraw 200 from the account
        a.withdraw(201.4);
        // Verify the balance is now -100 (overdraft)
        if(equals(a.getBalance(), -99.86 ) == false) {
            System.out.println("Account balance is not -99.86");
            return false;
        }
	    return true;
    }

    //--------------------------------------------------------------------
    /// Block 2: Stack Class
    /// Verify the Stack class. This is a LIFO data structure
    /// The implementation must be dynamic to support varying sizes of input
    public static boolean unitTest2_1() {
        // Test Stack Constructor
        Stack s = new Stack();
        if (!s.isEmpty()) {
            System.out.println("Stack size is not 0");
            return false;
        }

        return true;
    }

    /// Verifies that the stack is not empty after pushing a value onto it
    public static boolean unitTest2_2() {
        // Test Stack Constructor
        Stack s = new Stack();
        if (!s.isEmpty()) {
            System.out.println("Stack size is not 0");
            return false;
        }
        // Push a value onto the stack
        s.push("1");
        // Verify the stack is not empty
        if (s.size() != 1) {
            System.out.println("Stack size is not 1");
            return false;
        }
	    return true;
    }

    /// Verifies that the stack is empty after pushing and popping a value
    public static boolean unitTest2_3() {
        // Test Stack Constructor
        Stack s = new Stack();
        if (!s.isEmpty()) {
            System.out.println("Stack size is not 0");
            return false;
        }
        // Push a value onto the stack
        s.push("1");
        if (s.size() != 1) {
            System.out.println("Stack size is not 1");
            return false;
        }
        // Pop the value off the stack
        if (s.pop() != "1") {
            System.out.println("Stack top is not 1");
            return false;
        }
        // Verify the stack is empty
        if (!s.isEmpty()) {
            System.out.println("Stack size is not 0");
            return false;
        }
        // Verify a pop on an empty stack returns null
        if (s.pop() != null) {
            System.out.println("Stack top is not null");
            return false;
        }

        return true;
    }

    /// Repeat the previous test with multiple values
    public static boolean unitTest2_4() {
        // Test Stack Constructor
        Stack s = new Stack();
        if (!s.isEmpty()) {
            System.out.println("Stack size is not 0");
            return false;
        }
        // Push a value onto the stack
        s.push("1");
        if (s.size() != 1) {
            System.out.println("Stack size is not 1");
            return false;
        }
        // Push a value onto the stack
        s.push("2");
        if (s.size() != 2) {
            System.out.println("Stack size is not 2");
            return false;
        }
        // Push a value onto the stack
        s.push("3");
        if (s.size() != 3) {
            System.out.println("Stack size is not 3");
            return false;
        }

        // Pop the value off the stack
        if (s.pop() != "3") {
            System.out.println("Stack top is not 3");
            return false;
        }
        // Pop the value off the stack
        if (s.pop() != "2") {
            System.out.println("Stack top is not 2");
            return false;
        }
        // Pop the value off the stack
        if (s.pop() != "1") {
            System.out.println("Stack top is not 1");
            return false;
        }
        // Verify the stack is empty
        if (!s.isEmpty()) {
            System.out.println("Stack size is not 0");
            return false;
        }
        return true;
    }

    /// Verify the dynamic nature of the stack
    public static boolean unitTest2_5() {
        // Test Stack Constructor
        Stack s = new Stack();
        for (int i = 0; i < 25; i++) {
            s.push("A" + i);
        }
        // Verify the stack contains expected number of values
        if (s.size() != 25) {
            System.out.println("Stack size is not 25");
            return false;
        }
        // Pop all the values off the stack
        while (!s.isEmpty()) {
            s.pop();
        }
        // Verify the stack is empty
        if (!s.isEmpty() || s.size() != 0) {
            System.out.println("Stack size is not 0");
            return false;
        }
        return true;
    }

    //--------------------------------------------------------------------
    /// Block 3: Transaction class
    /// Verify basic transaction creation
    public static boolean unitTest3_1() {
        // Test the Transaction creation
        Transaction t = new Transaction(1, 2, "100");
        // Verify the account number
        if (t.getAccountNumber() != 1) {
            System.out.println("Account number is not 1");
            return false;
        }
        // Verify the amount
        if (equals(t.getAmount(), 100) == false) {
            System.out.println("Amount is not 100");
            return false;
        }
        // Verify the operation
        if (t.getOperation() != 2) {
            System.out.println("Operation is not 2");
            return false;
        }
        
        return true;
    }

    /// Verify simple addition post-fix expression
    public static boolean unitTest3_2() {
        Transaction t = new Transaction(65, 4, "5 20 +");
        // Verify the account number
        if (t.getAccountNumber() != 65) {
            System.out.println("Account number is not 65");
            return false;
        }
        // Verify the amount
        if (equals(t.getAmount(), 25) == false) {
            System.out.println("Amount is not 25");
            return false;
        }
        // Verify the operation
        if (t.getOperation() != 1) {
            System.out.println("Operation is not 1");
            return false;
        }
        
        return true;
    }

    /// Verify simple subtraction post-fix expression
    public static boolean unitTest3_3() {
        Transaction t = new Transaction(24, 4, "20 5 -");
        // Verify the account number
        if (t.getAccountNumber() != 24) {
            System.out.println("Account number is not 24");
            return false;
        }
        // Verify the amount
        if (equals(t.getAmount(), 15) == false) {
            System.out.println("Amount is not 15");
            return false;
        }
        // Verify the operation
        if (t.getOperation() != 1) {
            System.out.println("Operation is not 1");
            return false;
        }
        
        // Same operation with different order operands
        t = new Transaction(23, 4, "5 20 -");
        // Verify the account number
        if (t.getAccountNumber() != 23) {
            System.out.println("Account number is not 23");
            return false;
        }
        // Verify the amount
        if (equals(t.getAmount(), 15) == false) {
            System.out.println("Amount is not 15");
            return false;
        }
        // Verify the operation
        if (t.getOperation() != 2) {
            System.out.println("Operation is not 2");
            return false;
        }
        
        return true;
    }

    /// Verify simple multiplication post-fix expression
    public static boolean unitTest3_4() {
        Transaction t = new Transaction(1, 4, "5 20 *");
        // Verify the account number
        if (t.getAccountNumber() != 1) {
            System.out.println("Account number is not 1");
            return false;
        }
        // Verify the amount
        if (equals(t.getAmount(), 100) == false) {
            System.out.println("Amount is not 100");
            return false;
        }
        // Verify the operation
        if (t.getOperation() != 1) {
            System.out.println("Operation is not 1");
            return false;
        }
        
        return true;
    }

    /// Verify simple division post-fix expression
    public static boolean unitTest3_5() {
        Transaction t = new Transaction(77, 4, "20 5 /");
        // Verify the account number
        if (t.getAccountNumber() != 77) {
            System.out.println("Account number is not 77");
            return false;
        }
        // Verify the amount
        if (equals(t.getAmount(), 4) == false) {
            System.out.println("Amount is not 4");
            return false;
        }
        // Verify the operation
        if (t.getOperation() != 1) {
            System.out.println("Operation is not 1");
            return false;
        }

        // Same operation with different order operands
        t = new Transaction(1, 4, "5 20 /");
        // Verify the account number
        if (t.getAccountNumber() != 1) {
            System.out.println("Account number is not 1");
            return false;
        }
        // Verify the amount
        if (equals(t.getAmount(), 0.25) == false) {
            System.out.println("Amount is not 0.25");
            return false;
        }
        // Verify the operation
        if (t.getOperation() != 1) {
            System.out.println("Operation is not 1");
            return false;
        }
        
        return true;
    }

    /// Verify compound addition, subtraction, multiplication, and division post-fix expression
    public static boolean unitTest3_6() {
        Transaction t = new Transaction(1, 4, "2 3 + 4 5 + *");
        // Verify the account number
        if (t.getAccountNumber() != 1) {
            System.out.println("Account number is not 1");
            return false;
        }
        // Verify the amount (2+3)*(4+5)
        if (equals(t.getAmount(), 45) == false) {
            System.out.println("Amount is not 45");
            return false;
        }
        // Verify the operation
        if (t.getOperation() != 1) {
            System.out.println("Operation is not 1");
            return false;
        }
        
        return true;
    }

    /// Verify compound addition, subtraction, multiplication, and division post-fix expression
    public static boolean unitTest3_7() {
        Transaction t = new Transaction(1, 4, "2.50 3.10 - 4.20 5.30 + *");
        // Verify the account number
        if (t.getAccountNumber() != 1) {
            System.out.println("Account number is not 1");
            return false;
        }
        // Verify the amount (3.10-2.50)*(4.20+5.30)
        if (equals(t.getAmount(), 5.7) == false) {
            System.out.println("Amount is not 5.7");
            return false;
        }
        // Verify the operation
        if (t.getOperation() != 2) {
            System.out.println("Operation is not 2");
            return false;
        }
        
        return true;
    }

    //--------------------------------------------------------------------
    /// Block 4: Queue Class
    /// Verify basic Queue creation
    public static boolean unitTest4_1() {
        // Test Queue Class
        Queue q = new Queue();
        // Verify the Queue is empty
        if (!q.isEmpty()) {
            System.out.println("Queue size is not 0");
            return false;
        }

        return true;
    }

    /// Verify basic Queue creation and single enqueue function
    public static boolean unitTest4_2() {
        Queue q = new Queue();
        if (!q.isEmpty()) {
            System.out.println("Queue size is not 0");
            return false;
        }
        // Create and enqueue a transaction
        Transaction t1 = new Transaction(1, 2, "100");
        q.enqueue(t1);
        // Verify the Queue is not empty
        if (q.size() != 1) {
            System.out.println("Queue size is not 1");
            return false;
        }

        return true;
    }

    /// Verify basic Queue creation and single enqueue and dequeue function
    public static boolean unitTest4_3() {
        // Basic Queue Creation
        Queue q = new Queue();
        if (!q.isEmpty()) {
            System.out.println("Queue size is not 0");
            return false;
        }
        // Create and enqueue a transaction
        Transaction t1 = new Transaction(1, 2, "100");
        q.enqueue(t1);
        // Verify the Queue is not empty
        if (q.size() != 1) {
            System.out.println("Queue size is not 1");
            return false;
        }
        // Dequeue the transaction
        if (q.dequeue() != t1) {
            System.out.println("Queue top is not t1");
            return false;
        }
        // Verify the Queue is empty
        if (!q.isEmpty()) {
            System.out.println("Queue size is not 0");
            return false;
        }

        // Verify a dequeue on an empty queue returns null
        if (q.dequeue() != null) {
            System.out.println("Queue top is not null");
            return false;
        }

        return true;
    }

    /// Verify previous test with multiple enqueue and dequeue functions
    public static boolean unitTest4_4() {
        // Basic Queue Creation
        Queue q = new Queue();
        if (!q.isEmpty()) {
            System.out.println("Queue size is not 0");
            return false;
        }
        // Create and enqueue a transaction
        Transaction t1 = new Transaction(1, 2, "100");
        q.enqueue(t1);
        // Verify the Queue is not empty
        if (q.size() != 1) {
            System.out.println("Queue size is not 1");
            return false;
        }
        // Create and enqueue a transaction
        Transaction t2 = new Transaction(2, 2, "200");
        q.enqueue(t2);
        // Verify the Queue is not empty
        if (q.size() != 2) {
            System.out.println("Queue size is not 2");
            return false;
        }
        // Create and enqueue a transaction
        Transaction t3 = new Transaction(3, 2, "300");
        q.enqueue(t3);
        // Verify the Queue is not empty
        if (q.size() != 3) {
            System.out.println("Queue size is not 3");
            return false;
        }
        // Dequeue the transaction
        if (q.dequeue() != t1) {
            System.out.println("Queue top is not t1");
            return false;
        }
        // Dequeue the transaction
        if (q.dequeue() != t2) {
            System.out.println("Queue top is not t2");
            return false;
        }
        // Dequeue the transaction
        if (q.dequeue() != t3) {
            System.out.println("Queue top is not t3");
            return false;
        }
        // Verify the Queue is empty
        if (!q.isEmpty()) {
            System.out.println("Queue size is not 0");
            return false;
        }

        return true;
    }

    /// Verify dynamic queue size
    public static boolean unitTest4_5() {
        // Basic Queue Creation
        Queue q = new Queue();
        // Create and enqueue 25 transactions
        for (int i = 0; i < 25; i++) {
            q.enqueue(new Transaction(i, 0, "0"));
        }
        // Verify the Queue contains 25 transactions
        if (q.size() != 25) {
            System.out.println("Queue size is not 25");
            return false;
        }
        // Dequeue all transactions
        int transactionsDequeued = 0;
        while (!q.isEmpty()) {
            q.dequeue();
            transactionsDequeued++;
        }
        // Verify all transactions were dequeued
        if (transactionsDequeued != 25) {
            System.out.println("Queue did not dequeue 25 transactions");
            return false;
        }
        // Verify the Queue is empty
        if (!q.isEmpty() || q.size() != 0) {
            System.out.println("Queue size is not 0");
            return false;
        }

        return true;
    }

    //--------------------------------------------------------------------
    /// Block 5: Bank Class
    /// Verify basic Bank creation
    public static boolean unitTest5_1() {
        // Verify the Bank Class is created correctly
        Bank b = new Bank("Test Bank");
        // Verify the Bank name is correct
        if (b.getBankName() != "Test Bank") {
            System.out.println("Bank name is not Test Bank");
            return false;
        }
        // Verify the Bank has no accounts
        if (b.getNumberOfAccounts() != 0) {
            System.out.println("Number of accounts is not 0");
            return false;
        }

        return true;        
    }

    /// Verify basic Bank creation and single account creation
    public static boolean unitTest5_2() {
        // Verify the Bank Class is created correctly
        Bank b = new Bank("Test Bank");
        // Verify the Bank name is correct
        if (b.getBankName() != "Test Bank") {
            System.out.println("Bank name is not Test Bank");
            return false;
        }
        // Verify the Bank has no accounts
        if (b.getNumberOfAccounts() != 0) {
            System.out.println("Number of accounts is not 0");
            return false;
        }
        // Create an account
        b.createAccount("A");
        if (b.getNumberOfAccounts() != 1) {
            System.out.println("Number of accounts is not 1");
            return false;
        }
        // Create an account
        b.createAccount("B");
        if (b.getNumberOfAccounts() != 2) {
            System.out.println("Number of accounts is not 2");
            return false;
        }
        // Create an account
        b.createAccount("C");
        if (b.getNumberOfAccounts() != 3) {
            System.out.println("Number of accounts is not 3");
            return false;
        }
        // Verify the account balances are correct
        if (equals(b.getBalance(65), 0) == false) {
            System.out.println("Balance of account 'A' is not 0");
            return false;
        }
        if (equals(b.getBalance(66), 0) == false) {
            System.out.println("Balance of account 'B' is not 0");
            return false;
        }
        if (equals(b.getBalance(67), 0) == false) {
            System.out.println("Balance of account 'C' is not 0");
            return false;
        }
        
        return true;  
    }

    /// Verify basic Bank creation and multiple account creation
    public static boolean unitTest5_3() {
        // Test the Bank Class
        Bank b = new Bank("Test Bank");
        // Verify the Bank name is correct
        if (b.getBankName() != "Test Bank") {
            System.out.println("Bank name is not Test Bank");
            return false;
        }
        // Verify the Bank has no accounts
        if (b.getNumberOfAccounts() != 0) {
            System.out.println("Number of accounts is not 0");
            return false;
        }
        // Create accounts
        b.createAccount("A");
        if (b.getNumberOfAccounts() != 1) {
            System.out.println("Number of accounts is not 1");
            return false;
        }
        b.createAccount("B");
        if (b.getNumberOfAccounts() != 2) {
            System.out.println("Number of accounts is not 2");
            return false;
        }
        b.createAccount("C");
        if (b.getNumberOfAccounts() != 3) {
            System.out.println("Number of accounts is not 3");
            return false;
        }
        // Verify the account balances are correct
        if (equals(b.getBalance(65), 0) == false) {
            System.out.println("Balance of account 'A' is not 0");
            return false;
        }
        if (equals(b.getBalance(65), 0) == false) {
            System.out.println("Balance of account 'B' is not 0");
            return false;
        }
        if (equals(b.getBalance(67), 0) == false) {
            System.out.println("Balance of account 'C' is not 0");
            return false;
        }

        // Deposit into accounts
        b.deposit(65, 100);
        b.deposit(66, 200);
        b.deposit(67, 300);

        // Verify the account balances are correct
        b.deposit(65, 100);
        if (equals(b.getBalance(65), 200) == false) {
            System.out.println("Balance of account 'A' is not 200");
            return false;
        }
        b.deposit(66, 200);
        if (equals(b.getBalance(66), 400) == false) {
            System.out.println("Balance of account 'B' is not 400");
            return false;
        }
        b.deposit(67, 300);
        if (equals(b.getBalance(67), 600) == false) {
            System.out.println("Balance of account 'C' is not 600");
            return false;
        }
        
        return true;  
    }

    /// Verify Bank creation, opening, depositing, withdraw accounts
    public static boolean unitTest5_4() {
        // Test the Bank Class
        Bank b = new Bank("Test Bank");
        // Verify the Bank name is correct
        if (b.getBankName() != "Test Bank") {
            System.out.println("Bank name is not Test Bank");
            return false;
        }
        // Verify the Bank has no accounts
        if (b.getNumberOfAccounts() != 0) {
            System.out.println("Number of accounts is not 0");
            return false;
        }
        // Create accounts
        b.createAccount("A");
        if (b.getNumberOfAccounts() != 1) {
            System.out.println("Number of accounts is not 1");
            return false;
        }
        b.createAccount("B");
        if (b.getNumberOfAccounts() != 2) {
            System.out.println("Number of accounts is not 2");
            return false;
        }
        b.createAccount("C");
        if (b.getNumberOfAccounts() != 3) {
            System.out.println("Number of accounts is not 3");
            return false;
        }
        // Verify the account balances are correct
        if (equals(b.getBalance(65), 0) == false) {
            System.out.println("Balance of account 'A' is not 0");
            return false;
        }
        if (equals(b.getBalance(66), 0) == false) {
            System.out.println("Balance of account 'B' is not 0");
            return false;
        }
        if (equals(b.getBalance(67), 0) == false) {
            System.out.println("Balance of account 'C' is not 0");
            return false;
        }
        // Deposit into accounts
        b.deposit(65, 100);
        b.deposit(66, 200);
        b.deposit(67, 300);
        // Verify the account balances are correct after another deposit
        b.deposit(65, 100);
        if (equals(b.getBalance(65), 200) == false) {
            System.out.println("Balance of account 'A' is not 200");
            return false;
        }
        b.deposit(66, 200);
        if (equals(b.getBalance(66), 400) == false) {
            System.out.println("Balance of account 'B' is not 400");
            return false;
        }
        b.deposit(67, 300);
        if (equals(b.getBalance(67), 600) == false) {
            System.out.println("Balance of account 'C' is not 600");
            return false;
        }
        // Withdraw from accounts
        b.withdraw(65, 100);
        if (equals(b.getBalance(65), 100) == false) {
            System.out.println("Balance of account 'A' is not 100");
            return false;
        }
        b.withdraw(66, 200);
        if (equals(b.getBalance(66), 200) == false) {
            System.out.println("Balance of account 'B' is not 200");
            return false;
        }
        b.withdraw(67, 300);
        if (equals(b.getBalance(67), 300) == false) {
            System.out.println("Balance of account 'C' is not 300");
            return false;
        }
        // Verify the account balances are correct after another withdraw
        b.withdraw(65, 100);
        if (equals(b.getBalance(65), 0) == false) {
            System.out.println("Balance of account 'A' is not 0");
            return false;
        }
        b.withdraw(66, 200);
        if (equals(b.getBalance(66), 0) == false) {
            System.out.println("Balance of account 'B' is not 0");
            return false;
        }
        b.withdraw(67, 300);
        if (equals(b.getBalance(67), 0) == false) {
            System.out.println("Balance of account 'C' is not 0");
            return false;
        }
        // Verify the accounts exist after withdrawing all the money
        if (b.getNumberOfAccounts() != 3) {
            System.out.println("Number of accounts is not 3");
            return false;
        }
        
        return true;   
    }

    /// Verify Bank creation, opening, depositing, withdraw, and closing accounts
    public static boolean unitTest5_5() {
        // Test the Bank Class
        Bank b = new Bank("Test Bank");
        // Verify the Bank name is correct
        if (b.getBankName() != "Test Bank") {
            System.out.println("Bank name is not Test Bank");
            return false;
        }
        // Verify the Bank has no accounts
        if (b.getNumberOfAccounts() != 0) {
            System.out.println("Number of accounts is not 0");
            return false;
        }
        // Create accounts
        b.createAccount("A");
        if (b.getNumberOfAccounts() != 1) {
            System.out.println("Number of accounts is not 1");
            return false;
        }
        b.createAccount("B");
        if (b.getNumberOfAccounts() != 2) {
            System.out.println("Number of accounts is not 2");
            return false;
        }
        b.createAccount("C");
        if (b.getNumberOfAccounts() != 3) {
            System.out.println("Number of accounts is not 3");
            return false;
        }
        // Verify the account balances are correct
        if (equals(b.getBalance(65), 0) == false) {
            System.out.println("Balance of account 'A' is not 0");
            return false;
        }
        if (equals(b.getBalance(66), 0) == false) {
            System.out.println("Balance of account 'B' is not 0");
            return false;
        }
        if (equals(b.getBalance(67), 0) == false) {
            System.out.println("Balance of account 'C' is not 0");
            return false;
        }
        // Deposit into accounts
        b.deposit(65, 100);
        b.deposit(66, 200);
        b.deposit(67, 300);
        // Verify the account balances are correct after another deposit
        b.deposit(65, 100);
        if (equals(b.getBalance(65), 200) == false) {
            System.out.println("Balance of account 'A' is not 200");
            return false;
        }
        b.deposit(66, 200);
        if (equals(b.getBalance(66), 400) == false) {
            System.out.println("Balance of account 'B' is not 400");
            return false;
        }
        b.deposit(67, 300);
        if (equals(b.getBalance(67), 600) == false) {
            System.out.println("Balance of account 'C' is not 600");
            return false;
        }
        // Withdraw from accounts
        b.withdraw(65, 100);
        if (equals(b.getBalance(65), 100) == false) {
            System.out.println("Balance of account 'A' is not 100");
            return false;
        }
        b.withdraw(66, 200);
        if (equals(b.getBalance(66), 200) == false) {
            System.out.println("Balance of account 'B' is not 200");
            return false;
        }
        b.withdraw(67, 300);
        if (equals(b.getBalance(67), 300) == false) {
            System.out.println("Balance of account 'C' is not 300");
            return false;
        }
        // Verify the account balances are correct after another withdraw
        b.withdraw(65, 100);
        if (equals(b.getBalance(65), 0) == false) {
            System.out.println("Balance of account 'A' is not 0");
            return false;
        }
        b.withdraw(66, 200);
        if (equals(b.getBalance(66), 0) == false) {
            System.out.println("Balance of account 'B' is not 0");
             return false;
        }
        b.withdraw(67, 300);
        if (equals(b.getBalance(67), 0) == false) {
            System.out.println("Balance of account 'C' is not 0");
            return false;
        }
        // Verify the accounts exist after withdrawing all the money
        if (b.getNumberOfAccounts() != 3) {
            System.out.println("Number of accounts is not 3");
            return false;
        }
        // Close account B
        b.closeAccount(66);
        if (b.getNumberOfAccounts() != 2) {
            System.out.println("Number of accounts is not 2");
            return false;
        }
        // Verify the account balances are unavailable after closing an account
        if (equals(b.getBalance(66), -1) == false) {
            System.out.println("Account 'B' doesn't exist and balance is not -1");
            return false;
        }
        // Close account C
        b.closeAccount(67);
        if (b.getNumberOfAccounts() != 1) {
            System.out.println("Number of accounts is not 1");
            return false;
        }
        // Verify the account balances are unavailable after closing an account
        if (equals(b.getBalance(67), -1) == false) {
            System.out.println("Account 'C' doesn't exist and balance is not -1");
            return false;
        }
        // Close account A
        b.closeAccount(65);
        if (b.getNumberOfAccounts() != 0) {
            System.out.println("Number of accounts is not 0");
            return false;
        }
        // Verify the account balances are unavailable after closing an account
        if (equals(b.getBalance(65), -1) == false) {
            System.out.println("Account 'A' doesn't exist and balance is not -1");
            return false;
        }
        
        return true;   
    }

    /// 
    public static boolean unitTest5_6() {
        // Test the Bank Class
        Bank b = new Bank("Test Bank");
        // Verify the Bank name is correct
        if (b.getBankName() != "Test Bank") {
            System.out.println("Bank name is not Test Bank");
            return false;
        }
        // Verify the Bank has no accounts
        if (b.getNumberOfAccounts() != 0) {
            System.out.println("Number of accounts is not 0");
            return false;
        }

        // Create accounts through transactions
        Transaction t1 = new Transaction(65, 0, null);
        Transaction t2 = new Transaction(66, 0, null);
        // Add the transactions to the bank
        b.addTransaction(t1);
        b.addTransaction(t2);;
        // Verify the number of transactions is correct
        if (b.getNumberOfTransactions() != 2) {
            System.out.println("Number of transactions is not 2" + b.getNumberOfTransactions());
            return false;
        }
        // Process the transaction - Create account A
        b.processTransaction();
        if (b.getNumberOfAccounts() != 1) {
            System.out.println("Number of accounts is not 1");
            return false;
        }
        if (equals(b.getBalance(65), 0) == false) {
            System.out.println("Balance of account 'A' is not 0");
            return false;
        }

        // Process the transaction - Create account B
        b.processTransaction();
        if (equals(b.getBalance(66), 0) == false) {
            System.out.println("Balance of account 'B' is not 0");
            return false;
        }
        if (b.getNumberOfAccounts() != 2) {
            System.out.println("Number of accounts is not 2");
            return false;
        }

        // Create transactions to deposit money into accounts
	
        t1 = new Transaction(65, 1, "100.5");
        t2 = new Transaction(66, 1, "2034.1");
        // Add the transactions to the bank
        b.addTransaction(t1);
        b.addTransaction(t2);
        // Verify the number of transactions is correct
        if (b.getNumberOfTransactions() != 2) {
            System.out.println("Number of transactions is not 2");
            return false;
        }
        // Process the transaction - Deposit into A
        b.processTransaction();
        if (equals(b.getBalance(65), 100.5) == false) {
            System.out.println("Balance of account 'A' is not 100.5");
            return false;
        }
        // Process the transaction - Deposit into B
        b.processTransaction();
        if (equals(b.getBalance(66), 2034.1) == false) {
            System.out.println("Balance of account 'B' is not 2034.1");
            return false;
        }
        // Verify that account C was not created
        if (equals(b.getBalance(67), -1) == false) {
            System.out.println("Balance of account 'B' is not -1");
            return false;
        }

        // Create transactions to close each of the accounts
        t1 = new Transaction(65, 0, null);
        t2 = new Transaction(66, 0, null);
        // Add the transactions to the bank
        b.addTransaction(t1);
        b.addTransaction(t2);
        // Verify the number of transactions is correct
        if (b.getNumberOfTransactions() != 2) {
            System.out.println("Number of transactions is not 2");
            return false;
        }
        // Process the transaction - Close account A
        b.processTransaction();
        if (b.getNumberOfAccounts() != 1) {
            System.out.println("Number of accounts is not 1");
            return false;
        }
        // Verify that account A is closed and balance is not valid
        if (equals(b.getBalance(65), -1) == false) {
            System.out.println("Balance of account 'A' is not -1");
            return false;
        }
        // Process the transaction - Close account B
        b.processTransaction();
        if (b.getNumberOfAccounts() != 0) {
            System.out.println("Number of accounts is not 0");
            return false;
        }
        // Verify that account B is closed and balance is not valid
        if (equals(b.getBalance(66), -1) == false) {
            System.out.println("Balance of account B' is not -1");
            return false;
        }
        
        return true;  
    }

}
