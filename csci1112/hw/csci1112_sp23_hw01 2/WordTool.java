/*--------------------------------------------------------------------------
GWU CSCI1112 
author: Rahul Simha, James Taylor

This is based on Rahul Simha's original WordTool utility.  It has only
been slightly modified in terms of consistency of coding style.

It could do with some added documentation to bring it up to standards
illustrated for students.
--------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;

public class WordTool {

    public static String[] getDictionary() {
	    return getDictionary( "words" );
    }

    public static String[] getDictionary( String fileName ) {
	    String[] words = readDictionary( fileName );
        String[] scrubbedWords = scrub( words );
	    return scrubbedWords;  
    }

    static String[] readDictionary( String fileName ) {
    	String[] words = null;
	    try {
	        // Since we don't know in advance how many words there 
    	    // are, we'll use a list instead of an array.
	        LinkedList<String> stringList = new LinkedList<String>();

	        // Scanner knows how to skip whitespace.
    	    Scanner scanner = new Scanner( new FileReader( fileName ) );
	        while( scanner.hasNext() ) {
		        // At each step, get the next word and place in list.
        		String s = scanner.next();
	        	stringList.addLast (s);
	        }

    	    // Now that we know the size, we'll make an array.
	        words = new String[ stringList.size() ];
	        Iterator<String> iter = stringList.iterator();
    	    int i = 0;
	        while( iter.hasNext() ) {
	    	    words[i] = iter.next();
    	    	i ++;
    	    }

	        // Done.
	        return words;
    	} catch( IOException e ) {
    	    System.out.println( e );
	        System.exit( 0 );
	        return null;
    	}
    }

    static String[] scrub( String[] words ) {
        // Remove words with caps, and single-letter words
        int badWords = 0;
        for( int i = 0; i < words.length; i++ ) {
            if( words[i].length() <= 1 ) {
                badWords ++;
                words[i] = null;
            } else if( Character.isUpperCase (words[i].charAt(0)) ) {
                badWords ++;
                words[i] = null;
            }
        }

    	// Make space for the good words.
        String[] realWords = new String[ words.length - badWords ];
        int j = 0;
        for (int i = 0; i < realWords.length; i++) {
            while (words[j] == null) {
                j ++;
            }
            realWords[i] = words[j];
            j ++;
        }

        for (int i = 0; i < realWords.length; i++) {
            realWords[i] = realWords[i].toUpperCase();
        }

        return realWords;
    }
}
