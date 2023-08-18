/*--------------------------------------------------------------------------
GWU - CS1112 Data Structures and Algorithms - Spring 2023

This class is used to model the database request for music data for
a Music Catalog.  A query for the catalog should return the set of all
songs currently in the catalog.

authors: Charles Peeke
--------------------------------------------------------------------------*/
public class CatalogHelper {

    /// Returns the array of all songs currently in the Catalog
    /// @return an array of Song types
    public static Song[] getCatalog() {
        Song[] songs = new Song[10];
        songs[0] = new Song("Take on Me", 1985);
        songs[1] = new Song("Cha-Cha Slide", 2000);
        songs[2] = new Song("On Top of the World", 2012);
        songs[3] = new Song("Fireflies", 2009);
        songs[4] = new Song("Africa", 1982);
        songs[5] = new Song("We Are Young", 2012);
        songs[6] = new Song("Some Nights", 2012);
        songs[7] = new Song("Respect", 1967);
        songs[8] = new Song("Don't Stop Me Now", 1978);
        songs[9] = new Song("Fire and Rain", 1970);
        return songs;
    }
}
