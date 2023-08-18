/*------------------------------------------------------------------------
GWU CSCI 1112 Fall 2022
author: James Taylor

This class encapsulates the relationship of the Key-Value Pair (KVP)

The key must be immutable.
Various accessors with different types are provided to allow the generic 
value to be easily cast and wrapped by any client classes.
--------------------------------------------------------------------------*/

public class KVP {
    // a final key can not be changed once assigned, so it can be public 
    // without any possibility for a class client to change the key
    // this ensures that the key is immuatable
    public final String key;

    // the value associated with the key
    private Object value;

    /// Parameterized constructor forces key and value to be provided on
    /// creation
    /// @param key the immutable key for the key value pair
    /// @param value a generic value to associate with the key
    public KVP( String key, Object value ) {
        this.key = key;
        this.value = value;
    }

    /// Mutator to allow a client to change the value if necessary
    /// @param value the new value to update this key-value pair with
    public void setValue( Object value ) {
        this.value = value;
    }
    
    /// Accessor that casts the associated value as a string.
    /// @returns the generic value reference cast to a String reference
    public String asString() {
        return (String) value;
    }

    /// Accessor that casts the associated value as a string array.
    /// @returns the generic value reference cast to a String array ref
    public String[] asStringArray() {
        return (String[]) value;
    }
}
