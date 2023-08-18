public class mirrorTile{

    public static String makeMirror(int width, int height, int tile){
    
    int row = (tile - 1) / width;
    int col = (tile - 1) % width;
    int row2 = height - (row + 1);//going backwards
    int tile2 = (row2 * width) + 1 + col; 
    //(row2 * width) = the amount of tiles in the rows before
    //+ col is the amount of tiles in THAT row the tile is before
    //+1 is to move to that tiel
    return "" + tile2;
    
    }
    
    
    
    public static void main(String[] args){
        System.out.println("test1: " + makeMirror(1,1,1).equals("1"));
        System.out.println("test2: " + makeMirror(1,2,1).equals("2"));
        System.out.println("test3: " + makeMirror(1,2,2).equals("1"));
        System.out.println("test4: " + makeMirror(2,1,1).equals("1"));
        System.out.println("test5: " + makeMirror(2,1,2).equals("2"));
        System.out.println("test6: " + makeMirror(2,2,1).equals("3"));
        System.out.println("test7: " + makeMirror(2,2,2).equals("4"));
        System.out.println("test8: " + makeMirror(2,2,3).equals("1"));
        System.out.println("test9: " + makeMirror(2,2,4).equals("2"));
        System.out.println("test10: " + makeMirror(2,3,1).equals("5"));
        System.out.println("test11: " + makeMirror(2,3,2).equals("6"));
        System.out.println("test12: " + makeMirror(2,3,3).equals("3"));
        System.out.println("test13: " + makeMirror(2,3,4).equals("4"));
        System.out.println("test14: " + makeMirror(2,3,5).equals("1"));
        System.out.println("test15: " + makeMirror(2,3,6).equals("2"));
        System.out.println("test16: " + makeMirror(3,2,1).equals("4"));
        System.out.println("test17: " + makeMirror(3,2,2).equals("5"));
        System.out.println("test18: " + makeMirror(3,2,3).equals("6"));
        System.out.println("test19: " + makeMirror(3,2,4).equals("1"));
        System.out.println("test20: " + makeMirror(3,2,5).equals("2"));
        System.out.println("test21: " + makeMirror(3,2,6).equals("3"));
        System.out.println("test22: " + makeMirror(3,3,1).equals("7"));
        System.out.println("test23: " + makeMirror(3,3,2).equals("8"));
        System.out.println("test24: " + makeMirror(3,3,3).equals("9"));
        System.out.println("test25: " + makeMirror(3,3,4).equals("4"));
        System.out.println("test26: " + makeMirror(3,3,5).equals("5"));
        System.out.println("test27: " + makeMirror(3,3,6).equals("6"));
        System.out.println("test28: " + makeMirror(3,3,7).equals("1"));
        System.out.println("test29: " + makeMirror(3,3,8).equals("2"));
        System.out.println("test30: " + makeMirror(3,3,9).equals("3"));
        System.out.println("test31: " + makeMirror(7,10,23).equals("44"));
        System.out.println("test32: " + makeMirror(7,10,44).equals("23"));
      }
    
    }