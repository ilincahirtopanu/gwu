/*--------------------------------------------------------------------------
GWU CSCI 1112 Spring 2023
author: James Taylor

This is a set of unit tests that validate the TileGame class which is 
intended to facilitate playing Scramble.
--------------------------------------------------------------------------*/
class UnitTests {
    // This is a case where a global reference to a dictionary makes sense.
    // The dictionary is a read only database of sorts and we wish to have 
    // this reference available for any unit tests that need to use the 
    // whole dictionary.  We also wish to load it only once.
    static String[] dictionary;
    // For most cases, this would be a bad decision, but it is acceptable
    // here given the above behavior and requirements

    /// The main function acts as the test harness.  Any unit tests must be
    /// registered in this function.
    public static void main(String[] args) {
        // Get the dictionary.
        dictionary = WordTool.getDictionary ();

        // fail tracks whether any test has failed.
        boolean fail = false;

        // ---------------------------------------------------------------

        System.out.println("Block 1 Unit Tests");

        System.out.println("Unit Test 1.1 - Begin");
    	if( unitTest1_1() ) {
    	    System.out.println("Unit Test 1.1 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 1.1 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 1.2 - Begin");
    	if( unitTest1_2() ) {
    	    System.out.println("Unit Test 1.2 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 1.2 - Failed");
            fail = true;
    	}

        if( fail ) {
            System.out.println("Failed Block 1 Unit Testing");
        } else {
            System.out.println("Passed Block 1 Unit Testing");
        }

        // ---------------------------------------------------------------

        fail = false;
        System.out.println("Block 2 Unit Tests");

        System.out.println("Unit Test 2.1 - Begin");
    	if( unitTest2_1() ) {
    	    System.out.println("Unit Test 2.1 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 2.1 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 2.2 - Begin");
    	if( unitTest2_2() ) {
    	    System.out.println("Unit Test 2.2 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 2.2 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 2.3 - Begin");
    	if( unitTest2_3() ) {
    	    System.out.println("Unit Test 2.3 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 2.3 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 2.4 - Begin");
    	if( unitTest2_4() ) {
    	    System.out.println("Unit Test 2.4 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 2.4 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 2.5 - Begin");
    	if( unitTest2_5() ) {
    	    System.out.println("Unit Test 2.5 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 2.5 - Failed");
            fail = true;
    	}

        if( fail ) {
            System.out.println("Failed Block 2 Unit Testing");
        } else {
            System.out.println("Passed Block 2 Unit Testing");
        }
 
        // ---------------------------------------------------------------

        fail = false;
        System.out.println("Block 3 Unit Tests");

        System.out.println("Unit Test 3.1 - Begin");
    	if( unitTest3_1() ) {
    	    System.out.println("Unit Test 3.1 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 3.1 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 3.2 - Begin");
    	if( unitTest3_2() ) {
    	    System.out.println("Unit Test 3.2 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 3.2 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 3.3 - Begin");
    	if( unitTest3_3() ) {
    	    System.out.println("Unit Test 3.3 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 3.3 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 3.4 - Begin");
    	if( unitTest3_4() ) {
    	    System.out.println("Unit Test 3.4 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 3.4 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 3.5 - Begin");
    	if( unitTest3_5() ) {
    	    System.out.println("Unit Test 3.5 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 3.5 - Failed");
            fail = true;
    	}

        System.out.println("Unit Test 3.6 - Begin");
    	if( unitTest3_6() ) {
    	    System.out.println("Unit Test 3.6 - Succeeded");
    	} else {
    	    System.out.println("Unit Test 3.6 - Failed");
            fail = true;
    	}

        if( fail ) {
            System.out.println("Failed Block 3 Unit Testing");
        } else {
            System.out.println("Passed Block 3 Unit Testing");
        }
    }

    //========================= Unit Tests ========================= 
    /// Validates that copying the tilebag results in a reference to a
    /// new array rather than a reference to the same array.  If the
    /// two references are the same, then the copyTileBag is only making
    /// a shallow copy and the model data in the tilebag array is not 
    /// protected.  copyTileBag must perform a deep copy.
    public static boolean unitTest1_1() {
        // Get two references arrays containing tilebag data
        int[] tb1 = TileGame.copyTileBag();
        int[] tb2 = TileGame.copyTileBag();

        // If the references are not unique, ie they point to the same
        // array, we can assume that copyTileBag is a shallow copy
        if( tb1 == tb2 ) { 
            return false;
        }
	    return true;
    }

    /// Validates the data in the tilebag itself.  This is to make sure
    /// that the deep copy was successful.
    public static boolean unitTest1_2() {
        int[] tb = TileGame.copyTileBag();

        if( tb.length != 26 ) { 
            return false;
        }

        for( int i = 0; i < tb.length; i++ ) {
            if( tb[i] <= 0 || tb[i] > 12 ) {
                return false;
            }
        }

        // validate the number of A's
        if( tb[0] != 9 ) { 
            return false;
        }

        // validate the number of E's
        if( tb[4] != 12 ) { 
            return false;
        }

        // validate the number of Z's
        if( tb[25] != 1 ) { 
            return false;
        }
    
        // This may be enough checks, but it may be a bit lazy.  Hard to
        // know exactly how much unit testing is necessary.  The grading
        // unit test could check all values.

	    return true;
    }

    //--------------------------------------------------------------------
    /// Validates that the canSpell correctly indicates a hand that 
    /// does not contain the correct letters cannot spell the word
    public static boolean unitTest2_1() {
        String hand = "ZAMIT";
        String word = "AMAZE";
       
        boolean result = TileGame.canSpell(hand.toCharArray(), word.toCharArray() );
	    if(result) {
	        return false;
	    }
	    return true;
    }

    /// Validates that canSpell correctly indicates a hand that contains
    /// all matching letters but too few of the letters cannot spell the
    /// word
    public static boolean unitTest2_2() {
        String hand = "ZAMET";
        String word = "AMAZE";
       
        boolean result = TileGame.canSpell(hand.toCharArray(), word.toCharArray() );
	    if(result) {
	        return false;
	    }
	    return true;
    }

    /// Validates that canSpell correctly indicates a hand can spell a word
    /// for which it has the correct letters and multiple instances of some
    /// of those letters
    public static boolean unitTest2_3() {
        String hand = "ZAMEA";
        String word = "AMAZE";
       
        boolean result = TileGame.canSpell(hand.toCharArray(), word.toCharArray() );
	    if(!result) {
	        return false;
	    }
	    return true;
    }

    /// Validates that canSpell correctly handles an invalid reference to
    /// a hand
    public static boolean unitTest2_4() {
        char[] hand = null;
        String word = "AMAZE";
       
        boolean result = TileGame.canSpell(hand, word.toCharArray() );
	    if(result) {
	        return false;
	    }
	    return true;
    }

    /// Validates that canSpell correctly handles an invalid reference to
    /// a word
    public static boolean unitTest2_5() {
        String hand = "ZAM";
        char[] word = null;
       
        boolean result = TileGame.canSpell(hand.toCharArray(), word );
	    if(result) {
	        return false;
	    }
	    return true;
    }


    //--------------------------------------------------------------------
    /// Validates that getBestWord can correctly fail to spell a word
    public static boolean unitTest3_1() {
        String hand = "A";
        String[] dictionary = { "I", "AM", "MAZE", "AMAZE" };
       
        String result = TileGame.getBestWord( hand.toCharArray(), dictionary );
	    if( result != null ) {
	        return false;
	    }
	    return true;
    }

    /// Validates that getBestWord identifies a word with unused characters
    public static boolean unitTest3_2() {
        String hand = "ZAM";
        String[] dictionary = { "I", "AM", "MAZE", "AMAZE" };
       
        String result = TileGame.getBestWord( hand.toCharArray(), dictionary );
	    if( result.compareTo(dictionary[1]) != 0 ) {
	        return false;
	    }
	    return true;
    }

    /// Validates that getBestWord correctly identifies a word that 
    /// could be confused with another word in the characters are improperly
    /// allowed to repeat
    public static boolean unitTest3_3() {
        String hand = "EZAM";
        String[] dictionary = { "I", "AM", "MAZE", "AMAZE" };
       
        String result = TileGame.getBestWord( hand.toCharArray(), dictionary );
	    if( result.compareTo(dictionary[2]) != 0 ) {
	        return false;
	    }
	    return true;
    }

    /// Validates that getBestWord correctly identifies a word with multiple
    /// instances of a character
    public static boolean unitTest3_4() {
        String hand = "AEZAM";
        String[] dictionary = { "I", "AM", "MAZE", "AMAZE" };
       
        String result = TileGame.getBestWord( hand.toCharArray(), dictionary );
	    if( result.compareTo(dictionary[3]) != 0 ) {
	        return false;
	    }
	    return true;
    }

    /// Validates that getBestWord correctly handles an invalid reference to
    /// a hand
    public static boolean unitTest3_5() {
        char[] hand = null;
        String[] dictionary = { "I", "AM", "MAZE", "AMAZE" };
       
        String result = TileGame.getBestWord( hand, dictionary );
	    if( result != null ) {
	        return false;
	    }
	    return true;
    }

    /// Validates that getBestWord correctly handles an invalid reference to
    /// a dictionary
    public static boolean unitTest3_6() {
        String hand = "AEZAM";
        String[] dictionary = null;
       
        String result = TileGame.getBestWord( hand.toCharArray(), dictionary );
	    if( result != null ) {
	        return false;
	    }
	    return true;
    }

}
