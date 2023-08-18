public class sumofLRUD{

  public static int plusSign(int width, int height, int tile){
    int result = 0;
    int row = (tile - 1) / width;
    int col = (tile - 1) % width;
    int tileL = tile - 1; 
    int tileR = tile + 1;
    int tileU = tile - width;
    int tileD = tile + width;
    if (row == 0){
        tileU = 0;
    } 
    if (row == height - 1){
        tileD = 0;
    } 
    if (col == 0) {
        
        tileL = 0;
    } 
    if (col == width - 1) {
        tileR = 0;
    }
    result = tileL+tileR+tileU+tileD;
    return result;
  }

  public static void main(String[] args){
    System.out.println("test1: " + (plusSign(1,1,1) == 0));
    System.out.println("test2: " + (plusSign(2,1,1) == 2));
    System.out.println("test3: " + (plusSign(2,1,2) == 1));
    System.out.println("test4: " + (plusSign(1,2,1) == 2));
    System.out.println("test5: " + (plusSign(1,2,2) == 1));
    System.out.println("test6: " + (plusSign(1,3,1) == 2));
    System.out.println("test7: " + (plusSign(1,3,2) == 4));
    System.out.println("test8: " + (plusSign(1,3,3) == 2));
    System.out.println("test9: " + (plusSign(3,1,1) == 2));
    System.out.println("test10: " + (plusSign(3,1,2) == 4));
    System.out.println("test11: " + (plusSign(3,1,3) == 2));
    System.out.println("test12: " + (plusSign(2,3,1) == 5));
    System.out.println("test13: " + (plusSign(2,3,2) == 5));
    System.out.println("test14: " + (plusSign(2,3,3) == 10));
    System.out.println("test15: " + (plusSign(2,3,4) == 11));
    System.out.println("test16: " + (plusSign(2,3,5) == 9));
    System.out.println("test17: " + (plusSign(3,2,1) == 6));
    System.out.println("test18: " + (plusSign(3,2,2) == 9));
    System.out.println("test19: " + (plusSign(3,2,3) == 8));
    System.out.println("test20: " + (plusSign(3,2,4) == 6));
    System.out.println("test21: " + (plusSign(3,2,5) == 12));
    System.out.println("test22: " + (plusSign(3,2,6) == 8));
    System.out.println("test23: " + (plusSign(3,3,1) == 6));
    System.out.println("test24: " + (plusSign(3,3,2) == 9));
    System.out.println("test25: " + (plusSign(3,3,3) == 8));
    System.out.println("test26: " + (plusSign(3,3,4) == 13));
    System.out.println("test27: " + (plusSign(3,3,5) == 20));
    System.out.println("test28: " + (plusSign(3,3,6) == 17));
    System.out.println("test29: " + (plusSign(3,3,7) == 12));
    System.out.println("test30: " + (plusSign(3,3,8) == 21));
    System.out.println("test31: " + (plusSign(3,3,9) == 14));
    System.out.println("test32: " + (plusSign(5,5,2) == 11));
    System.out.println("test33: " + (plusSign(5,5,19) == 76));
    System.out.println("test34: " + (plusSign(5,5,13) == 52));
    System.out.println("test35: " + (plusSign(5,5,25) == 44));

  }

}