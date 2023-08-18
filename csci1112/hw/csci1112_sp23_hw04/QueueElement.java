/*--------------------------------------------------------------------------
GWU CSCI 1112 Spring 2023
author: Charles Peeke, <your name>

This class represents an element of in the queue which has a value field
to store it's value, and a next field which references the next element
in the stack.

--------------------------------------------------------------------------*/

public class QueueElement {
    //allows it to have a value and a next which is another StackElement, LL
    public Transaction value;
    public QueueElement next;

    /// initializes the QueueElement variables to a specific value,
    //creates a stack Element which does not have a next element
    public QueueElement(Transaction value) {
        this.value = value;
        this.next = null;
    }

    ///prints the value and next of the QueueElement in String form
    @Override
    public String toString() {
        return "QueueElement [value=" + value + ", next=" + next + "]";
    }
}
