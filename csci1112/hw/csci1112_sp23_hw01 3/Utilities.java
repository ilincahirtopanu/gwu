/*--------------------------------------------------------------------------
GWU CSCI1112 Spring 2023
author: James Taylor

This class provides any utility methods to support a version of TileGame
--------------------------------------------------------------------------*/

class Utilities {
    /// This method trims out all characters that are not alphas and then
    /// converts the string to lowercase.
    /// @param s the string to clean
    /// @return the cleaned string 
    public static String clean(String s)
    {
        return s.replaceAll("[^a-zA-Z]","").toUpperCase();
    }
}
