/*--------------------------------------------------------------------------

Ilinca Hirtopanu
This class implements the Map interface using a hash table.

--------------------------------------------------------------------------*/

public class HashMap implements Map {
  
    // instance variable representing the hash table
    private final ListNode[] buckets;

    //constructor for the HashMap class, initializes a new hash table with the specified length
    public HashMap(int length) {
	buckets = new ListNode[length];   
    }
  
    /* adds a new key-value pair to the hash table
    if the key already exists in the hash table, updates the corresponding value. */
    public void set(String key, String value, int[] profile) {

	//generate the hash for the key
	int hash = hash(key);
	
	//if the bucket is empty, add a new node
	if (buckets[hash] == null) {
	    buckets[hash] = new ListNode(key, value);
	}
	
	// if the bucket is not empty, traverse the list
	else {
	    ListNode it = buckets[hash];
	    
	    //traverse the list
	    while (it != null) {
		
		//increment the number
		profile[0] += 1;
		
		//if the key already exists, update the value
		if (it.getKey().equals(key)) {

		    it.updateValue(value);
		    break;
		}
		
		// if the end of the linked list is reached, add a new node
		if (it.next == null) {
		    it.next = new ListNode(key,value);
		    break;
		}
		
		// move to the next part in the linked list
		it = it.next;
	    }
	}
  
    }
  
    //retrieves the value associated with the specified key from the hash table,
    //returns null if the key is not found
    public String get(String key, int[] profile) {
	
        // generates the hash for the key
	int hash = hash(key);

	//if the bucket is empty, return null
	if (buckets[hash] == null) {
	    return null;
	}
	
	ListNode it = buckets[hash];

	// traverse the linked list in the corresponding bucket
	while (it != null) {

	    // increment the number
	    profile[0] += 1;

	    // if the key is found, return the corresponding value
	    if (it.getKey().equals(key)) {
		return it.getValue();
	    }

	    // if the end of the linked list is reached, return null
	    if (it.next == null) {
		return null;
	    }

	    // move to the next node in the linked list
	    it = it.next;
	}
	return null;
    
    }
  
    // clears all entries from the hash table.
    public void clear() {
	
        //makes all the buckets null
	for (int i = 0; i < buckets.length; i++) {
	    buckets[i] = null;
	}
        
    }

    //----------------------------------------------------------------------
    // Utilities
    //----------------------------------------------------------------------
    /// Hash function.  DO NOT MODIFY
    /// @param key string input to be hashed
    /// @return index location of where an object should be put in the table
    private int hash(String key) {
        return Math.abs(key.hashCode() % buckets.length);
    }
}
