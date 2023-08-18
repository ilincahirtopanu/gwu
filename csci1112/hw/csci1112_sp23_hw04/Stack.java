/*--------------------------------------------------------------------------
GWU CSCI 1112 Spring 2023
author: Charles Peeke, <your name>

mimicks the stack class, so that we coded it instead of just using the library.

--------------------------------------------------------------------------*/

public class Stack {
    // TODO:
    private StackElement top;
    private int count;
    
    ///initilize the stack in the stack method
    public Stack() {
	top = null;
	count = size();
    }
    
    /// creates a new stackElement object with string, moves the top element behind this new object,
    // sets top object to the new element
    public void push(String s) {

	//if the stack is empty, make the top element the top
	if (isEmpty()) {
	    top = new StackElement(s);
	}

	//if the list has a top, add the new element to the top and put the old top behind it
	else {
	    StackElement temp = new StackElement(s);
	    temp.next = top;
	    top = temp;
	}
	count++;
    }
    
    ///removes the item at the top of the stack and returns it's value
    public String pop() {
	if (!isEmpty()) {
	    StackElement temp = top;
	    top = top.next;
	    count--;
	    return temp.value;
	}

	//if the list is empty
	return null;
    }
    
    /// checks if the list is empty 
    public boolean isEmpty() {
        if (top == null || count == 0) {
	    return true;
	}
	return false;
    }

    ///returns the number of accounts in the list
    public int size() {
	if (isEmpty()) {
	    count = 0;
	}
        return count;	    
    }

    // TODO: 
    @Override
    public String toString() {
        String s = "";
        StackElement current = this.top;
        while (current != null) {
            s += current + " ";
            current = current.next;
        }
        return s;
    }
}


