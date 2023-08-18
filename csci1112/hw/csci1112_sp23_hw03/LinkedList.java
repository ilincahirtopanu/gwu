/*--------------------------------------------------------------------------
GWU - CS1112 Data Structures and Algorithms - Spring 2023

TODO : Document this file

authors: Ilinca Hirtopanu, Charles Peeke
--------------------------------------------------------------------------*/
public class LinkedList implements MusicCatalog {

    /// For a linked-list based list, the head pointer
    private CatalogItem head;
    /// The counter to track the number of elements in the list 
    private int count;

    // Parameterless Constructor
    public LinkedList() {
        count = 0;
        head = null;
    }

    ///add a song to the data list, either make it the first item in an empty list or the last item
    public void add(Song song) {

	//if there's in the list, make the song be the first item
	CatalogItem newSong = new CatalogItem(song);
        if (isEmpty()){
	    head = newSong;
	}
	else {

	    CatalogItem pointer = head;
	    while (pointer.next != null) {
		pointer = pointer.next;
	    }

	    //pointer.next is null, set next item as newSong
	    pointer.next = newSong;

	}
	
	count++;    
	
    }

    /// saves the value of the head item to return, then switches the head down to remove it
    public Song remove() {

	//if removed is null, it'll skip the if loop
	CatalogItem removed = head;
	
	//if the removed is not null, it changes the head to the next item
	if (removed != null) {
	    head = head.next;
	    count--;
	}
	
        return removed.getSong();
    }

    /// removes a specific element of the linked list, then returns it
    public Song remove(Song song) {
	    CatalogItem pointer = head;

	    //goes through the list, checking that each song is not equal to the song being looked for
	    while (pointer != null) {

		//if the next element is the song being looked for
		if (pointer.next.getSong().equals(song)) {

		    //connect the rest of the list to the current pointer, skipping the song being removed
		    CatalogItem deleted = pointer.next;
		    CatalogItem next = deleted.next;
		    //skips
		    pointer.next = next;
		    count--;
		    return deleted.getSong();
		}
		pointer = pointer.next;
	    }	    
       
        return null;
    }
    
    ///empties the list by assigning the head to nothing
    public void clear() {
	head = null;
	count = 0;
    }
    
    ///if the list is empty or null, returns true
    public boolean isEmpty() {
	if (head == null|| count == 0) {
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

	//if the index is farther than the number of elements in the LL
	if (i > count || i < 0 || isEmpty()) {
	    return null;
	}

	//if the head is the one being returned
	if (i == 0) {
	    return head.getSong();
	}

	//since there's no index in LL, you must make a while loop to go through the LL until the index
	int pos = 0;
	CatalogItem pointer = head;
        while (pos < i-1) {
	    pointer = pointer.next;
	    pos++;
	}

	//check if the list contains the song

	if (contains(pointer.getSong())) {
		return pointer.getSong();
	} else {
	    return null;
	}
		

    }

    ///goes through all the items and checks if the song being searched for is in it
    public boolean contains(Song song) {
	CatalogItem pointer = head;

	//goes through the entire list
	while (pointer.next != null) {

	    //if the current element's song is the song being looked for
	    if (pointer.getSong() == song) {
		return true;
	    } else {
		pointer = pointer.next;
	    }
	}
	//song hasn't been found
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
            System.out.println("1");
            return false;
        }
        if(count == 0 && head == null) {
            return true;
        }
        if(count == 1 && head != null && head.next == null) {
            return true;
        }

        int n = 1;
        CatalogItem it = head;
        while(it.next != null) {
            it = it.next;
            n++;
        }

        if(n != count) {
            System.out.println("2");
            return false;
        }

        return true;
    }

    /// Returns a string that contains information about the list and the 
    /// contents of the list.  This is mostly useful for visual debugging 
    /// @return a string containing information about the contents of the 
    ///         catalog
    public String toString() {
        String s = "";
        s = "LinkedList::count=" + count(); 
        s += ", isEmpty=" + isEmpty(); 
        s += ", ["; 
        CatalogItem it = head;
        while(it != null) {
            if(it != head) {
                s += ", ";
            }
            s += it.getSong().getTitle();
            s += " | ";
            s += it.getSong().getYear();
            it = it.next;
        }
        s += "]";

        return s; 
    }

    /// Returns the earliest and most recent years of all the songs in the
    /// catalog and then clears the catalog of all songs
    /// @return an array of the years of the earliest and most recent songs
    public int[] publish() {
        int[] years = new int[2];
        int oldYear = Integer.MAX_VALUE;
        int newYear = Integer.MIN_VALUE;

        CatalogItem it = head;
        while(it != null) {
            int curYear = it.getSong().getYear();
            if (curYear < oldYear) {
                oldYear = curYear;
                years[0] = oldYear;
            }
            if (curYear > newYear) {
                newYear = curYear;
                years[1] = newYear;
            }
            it = it.next;
        }
        clear();
        return years;
    }

}
