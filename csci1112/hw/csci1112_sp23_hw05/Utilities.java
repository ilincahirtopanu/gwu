/*--------------------------------------------------------------------------
GWU CSCI 1112 Fall 2022
author: James Taylor

This class contains general utility functions that may be useful to the 
implementation
--------------------------------------------------------------------------*/
import java.util.*;

public class Utilities {

    /// Generates a string of random characters.
    /// Based on solutions discussed at https://stackoverflow.com/questions/20536566/creating-a-random-string-with-a-z-and-0-9-in-java
    /// @param length the length of the string to generate
    /// @return a string containing random characters of specified length 
    public static String randomString( int length ) {
        String legalchars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randint = random.nextInt( legalchars.length() );
            sb.append( legalchars.charAt(randint) );
        }
        return sb.toString();
    }

}
