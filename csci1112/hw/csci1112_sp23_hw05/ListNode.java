/*--------------------------------------------------------------------------
GWU CSCI 1112 Fall 2022
author: James Taylor

A node class specifically for linked list structures

Note that this class could be generalized as a basic Node class that is 
suitable to represent data for any graph type data structure. 

--------------------------------------------------------------------------*/

public class ListNode {
  
    private final KVP data;  // The key value pair associated with this node
    public ListNode next;    // Reference to any child node
 
    /// Parameterized constructor forces users of the class to provide both
    /// key and value on creation.
    /// @param key the unique identifier for this node.  immutable
    /// @param value the value associated with the provided key 
    public ListNode(String key, String value) {
        data = new KVP(key, value);
        next = null;
    }
  
    /// Accessor to retrieve the key from the key-value pair  
    /// @return the unique key stored in this node
    public String getKey() {
        return data.key;
    }
 
    /// Accessor to retrieve the value from the key-value pair
    /// @return the value stored in this node 
    public String getValue() {
        return data.asString();
    }
	
	/// Updating the value in a key-value pair
	public void updateValue(String value) {
		data.setValue(value);
	}
}
