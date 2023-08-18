/*--------------------------------------------------------------------------
GWU CSCI1112 Spring 2023
author: Charles Peeke

The ScheduleReader class reads and parses data from a structured file and loads
the data into an array.  The file structure consists of comma separated String 
data where the data is organized as follows: 
Department, Class #, Class Title, Day of The Week, Start Time (24h), End Time (24h)
--------------------------------------------------------------------------*/
import java.io.*;
import java.util.*;

public class ScheduleReader {
     
    //----------------------------------------------------------------------
    /// Entry point for testing.  Commented out so to avoid collision
    /// between mains.  This is a servicing factory class and should not be 
    /// executed in a typical system.
    
    /* 
    public static void main(String[] args) {
        String[][] data = getSchedules("classes.csv");
        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2] + " " + data[i][3]+ " " + data[i][4]);
        } 
    }
    */
    

    //---------------------------------------------------------------------
    /// Reads a structured file containing post data from disk (see header
    /// for file structure specification), parses the data into integer 
    /// fields, and returns an integer array with a number rows equal to the
    /// number of lines in the file and a number of columns equal to the 
    /// number of fields in the file.  Rows are first dim and columns are 
    /// second dim.
    /// @param filename The filename of the file to read in
    /// @return A table in [row][column] format containing the data read.  
    ///         If the read fails, will cause the program to exit.
    static String[][] getSchedule(String filename) {
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
    /// Strings.  The fields for a given row are described in the header
    /// @param l the list of strings to parse
    /// @return the array of integers.
    static String[][] processLines(LinkedList<String> l) {
        String[][] data = new String[l.size()][];
        Iterator<String> it = l.iterator();
        int i = 0;

        // Note: There is the possiblity of uncaught exceptions in the line 
        // parsing if the data does not meet the specification
        while( it.hasNext() ) {
            // allocate new record on the heap and store reference in 
            // current row
            data[i] = new String[5];
            // split on tab delimiter
            Scanner scanner = new Scanner( it.next() ).useDelimiter(",");
            // parse all fields as ints
            data[i][0] = scanner.next();  // CSCI
            data[i][1] = scanner.next();  // 1112
            data[i][2] = scanner.next();  // Title
            data[i][3] = scanner.next();  // Start Time
            data[i][4] = scanner.next();  // End Time

            // increment row
            i++;
        }
        return data;
    }
}
