/*
            SAMPLE ASSESSMENT2_6
*/

public class tileMirroring{

    public static String isMirror(int width, int height, int tile1, int tile2){
        int row1 = (tile - 1) / width;
        int row2 = (tile + 1) / width;
        int col1 = (tile - 1) % width;
        int col2 = (tile + 1) % width;
        if (width % 2 == 0) {
            int middle = width / 2;
        } else {
            middle = width / 2 + 1;
        }
        if (tile1 == tile2) {
            return "no";
        } else if (row1 != row2 || col1 != col2) {
            return "no";
        } else if (middle - col1 == col2 - middle){
            return "yes";
        } else {
            return "no";
        }
    }
            
        
    
  
    public static void main(String[] args){
      System.out.println("test1: " + isMirror(1,1,1,1).equals("no"));
      System.out.println("test2: " + isMirror(1,2,1,1).equals("no"));
      System.out.println("test3: " + isMirror(1,2,1,2).equals("no"));
      System.out.println("test4: " + isMirror(1,2,2,1).equals("no"));
      System.out.println("test5: " + isMirror(1,2,2,2).equals("no"));
      System.out.println("test6: " + isMirror(2,1,1,1).equals("no"));
      System.out.println("test7: " + isMirror(2,1,1,2).equals("yes"));
      System.out.println("test8: " + isMirror(2,1,2,1).equals("yes"));
      System.out.println("test9: " + isMirror(2,1,2,2).equals("no"));
      System.out.println("test10: " + isMirror(2,2,1,2).equals("yes"));
      System.out.println("test11: " + isMirror(2,2,1,3).equals("no"));
      System.out.println("test12: " + isMirror(2,2,1,4).equals("no"));
      System.out.println("test13: " + isMirror(2,2,2,1).equals("yes"));
      System.out.println("test14: " + isMirror(2,2,2,3).equals("no"));
      System.out.println("test15: " + isMirror(2,2,2,4).equals("no"));
      System.out.println("test16: " + isMirror(2,2,3,1).equals("no"));
      System.out.println("test17: " + isMirror(2,2,3,2).equals("no"));
      System.out.println("test18: " + isMirror(2,2,3,4).equals("yes"));
      System.out.println("test19: " + isMirror(2,2,4,1).equals("no"));
      System.out.println("test20: " + isMirror(2,2,4,2).equals("no"));
      System.out.println("test21: " + isMirror(2,2,4,3).equals("yes"));
      System.out.println("test22: " + isMirror(2,3,1,2).equals("yes"));
      System.out.println("test23: " + isMirror(2,3,1,3).equals("no"));
      System.out.println("test24: " + isMirror(2,3,1,4).equals("no"));
      System.out.println("test25: " + isMirror(2,3,1,5).equals("no"));
      System.out.println("test26: " + isMirror(2,3,1,6).equals("no"));
      System.out.println("test27: " + isMirror(2,3,2,1).equals("yes"));
      System.out.println("test28: " + isMirror(2,3,2,3).equals("no"));
      System.out.println("test29: " + isMirror(2,3,2,4).equals("no"));
      System.out.println("test30: " + isMirror(2,3,2,5).equals("no"));
      System.out.println("test31: " + isMirror(2,3,2,6).equals("no"));
      System.out.println("test32: " + isMirror(2,3,3,4).equals("yes"));
      System.out.println("test33: " + isMirror(2,3,3,5).equals("no"));
      System.out.println("test34: " + isMirror(2,3,3,6).equals("no"));
      System.out.println("test35: " + isMirror(2,3,4,5).equals("no"));
      System.out.println("test36: " + isMirror(2,3,4,6).equals("no"));
      System.out.println("test37: " + isMirror(2,3,5,6).equals("yes"));
      System.out.println("test38: " + isMirror(3,2,1,2).equals("no"));
      System.out.println("test39: " + isMirror(3,2,1,3).equals("yes"));
      System.out.println("test40: " + isMirror(3,2,1,4).equals("no"));
      System.out.println("test41: " + isMirror(3,2,1,5).equals("no"));
      System.out.println("test42: " + isMirror(3,2,1,6).equals("no"));
      System.out.println("test43: " + isMirror(3,2,2,1).equals("no"));
      System.out.println("test44: " + isMirror(3,2,2,3).equals("no"));
      System.out.println("test45: " + isMirror(3,2,2,4).equals("no"));
      System.out.println("test46: " + isMirror(3,2,2,5).equals("no"));
      System.out.println("test47: " + isMirror(3,2,2,6).equals("no"));
      System.out.println("test48: " + isMirror(3,2,3,4).equals("no"));
      System.out.println("test49: " + isMirror(3,2,3,5).equals("no"));
      System.out.println("test50: " + isMirror(3,2,3,6).equals("no"));
      System.out.println("test51: " + isMirror(3,2,4,5).equals("no"));
      System.out.println("test52: " + isMirror(3,2,4,6).equals("yes"));
      System.out.println("test53: " + isMirror(3,2,5,6).equals("no"));
      System.out.println("test54: " + isMirror(7,10,11,12).equals("no"));
      System.out.println("test55: " + isMirror(7,10,24,26).equals("yes"));
      System.out.println("test56: " + isMirror(7,10,30,34).equals("yes"));
      System.out.println("test57: " + isMirror(7,10,59,52).equals("no"));
    }
  
  }