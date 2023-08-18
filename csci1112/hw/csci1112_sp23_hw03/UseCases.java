/*--------------------------------------------------------------------------
GWU - CS1112 Data Structures and Algorithms - Spring 2023

Use cases for both the array-list and linked-list based music catalogs.
You can run this program once all the unit tests pass and to see some 
typical interactions with the music catalog.

authors: Charles Peeke
--------------------------------------------------------------------------*/
public class UseCases {
    private static Song[] songs;

    public static void main(String[] args) {

        songs = CatalogHelper.getCatalog();

        System.out.println("Running use cases with ArrayList");
        usecase1(new ArrayList());
        System.out.println();
        usecase2(new ArrayList());
        System.out.println();
        usecase3(new ArrayList());
        System.out.println();
        usecase4(new ArrayList());

        System.out.println();
        System.out.println();

        System.out.println("Running use cases with LinkedList");
        usecase1(new LinkedList());
        System.out.println();
        usecase2(new LinkedList());
        System.out.println();
        usecase3(new LinkedList());
        System.out.println();
        usecase4(new LinkedList());
    }

    // A person puts one song into the catalog and the does a publish
    public static void usecase1(MusicCatalog catalog) {
        System.out.println("* Use Case 1: Add one song to the catalog and publish");

        catalog.add(songs[4]);

        // List should contain 1 song
        System.out.println(catalog);
        // publish should have the same value as the song listed above
        int[] years = catalog.publish();
        System.out.println("Published catalog with songs from " + years[0] + " to " + years[1]);

        // List should be empty
        System.out.println(catalog);
    }

    // A person puts multiple songs into the catalog and then does a publish
    public static void usecase2(MusicCatalog catalog) {
        System.out.println("* Use Case 2: Add multiple songs to the catalog and publish");

        catalog.add(songs[1]);
        catalog.add(songs[3]);

        // List should contain 2 songs
        System.out.println(catalog);

        // publish should have the total value of all songs listed above
        int[] years = catalog.publish();
        System.out.println("Published catalog with songs from " + years[0] + " to " + years[1]);

        // List should be empty
        System.out.println(catalog);
    }

    // A person puts a song into the catalog, removes that song, and then publishes the catalog
    public static void usecase3(MusicCatalog catalog) {
        System.out.println("* Use Case 3: Add an song to the catalog then remove that song.");

        catalog.add(songs[6]);

        // List should contain 1 song
        System.out.println(catalog);

        catalog.remove(songs[6]);

        // List should be empty
        System.out.println(catalog);

        // publish should have a range of 0 to 0
        int[] years = catalog.publish();
        System.out.println("Published catalog with songs from " + years[0] + " to " + years[1]);

        // List should be empty
        System.out.println(catalog);
    }

    // A person adds a few songs to the catalog, then searches through the catalog
    // to confirm a song was added, and then searches through the catalog to
    // discover a song was not added.
    public static void usecase4(MusicCatalog catalog) {
        System.out.println("* Use Case 4: Search through the catalog for a specific song");

        catalog.add(songs[7]);
        catalog.add(songs[8]);
        catalog.add(songs[9]);

        // List should contain 3 songs
        System.out.println(catalog);

        // Product at index 8 should be found in the catalog
        if(catalog.contains(songs[8])) {
            System.out.println("Found: " + songs[8] + " in the catalog");
        }

        // Product at index 0 should not be found in the catalog
        if(!catalog.contains(songs[0])) {
            System.out.println("Forgot to put: " + songs[0] + " in the catalog");
        }
    }
}
