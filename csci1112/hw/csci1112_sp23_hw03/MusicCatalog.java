/*--------------------------------------------------------------------------
GWU - CS1112 Data Structures and Algorithms - Spring 2023

This is the abstract list layer for the conceptual Music Catalog. There is
no implementation here and this definition simply defines how to interact 
with the catalog via the interface.  The resultant behaviors are documented so
that it is clear how the catalog should behave when the interface is used.

authors: Charles Peeke
--------------------------------------------------------------------------*/

public interface MusicCatalog {

    /// Adds a song to the catalog
    /// @param song the song to add to the catalog
    public void add(Song song);

    /// Remove the first song in the catalog; shortening the list by one and
    /// returning the song that was removed
    /// @return the song that was removed if the catalog was not empty;
    ///         otherwise, null
    public Song remove();

    /// Remove a specified song from the catalog; shortening the list by one
    /// and returning the song that was removed
    /// @param song the song to search for and remove from the catalog
    /// @return the song that was removed if the catalog was not empty;
    ///         otherwise, null
    public Song remove(Song song);
    
    /// Removes all songs from the catalog and resets it to an empty state
    public void clear(); 
    
    /// Checks the catalog to see if it contains no songs.
    /// @return true if the catalog contains no songs; otherwise, false
    public boolean isEmpty();
    
    /// Returns the number of songs stored in the catalog
    /// @return the number of songs stored in the catalog
    public int count(); 
    
    /// Returns a song in the list based on its index.  The index must
    /// be less than the count of the catalog and if not a null is returned
    /// @param i the index of the song to get in the catalog where i must
    ///          be in the range [0, count-1]
    /// @return the song stored at index i, or null if i is invalid
    public Song get(int i);
   
    /// Returns a truth value that indicates whether a reference to the 
    /// specified song currently exists in the catalog
    /// @param song the song to search for
    /// @return true if a reference to the song exists in the catalog;
    ///         otherwise, false
    public boolean contains(Song song);

    /// Returns a truth value indicating whether the catalog's structural
    /// integrity remains valid.  If the integrity is no longer valid,
    /// then the catalog should be invalidated and usage should not be trusted
    /// @return true if the catalog integrity is valid; otherwise, false
    public boolean isIntegrityValid();

    /// Returns a string that contains information about the list and the 
    /// contents of the list.  This is mostly useful for visual debugging 
    /// @return a string containing information about the contents of the 
    ///         catalog
    public String toString();

    /// Returns the earliest and most recent years of all the songs in the
    /// catalog and then clears the catalog of all songs
    /// @return an array of the years of the earliest and most recent songs
    public int[] publish();

}
