/*
            SAMPLE ASSESSMENT2_10
*/

public class inCorner{

    public static String adjacentCorner(int width, int height, int tile){
    String result = "";
        int row = (tile - 1) / width;
        int col = (tile - 1) % width;
        if (col == 0 && (row == 1 || row == height - 2)){ //complete first column
            result = "adjacent";
        } else if (col == width - 1 && (row == 1 || row == height - 2)){ //complete last column
            result = "adjacent";
        }
       else if (col == 1 && (row == 0 || row == 1 || row == height - 1 || row == height - 2)){//second column
            result = "adjacent";
        } 
        else if (col == width - 2 && (row == 0 || row == 1 || row == height - 1 || row == height - 2)){//second to last column
            result = "adjacent";
        }
        else if ((col == 0 && row == 0) || (col == width - 1 && row == height - 1)
                || (col == 0 && row == height - 1) || (col == width - 1 && row == 0)){//corners
            result = "adjacent";
        } else {
            result = "not adjacent";
        }
        return result;
        }
  
    public static void main(String[] args){
      System.out.println("test1: " + adjacentCorner(1,1,1).equals("adjacent"));
      System.out.println("test10: " + adjacentCorner(3,1,2).equals("adjacent"));
      System.out.println("test11: " + adjacentCorner(3,1,3).equals("adjacent"));
      System.out.println("test12: " + adjacentCorner(2,3,1).equals("adjacent"));
      System.out.println("test13: " + adjacentCorner(2,3,2).equals("adjacent"));
      System.out.println("test14: " + adjacentCorner(2,3,3).equals("adjacent"));
      System.out.println("test15: " + adjacentCorner(2,3,4).equals("adjacent"));
      System.out.println("test16: " + adjacentCorner(2,3,5).equals("adjacent"));
      System.out.println("test17: " + adjacentCorner(3,2,1).equals("adjacent"));
      System.out.println("test18: " + adjacentCorner(3,2,2).equals("adjacent"));
      System.out.println("test19: " + adjacentCorner(3,2,3).equals("adjacent"));
      System.out.println("test20: " + adjacentCorner(3,2,4).equals("adjacent"));
      System.out.println("test21: " + adjacentCorner(3,2,5).equals("adjacent"));
      System.out.println("test22: " + adjacentCorner(3,2,6).equals("adjacent"));
      System.out.println("test23: " + adjacentCorner(3,3,1).equals("adjacent"));
      System.out.println("test24: " + adjacentCorner(3,3,2).equals("adjacent"));
      System.out.println("test25: " + adjacentCorner(3,3,3).equals("adjacent"));
      System.out.println("test26: " + adjacentCorner(3,3,4).equals("adjacent"));
      System.out.println("test27: " + adjacentCorner(3,3,5).equals("adjacent"));
      System.out.println("test28: " + adjacentCorner(3,3,6).equals("adjacent"));
      System.out.println("test29: " + adjacentCorner(3,3,7).equals("adjacent"));
      System.out.println("test30: " + adjacentCorner(3,3,8).equals("adjacent"));
      System.out.println("test31: " + adjacentCorner(3,3,9).equals("adjacent"));
      System.out.println("test32: " + adjacentCorner(5,5,2).equals("adjacent"));
      System.out.println("test33: " + adjacentCorner(5,5,3).equals("not adjacent"));
      System.out.println("test34: " + adjacentCorner(5,5,4).equals("adjacent"));
      System.out.println("test35: " + adjacentCorner(5,5,7).equals("adjacent"));
      System.out.println("test36: " + adjacentCorner(5,5,9).equals("adjacent"));
      System.out.println("test37: " + adjacentCorner(5,5,11).equals("not adjacent"));
      System.out.println("test38: " + adjacentCorner(5,5,15).equals("not adjacent"));
      System.out.println("test39: " + adjacentCorner(5,5,19).equals("adjacent"));
      System.out.println("test40: " + adjacentCorner(5,5,13).equals("not adjacent"));
      System.out.println("test41: " + adjacentCorner(5,5,25).equals("adjacent"));
      System.out.println("test42: " + adjacentCorner(5,5,8).equals("not adjacent"));
      System.out.println("test43: " + adjacentCorner(5,5,12).equals("not adjacent"));
      System.out.println("test44: " + adjacentCorner(5,5,18).equals("not adjacent"));
      System.out.println("test45: " + adjacentCorner(5,5,23).equals("not adjacent"));
    }
  
  }