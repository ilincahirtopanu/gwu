/*--------------------------------------------------------------------------
GWU CSCI 1112 Fall 2022
author: James Taylor

This program inserts model data into the maps (approximtely 200 keys) and 
reports statistics on the number of comparisons needed for the methods, 
With this amount of data, we should be able to see performance that 
reflects big O analysis of these data structures.

--------------------------------------------------------------------------*/

public class Analysis {
    static String[][] mapdata;

    public static void main(String[] args) {

        mapdata = MapReader.getData("mapdata");

        // The first binary tree will not regularly balance and so should
        // trend toward a degenerate structure
        profileBinaryTree(false);
        System.out.println();

        // The second binary tree is rebalanced after every insertion
        // (this frequency may be too high and can be costly in itself)
        profileBinaryTree(true);
        System.out.println();

        // The first hashtable has very few buckets with respect to the size
        // of the data set
        profileHashTable(10);
        System.out.println();

        // The second hashtable has approximately the same order of buckets
        // with respect to the size of the data set
        profileHashTable(100);
        System.out.println();

        // The third hashtable has the same number of buckets
        // with respect to the size of the data set
        profileHashTable(mapdata.length);
        System.out.println();

        // The fourth hashtable has an order of magnitude more buckets
        // with respect to the size of the data set
        profileHashTable(1000);
        System.out.println();
    }

    /// inserts all the kvp data in the mapdata global into the designated
    /// map.
    /// @param map the map to insert data into
    /// @param profile the profile array in which to store comparisons
    public static void buildMap( Map map, int[] profile ) {
        for(int i = 0; i < mapdata.length; i++ ) {
            map.set(mapdata[i][0], mapdata[i][1], profile);
        }
    }

    /// profiles the comparisons needed for map operations in binary tree
    /// @param rebalance the flag indicating whether the binary tree should
    ///        be rebalanced after each insertion.  Comparisons are NOT to
    ///        be counted in the rebalance operation, so there is a bit of
    ///        an uncaptured cost in this analysis if rebalance is true
    public static void profileBinaryTree(boolean rebalance) {
        TreeMap btree = new TreeMap(rebalance);
        int n = mapdata.length;

        String pfx = "Binary Tree Map::";
        if( rebalance ) {
            pfx += "Balanced";
        } else {
            pfx += "Unbalanced";
        }

        System.out.println(pfx);

        int[] insertProfile = new int[1];
        int[] hitProfile = new int[2]; 
        int[] missProfile = new int[2]; 

        buildMap( btree, insertProfile );
        System.out.println("::Insert::[Total KVPs = " + n + ", Total Compares = " + insertProfile[0] + "]" );

        findAllExistingKeys( btree, hitProfile );
        System.out.println( "::Search::Existing::[Max Compares = " + hitProfile[0] + ", Average Compares = " + (double) hitProfile[1] / (double) n + "]" );

        searchNonexistentKey( btree, missProfile );
        System.out.println( "::Search::Miss::[Max Compares = " + missProfile[0] + ", Average Compares = " + (double) missProfile[1] / (double) n + "]" );
    }

    /// profiles the comparisons needed for map operations in hash table
    /// @param buckets the number of buckets in the hash table array.  The
    ///        ratio of buckets to data will affect efficiency
    public static void profileHashTable(int buckets) {
        HashMap htable = new HashMap(buckets);
        int n = mapdata.length;

        String pfx = "Hash Table Map::" + buckets + " Buckets";

        System.out.println(pfx);

        int[] insertProfile = new int[1];
        int[] hitProfile = new int[2]; 
        int[] missProfile = new int[2]; 

        buildMap( htable, insertProfile );
        System.out.println( "::Insert::[Total KVPs = " + n + ", Total Compares = " + insertProfile[0] + "]" );

        findAllExistingKeys( htable, hitProfile );
        System.out.println( "::Search::Existing::[Max Compares = " + hitProfile[0] + ", Average Compares = " + ((double) hitProfile[1] / (double) n) + "]" );

        searchNonexistentKey( htable, missProfile );
        System.out.println( "::Search::Miss::[Max Compares = " + missProfile[0] + ", Average Compares = " + ((double) missProfile[1] / (double) n) + "]" );
    }


    /// finds all keys in a map containing all the information in mapdata
    /// @param map the map to validate
    /// @param profile an array of 2 cells to summarize comparison stats 
    ///        with the format [total compares, max compares]
    public static void findAllExistingKeys( Map map, int[] profile ) {
        int[] compares;
        
        for( int i = 0; i < mapdata.length; i++ ) {
            String key = mapdata[i][0];
            compares = new int[1];
            map.get(key, compares);

            if( compares[0] > profile[0] ) profile[0] = compares[0];
            profile[1] += compares[0];
        }
    }

    /// attempts to find random keys in a map.  Attempts n times where n
    /// is the length of mapdata
    /// @param map the map to validate
    /// @param profile an array of 2 cells to summarize comparison stats 
    ///        with the format [total compares, max compares]
    public static void searchNonexistentKey( Map map, int[] profile ) {
        int[] compares;
        
        for( int i = 0; i < mapdata.length; i++ ) {
            String key = Utilities.randomString( mapdata[i][0].length() );
            compares = new int[1];
            map.get(key, compares);

            if( compares[0] > profile[0] ) profile[0] = compares[0];
            profile[1] += compares[0];
        }
    }
}
