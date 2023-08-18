/*--------------------------------------------------------------------------
GWU CSCI 1112 Spring 2023
author: Charles Peeke, <your name>

TODO - This class represents an element of the stack which has a value field
to store it's value, and a next field which references the next element
in the stack.


--------------------------------------------------------------------------*/

public class StackElement {
    //allows it to have a value and a next which is another StackElement, LL
    public String value;
    public StackElement next;

    /// initializes the StackElement variables to a specific value,
    //creates a stack Element which does not have a next element
    public StackElement(String value) {
        this.value = value;
        this.next = null;
    }

    ///prints the value and next of the stackElement in String form
    @Override
    public String toString() {
        return "StackElement [value=" + value + ", next=" + next + "]";
    }
}
