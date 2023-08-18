import javax.lang.model.util.ElementScanner6;

/*
            SAMPLE ASSESSMENT2_2
*/
/* Imagine that the user specifies with width and height of a grid, 
        and provides two tiles in that grid. You will write code to determine 
        if the two tiles share an edge. 
        different options:

        analyze the problem the way a human would and then figure out the code from there
        
        row = (tile - 1) / width
        col = (tile - 1) % width
        */

public class shareEdge{

        public static String checkEdge(int width, int height, int tile1, int tile2) {
          //same tile
          int row1 = (tile1 - 1) / width;
          int row2 = (tile2 - 1) / width;
          int col1 = (tile1 - 1) % width;
          int col2 = (tile2 - 1) % width;
          if (((row2 - row1 == 1) || (row2 - row1 == -1)) 
          && (col2 - col1 == 0)) {//tiles share a horizontal edge
            return "edge";
          } else if (((col2 - col1 == 1) || (col2 - col1 == -1)) 
          && (row2 - row1 == 0)) {//tiles share a verticle edge
            return "edge";
          } else if (tile1 == tile2){
            return "not edge";
          } else {
            return "not edge";
          }
        }
        public static void main(String[] args){
          System.out.println("test1: " + checkEdge(1,1,1,1).equals("not edge"));
          System.out.println("test2: " + checkEdge(1,2,1,1).equals("not edge"));
          System.out.println("test3: " + checkEdge(1,2,1,2).equals("edge"));
          System.out.println("test4: " + checkEdge(1,2,2,1).equals("edge"));
          System.out.println("test5: " + checkEdge(1,2,2,2).equals("not edge"));
          System.out.println("test6: " + checkEdge(2,1,1,1).equals("not edge"));
          System.out.println("test7: " + checkEdge(2,1,1,2).equals("edge"));
          System.out.println("test8: " + checkEdge(2,1,2,1).equals("edge"));
          System.out.println("test9: " + checkEdge(2,1,2,2).equals("not edge"));
          System.out.println("test10: " + checkEdge(2,2,1,2).equals("edge"));
          System.out.println("test11: " + checkEdge(2,2,1,3).equals("edge"));
          System.out.println("test12: " + checkEdge(2,2,1,4).equals("not edge"));
          System.out.println("test13: " + checkEdge(2,2,2,1).equals("edge"));
          System.out.println("test14: " + checkEdge(2,2,2,3).equals("not edge"));
          System.out.println("test15: " + checkEdge(2,2,2,4).equals("edge"));
          System.out.println("test16: " + checkEdge(2,2,3,1).equals("edge"));
          System.out.println("test17: " + checkEdge(2,2,3,2).equals("not edge"));
          System.out.println("test18: " + checkEdge(2,2,3,4).equals("edge"));
          System.out.println("test19: " + checkEdge(2,2,4,1).equals("not edge"));
          System.out.println("test20: " + checkEdge(2,2,4,2).equals("edge"));
          System.out.println("test21: " + checkEdge(2,2,4,3).equals("edge"));
          System.out.println("test22: " + checkEdge(2,3,1,2).equals("edge"));
          System.out.println("test23: " + checkEdge(2,3,1,3).equals("edge"));
          System.out.println("test24: " + checkEdge(2,3,1,4).equals("not edge"));
          System.out.println("test25: " + checkEdge(2,3,1,5).equals("not edge"));
          System.out.println("test26: " + checkEdge(2,3,1,6).equals("not edge"));
          System.out.println("test27: " + checkEdge(2,3,2,1).equals("edge"));
          System.out.println("test28: " + checkEdge(2,3,2,3).equals("not edge"));
          System.out.println("test29: " + checkEdge(2,3,2,4).equals("edge"));
          System.out.println("test30: " + checkEdge(2,3,2,5).equals("not edge"));
          System.out.println("test31: " + checkEdge(2,3,2,6).equals("not edge"));
          System.out.println("test32: " + checkEdge(2,3,3,4).equals("edge"));
          System.out.println("test33: " + checkEdge(2,3,3,5).equals("edge"));
          System.out.println("test34: " + checkEdge(2,3,3,6).equals("not edge"));
          System.out.println("test35: " + checkEdge(2,3,4,5).equals("not edge"));
          System.out.println("test36: " + checkEdge(2,3,4,6).equals("edge"));
          System.out.println("test37: " + checkEdge(2,3,5,6).equals("edge"));
          System.out.println("test38: " + checkEdge(3,2,1,2).equals("edge"));
          System.out.println("test39: " + checkEdge(3,2,1,3).equals("not edge"));
          System.out.println("test40: " + checkEdge(3,2,1,4).equals("edge"));
          System.out.println("test41: " + checkEdge(3,2,1,5).equals("not edge"));
          System.out.println("test42: " + checkEdge(3,2,1,6).equals("not edge"));
          System.out.println("test43: " + checkEdge(3,2,2,1).equals("edge"));
          System.out.println("test44: " + checkEdge(3,2,2,3).equals("edge"));
          System.out.println("test45: " + checkEdge(3,2,2,4).equals("not edge"));
          System.out.println("test46: " + checkEdge(3,2,2,5).equals("edge"));
          System.out.println("test47: " + checkEdge(3,2,2,6).equals("not edge"));
          System.out.println("test48: " + checkEdge(3,2,3,4).equals("not edge"));
          System.out.println("test49: " + checkEdge(3,2,3,5).equals("not edge"));
          System.out.println("test50: " + checkEdge(3,2,3,6).equals("edge"));
          System.out.println("test51: " + checkEdge(3,2,4,5).equals("edge"));
          System.out.println("test52: " + checkEdge(3,2,4,6).equals("not edge"));
          System.out.println("test53: " + checkEdge(2,3,5,6).equals("edge"));
      
        }
      
      }