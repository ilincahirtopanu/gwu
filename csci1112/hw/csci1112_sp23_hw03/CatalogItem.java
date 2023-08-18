/*--------------------------------------------------------------------------
GWU - CS1112 Data Structures and Algorithms - Spring 2023

This class is a multi-purpose list element container for Music Catalogs as
it can act as an array element or a linked-list element 

It's chief purpose is to contain songs and any other ancillary fields
related to maintaining song data (like title, year, etc.)

Note that this class could be more generalized; however, it is specifically 
designed for the shopping cart application to make this problem a little 
easier.

authors: Charles Peeke
--------------------------------------------------------------------------*/
public class CatalogItem {

    // The product contained in this list item
    private final Song song;

    // The next field is only necessary for LinkedList based carts
    public CatalogItem next;
    //Any extra fields you need may go here

    // Parameterized constructor 
    // @param song an instance of a Song.
    public CatalogItem(Song song) {
        this.song = song;
        this.next = null;
    }

    // Accessor to return the product contained by this list item    
    public Song getSong() {
        return this.song;
    }
}
