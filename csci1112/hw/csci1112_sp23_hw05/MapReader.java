/*--------------------------------------------------------------------------
GWU CSCI 1112 Fall 2022
author: James Taylor

The MapReader class reads and parses data from a structured file and loads
the data into an array.  The file structure consists of two columns of tab 
separated string data where the columns are organized as follows: 
University <tab> Location

Because the University name is a unique identifier, it can be used as a key.

--------------------------------------------------------------------------*/
import java.io.*;
import java.util.*;

public class MapReader {
     
    //----------------------------------------------------------------------
    /// Entry point for testing. Commented out so that there is no collision
    /// between mains.  This is a servicing factory class and should not be 
    /// executed in a typical system.
    /*
    public static void main(String[] args) {
        String[][] data = getData("mapdata");
        for(int i = 0; i < data.length; i++ ) {
            System.out.println( data[i][0] + ", " + data[i][1] );
        }
    }
    */


    //----------------------------------------------------------------------
    /// Reads a structured file containing post data from disk (see header
    /// for file structure specification), parses the data into integer 
    /// fields, and returns an integer array with a number rows equal to 
    /// the number of lines in the file and a number of columns equal to 
    /// the number of fields in the file.  Rows are first dim and columns 
    /// are second dim.
    /// @param filename The filename of the file to read in
    /// @return A table in [row][column] format containing the data read.  
    ///         If the read fails, it will cause the program to exit.
    static String[][] getData(String filename) {
        // read the file into a linked list of lines
        LinkedList<String> lines = readLines(filename);
        // validate that the linked list is not empty
        if(lines == null) {
            System.out.println("Uncaught error when reading file: " + filename);
    	    System.exit( 0 );
            return null;
        }

        // parse the line data
        String[][] data = processLines(lines);
        // validate that the parsing was successful
        if(data == null) {
            System.out.println("Uncaught error when parsing file: " + filename);
    	    System.exit( 0 );
            return null;
        }
        
        return data;
    }

    //----------------------------------------------------------------------
    /// Reads structured data in as a linkedlist of strings
    /// @param filename The filename of the file to read in
    /// @return A linked list of every line in the file as read.
    static LinkedList<String> readLines(String filename) {
        BufferedReader br = null;
        FileReader fr = null;
        String line;
        LinkedList<String> lines = null;

        // try-catch necessary fo BufferedReader
        try {
            fr = new FileReader(filename);
            br = new BufferedReader(fr);
            
            // read all lines into the list
            lines = new LinkedList<String>();
            while ((line = br.readLine()) != null) {
            	lines.addLast(line);
            } 
        } catch (IOException e) {
            // fail hard on an exception
	        System.out.println( e );
    	    System.exit( 0 );
	        return null;
        } finally {
            try { 
                br.close(); 
                fr.close();    
            } catch (IOException e) {
                // fail hard on an exception
	            System.out.println( e );
    	        System.exit( 0 );
	            return null;
            }
        }
        return lines;
    }

    //----------------------------------------------------------------------
    /// Parses a linkedlist of structured data into a [row][column] table of
    /// strings.  The fields for a given row are 0:university, 1:location
    /// @param l the list of strings to parse
    /// @return the array of strings.
    static String[][] processLines(LinkedList<String> l) {
        String[][] data = new String[l.size()][];
        Iterator<String> it = l.iterator();
        int i = 0;

        // Note: There is the possiblity of uncaught exceptions in the line 
        // parsing if the data does not meet the specification
        while( it.hasNext() ) {
            // allocate new record on the heap and store reference in 
            // current row
            data[i] = new String[2];
            // split on tab delimiter
            Scanner scanner = new Scanner( it.next() ).useDelimiter("\t");
            // parse all fields as ints
            data[i][0] = scanner.next();  // University
            data[i][1] = scanner.next();  // Location
            // increment row
            i++;
        }
        return data;
    }
}
