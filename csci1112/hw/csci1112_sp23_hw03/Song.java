/*--------------------------------------------------------------------------
GWU - CS1112 Data Structures and Algorithms - Spring 2023

This class encapsulates data and behaviors for Songs

authors: Charles Peeke
--------------------------------------------------------------------------*/
public class Song {

    private final String title;   /// A title of a song
    private final int year;   /// Year the song was released
    // This can easily be expanded for more details of Songs
    //      but we are not expecting you to add more for the assignment
    // private final String album;
    // private final String artists;

    /// Parameterized constructor to ensure all songs are assigned both
    /// title and year upon creation
    /// @param title the unique string identifier for a given song
    /// @param year the release year of a song
    public Song(String title, int year) {
        this.title = title;
        this.year = year;
    }

    /// Accessor to retrieve the assigned title of this song
    /// @return the value of the title field
    public String getTitle() {
        return this.title;
    }

    /// Accessor to retrieve the year of this song
    /// @return the value of the year field
    public int getYear() {
        return this.year;
    }

    /// Equality comparison for two songs.  Determines whether this
    /// song has the same field values as a parametrized song
    /// @param other the song to compare this song to
    /// @return true if the two songs have all the same values;
    ///         otherwise, false
    public boolean equals(Song other) {
        if (!this.title.equals(other.title)) {
            return false;
        }
        else {
            if (this.year == other.year) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    /// Ranking comparison of two songs.  Can determine whether this
    /// song is lexicographically before, equivalent to, or after anothe
    /// song.
    /// @param other the song to compare this song to
    /// @return 0 if two songs are lexicographically equivalent, 1 if
    ///         this song is lexicographically after the other song,
    ///         and -1 if this song is lexicographically before the
    ///         other song
    public int compareTo(Song other) {
        if(this.title.equals(other.title) && this.year == other.year) {
            return 0;
        }
        int result = this.title.compareTo(other.title);
        if( result != 0 ) {
            return result;
        }
        if( other.year < this.year ) {
            return 1;
        }
        return -1;
    }

    /// Overridden method to return a meaningful string containing song
    /// information from this object
    /// @return a string containing song information.  Could be parsed
    ///         for serialization
    public String toString() {
        String s = new String(this.title);
        s += " | " + this.year;
        return s;
    }
}
