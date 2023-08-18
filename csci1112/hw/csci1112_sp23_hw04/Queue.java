/*--------------------------------------------------------------------------
GWU CSCI 1112 Spring 2023
author: Charles Peeke, <your name>

TODO - Summarize this class

--------------------------------------------------------------------------*/

public class Queue {
    // TODO:
    private QueueElement front;
    private QueueElement back;
    private int count;

    ///initilize the queue in the queue method
    public Queue() {
	front = null;
	back = null;
	count = size();
        
    }

    /// add an element to the end of the queue
    public void enqueue(Transaction t) {
	//the transaction in queueelement form
	QueueElement el = new QueueElement(t);
	//System.out.println("count: " + count);

	if (isEmpty()) {
	    //System.out.println(front);
	    //System.out.println("isempty");
	    front = el;
	    back = el;
	    count++; 
	}
	//connects front and back
	else if (size() == 1) {
	    //System.out.println("size = 1");
	    //System.out.println(front);
	    back = el;
	    front.next = back;
	    count++;

	}

	//adds the new element in the back
	else {
	    //System.out.println("else");
	    back.next = el;
	    back = back.next;
	    count++;
	}

        
    }

    /// removes the element at the front of the queue, then returns deleted element
    public Transaction dequeue() {
	QueueElement temp = front;
	if (isEmpty()) {
	    return null;
	}
	else if (size() == 1) {
	    front = null;
	    return temp.value;
	}
	else {
	    temp = front;
	    front = front.next;
	    count--;
	    return temp.value;
	}
    }

    ///checks if the queue is empty
    public boolean isEmpty() {
        if (front == null || count == 0) {
	    return true;
	}
	return false;
    }

    ///returns the number of elements in the queue
    public int size() {
	if (isEmpty()) {
	    count = 0;
	}
	
        return count;	
    }

    /// TODO:
    @Override
    public String toString() {
        // TODO
        String s = "";
        QueueElement current = this.front;
        while (current != null) {
            s += current.value.toString() + ";";
            current = current.next;
        }
        return s;
    }

}
