/*--------------------------------------------------------------------------
GWU - CS1112 Data Structures and Algorithms - Spring 2023

TODO : Document this file

authors: <TODO your name here>, Charles Peeke
--------------------------------------------------------------------------*/
public class ArrayList implements MusicCatalog {
    /// For an array-based list, the array itself
    private CatalogItem[] data;
    /// The counter to track the number of elements in the list
    private int count;

    /// Parameterless Constructor
    public ArrayList() {
        count = 0;
        data = new CatalogItem[2];
    }
   
    /// add songs to the end of the array
    // since arrays are constant space, we need to find a way to make it
    // so that we dynamically allocate space in the array when new songs are added
    public void add(Song song) {
	// if the array is full, double the size of it

	//ERROR: "method size(), varaible data of type CatalogItem[]"

	if (count == data.length){
	    CatalogItem[] tempArr = new CatalogItem [2 * data.length];

	    //make a deep copy of the original array
	    for (int i = 0; i < count; i++) {
		tempArr[i] = data[i];
	    }
	    //make data be a pointer to the larger arraylist, so it can still be accessed
	    data = tempArr;
	}

	//make a new CatalogItem, use CatalogItem to add the song in to newSong\

	CatalogItem newSong = new CatalogItem(song);
        data[count] = newSong;

	//increase the count of songs
	count++;
        
    }

    /// TODO : removes the initial song and shifts the other songs down, returns the removed song
    public Song remove() {
	//if the list is empty 
	if (count == 0) {
	    return null;
	}
	else {
	    //save the removed song
	    CatalogItem removed = data[0];
	    
	    //start at the second element, swap that into the first element's position
	    //repeat, but stop before the last element
	    for (int i = 1; i < data.length - 1; i++) {

		//shifts it over and removes first item
		data[i - 1] = data[i];
	    }
	    count--;
	    return removed.getSong(); 
	}

    }

    ///removes the song if it's in the list
    public Song remove(Song song) {
	if (count == 0) {
	    return null;
	}

	//using contains function means searching
        boolean found = false;
	int pos = 0;
	for (int i = 0; i < count; i++) {
	    if (data[i].getSong().equals(song)){
	        pos = i;
	        found = true;
	    }
	}

        //if the element was not found
	if (found == false) {
	    return null;
	}

	//start from the index of the element, and replace it with the item after it
	for (int i = pos + 1; i < data.length - 1; i++) {
	    data[i - 1] = data[i];
	}
	count--;

        return song;
    }
    
    ///empties the list and sets it to 0
    public void clear() {

	//makes an ArrayList which is the same size as the original length, then makes data reference that
	CatalogItem[] originalLength = new CatalogItem[2];
	data = originalLength;
	count = 0;
        
    }
    
    ///checks if the list is empty or if it is null
    public boolean isEmpty() {
        if (data.length == 0 || count == 0) {
	    return true;
	}
	
        return false;
    }
    
    /// shows the count you've been tracking
    public int count() {
        return count;
    }
    
     ///get returns the song at the specified index if that song exists in the list; otherwise, get returns null.
    //If the parameter is invalid, get also returns null
    public Song get(int i) {

	//if the index won't work
	//count is number of elements not index
	if (i >= count || i < 0 || isEmpty()) {
	    return null;
	}

        return data[i].getSong();
	
    }

    /// if the array contains the song being searched for
    public boolean contains(Song song) {
        for (int i = 0; i < count - 1; i++) {
	    if (data[i].getSong().equals(song)) {
		return true;
	    }
	}

        return false;
    }

    //--------------------------------------------------------------------
    // Utilities
    //--------------------------------------------------------------------

    /// Returns a truth value indicating whether the catalog's structural
    /// integrity remains valid.  If the integrity is no longer valid,
    /// then the catalog should be invalidated and usage should not be trusted
    /// @return true if the catalog integrity is valid; otherwise, false
    public boolean isIntegrityValid() {
        if(count < 0) {
            return false;
        }
        if(data == null) {
            return false;
        }
        if(count > data.length) {
            return false;
        }
        for(int i = 0; i < count; i++) {
            if(data[i] == null) {
                return false;
            }
        }

        return true;
    }

    /// Returns a string that contains information about the list and the 
    /// contents of the list.  This is mostly useful for visual debugging 
    /// @return a string containing information about the contents of the 
    ///         catalog
    public String toString() {
        String s = "";
        s = "ArrayList::allocated=" + data.length;
        s += ", count=" + count(); 
        s += ", isEmpty=" + isEmpty(); 
        s += ", ["; 
        for(int i = 0; i < count; i++) {
            if(i > 0) {
                s += ", ";
            }
            s += data[i].getSong().getTitle();
            s += " | ";
            s += data[i].getSong().getYear();
        }
        s += "]";
        return s;
    }

    /// Returns the earliest and most recent years of all the songs in the
    /// catalog and then clears the catalog of all songs
    /// @return an array of the years of the earliest and most recent songs
    public int[] publish() {
        int oldYear = Integer.MAX_VALUE;
        int newYear = Integer.MIN_VALUE;

        for(int i = 0; i < count; i++) {
            int curYear = data[i].getSong().getYear();
            if (curYear < oldYear) oldYear = curYear;
            if (curYear > newYear) newYear = curYear;
        }
        clear();
        return new int[] { oldYear, newYear };
    }

}
