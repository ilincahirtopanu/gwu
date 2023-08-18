/*--------------------------------------------------------------------------
GWU CSCI 1112 Fall 2022
author: James Taylor

A suite of unit tests that validate the methods and behaviors for 
map implementations
--------------------------------------------------------------------------*/

public class UnitTests {
    static String[][] mapdata;

    public static void main(String[] args) {

        mapdata = MapReader.getData("mapdata");

        validateMap(new TreeMap(true), "BINARY TREE as MAP");
        System.out.println();
        validateMap(new HashMap(100), "HASH TABLE as MAP");
        System.out.println();
    }

    /// Validates a map type using a battery of tests.  Report is generated
    /// via text output.
    /// @param map the map to validate
    /// @return pfx a text prefix to annotate the tests
    public static void validateMap(Map map, String pfx) {
        int passes = 0;
        int fails = 0;
        boolean result;
        String value;

        System.out.println(pfx);

		// TODO: Comment these unit tests
        // BLOCK 1 - 
        value = map.get(mapdata[mapdata.length-1][0], new int[1]);
        if( value != null ) {
            fails++;
            System.out.println("::BLOCK 1::TEST 1::FAILED.");
        } else {
            passes++;
        }

		// TODO: Comment these unit tests
        map.set(mapdata[0][0], mapdata[0][1], new int[1]);
        value = map.get(mapdata[0][0], new int[1]);
        if( value == null || value != mapdata[0][1] ) {
            fails++;
            System.out.println("::BLOCK 1::TEST 2::FAILED.");
        } else {
            passes++;
        }
		
		// TODO: Comment these unit tests
        value = map.get(mapdata[mapdata.length-1][0], new int[1]);
        if( value != null ) {
            fails++;
            System.out.println("::BLOCK 1::TEST 3::FAILED.");
        } else {
            passes++;
        }
		
		// TODO: Comment these unit tests
		map.set(mapdata[0][0], mapdata[1][1], new int[1]);
		value = map.get(mapdata[0][0], new int[1]);
		if( value == null || value != mapdata[1][1] ) {
            fails++;
            System.out.println("::BLOCK 1::TEST 4::FAILED.");
        } else {
            passes++;
        }
		map.set(mapdata[0][0], mapdata[0][1], new int[1]);

        // TODO: Comment these unit tests
		// BLOCK 2 - 
        map.set(mapdata[1][0], mapdata[1][1], new int[1]);
        map.set(mapdata[2][0], mapdata[2][1], new int[1]);
        value = map.get(mapdata[0][0], new int[1]);
        if( value == null || value != mapdata[0][1] ) {
            fails++;
            System.out.println("::BLOCK 2::TEST 1::FAILED.");
        } else {
            passes++;
        }
		
		// TODO: Comment these unit tests
		value = map.get(mapdata[mapdata.length-1][0], new int[1]);
        if( value != null ) {
            fails++;
            System.out.println("::BLOCK 2::TEST 2::FAILED.");
        } else {
            passes++;
        }

        // TODO: Comment these unit tests
		value = map.get(mapdata[1][0], new int[1]);
        if( value == null || value != mapdata[1][1] ) {
            fails++;
            System.out.println("::BLOCK 2::TEST 3::FAILED.");
        } else {
            passes++;
        }
        
		// TODO: Comment these unit tests
		value = map.get(mapdata[2][0], new int[1]);
        if( value == null || value != mapdata[2][1] ) {
            fails++;
            System.out.println("::BLOCK 2::TEST 4::FAILED.");
        } else {
            passes++;
        }
		
		map.clear();
		
		// TODO: Comment these unit tests
		value = map.get(mapdata[0][0], new int[1]);
        if( value != null ) {
            fails++;
            System.out.println("::BLOCK 2::TEST 5::FAILED.");
        } else {
            passes++;
        }
		
		// TODO: Comment these unit tests
		value = map.get(mapdata[mapdata.length-1][0], new int[1]);
        if( value != null ) {
            fails++;
            System.out.println("::BLOCK 2::TEST 6::FAILED.");
        } else {
            passes++;
        }

        // TODO: Comment these unit tests
		map.set(mapdata[0][0], mapdata[0][1], new int[1]);
        map.set(mapdata[1][0], mapdata[1][1], new int[1]);
        map.set(mapdata[2][0], mapdata[2][1], new int[1]);
        value = map.get(mapdata[0][0], new int[1]);
        if( value == null || value != mapdata[0][1] ) {
            fails++;
            System.out.println("::BLOCK 2::TEST 7::FAILED.");
        } else {
            passes++;
        }
        
		// TODO: Comment these unit tests
		value = map.get(mapdata[mapdata.length-1][0], new int[1]);
        if( value != null ) {
            fails++;
            System.out.println("::BLOCK 2::TEST 8::FAILED.");
        } else {
            passes++;
        }

        // TODO: Comment these unit tests
		// BLOCK 3 - 
        map.clear();
        buildMap( map, new int[1] );

        // TODO: Comment these unit tests
		result = validateAllExistingKeys( map );
        if( !result ) {
            fails++;
            System.out.println("::BLOCK 3::TEST 1::FAILED: unable to locate all keys for the large data set.");
        } else {
            passes++;
        }

        // TODO: Comment these unit tests
		result = validateNonexistentKeys( map );
        if( !result ) {
            fails++;
            System.out.println("::BLOCK 3::TEST 2::FAILED: matched a key in the large data set that should not exist.");
        } else {
            passes++;
        }

        // report summary
        if( fails > 0 ) {
            System.out.print( "OVERALL : FAILED " );
        } else {
            System.out.print( "OVERALL : PASS " );
        }
        System.out.println("[passes=" + passes + ", fails=" + fails + "]");

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

    /// validates a map containing all the information in mapdata
    /// @param map the map to validate
    /// @return true if all of the mapdata can be retrieved from the map;
    ///         otherwise, false
    public static boolean validateAllExistingKeys( Map map ) {
        for( int i = 0; i < mapdata.length; i++ ) {
            String key = mapdata[i][0];
            String value = map.get(key, new int[1]);

            if( value == null ) {
                return false;
            }

            if( value != mapdata[i][1] ) {
                return false;
            }
        }
        return true;
    }

    /// validates a map does not return values for invalid keys
    /// @param map the map to validate
    /// @return true the map never returns a value for a random sequence
    ///         of characters; otherwise, false
    public static boolean validateNonexistentKeys( Map map ) {
        for( int i = 0; i < mapdata.length; i++ ) {
            String key = Utilities.randomString( mapdata[i][0].length() );
            String value = map.get(key, new int[1]);

            if( value != null ) {
                return false;
            }
        }
        return true;
    }
}

