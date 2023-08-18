//public class Quiz8{

    //top left
    //tile - widhth -1
    //conditional
    //if (col >0 && row > 1)

    //top right
    //tile - width +1
    //conditional
    //if (row >0 && col > width -1)
    
    //bottom left
    //tile + width -1
    //conditional
    //if (row<height-1 && col > 0)

    //bottom right
    //tile + width +1
    //conditional
    //if (row <height -1 && col < width-1)
//}
public class Quiz8{

    public static int plusSignDiagonal(int width, int height, int tile){

        int result = 0;
        int row = (tile-1) /width;
        int col = (tile-1) % width;

        if(col > 0 && row > 0){
            result += tile - width -1;
        }
        if(row > 0 && col < width-1){
            result += tile - width+1;
        }
        if(row < height -1 && col > 0){
            result +=  tile + width -1;
        }
        if(row < height -1 && col < width -1){
            result += tile + width +1;
        }
        System.out.println(result);
        return result;


    }
    public static void main(String[] args){
        System.out.println("test1: " + (plusSignDiagonal(1,1,1) == 0));
        System.out.println("test2: " + (plusSignDiagonal(2,1,1) == 0));
        System.out.println("test3: " + (plusSignDiagonal(2,1,2) == 0));
        System.out.println("test4: " + (plusSignDiagonal(1,2,1) == 0));
        System.out.println("test5: " + (plusSignDiagonal(1,2,2) == 0));
        System.out.println("test6: " + (plusSignDiagonal(1,3,1) == 0));
        System.out.println("test7: " + (plusSignDiagonal(1,3,2) == 0));
        System.out.println("test8: " + (plusSignDiagonal(1,3,3) == 0));
        System.out.println("test9: " + (plusSignDiagonal(3,1,1) == 0));
        System.out.println("test10: " + (plusSignDiagonal(3,1,2) == 0));
        System.out.println("test11: " + (plusSignDiagonal(3,1,3) == 0));
        System.out.println("test12: " + (plusSignDiagonal(2,3,1) == 4));
        System.out.println("test13: " + (plusSignDiagonal(2,3,2) == 3));
        System.out.println("test14: " + (plusSignDiagonal(2,3,3) == 8));
        System.out.println("test15: " + (plusSignDiagonal(2,3,4) == 6));
        System.out.println("test16: " + (plusSignDiagonal(2,3,5) == 4));
        System.out.println("test17: " + (plusSignDiagonal(3,2,1) == 5));
        System.out.println("test18: " + (plusSignDiagonal(3,2,2) == 10));
        System.out.println("test19: " + (plusSignDiagonal(3,2,3) == 5));
        System.out.println("test20: " + (plusSignDiagonal(3,2,4) == 2));
        System.out.println("test21: " + (plusSignDiagonal(3,2,5) == 4));
        System.out.println("test22: " + (plusSignDiagonal(3,2,6) == 2));
        System.out.println("test23: " + (plusSignDiagonal(3,3,1) == 5));
        System.out.println("test24: " + (plusSignDiagonal(3,3,2) == 10));
        System.out.println("test25: " + (plusSignDiagonal(3,3,3) == 5));
        System.out.println("test26: " + (plusSignDiagonal(3,3,4) == 10));
        System.out.println("test27: " + (plusSignDiagonal(3,3,5) == 20));
        System.out.println("test28: " + (plusSignDiagonal(3,3,6) == 10));
        System.out.println("test29: " + (plusSignDiagonal(3,3,7) == 5));
        System.out.println("test30: " + (plusSignDiagonal(3,3,8) == 10));
        System.out.println("test31: " + (plusSignDiagonal(3,3,9) == 5));
        System.out.println("test32: " + (plusSignDiagonal(5,5,2) == 14));
        System.out.println("test33: " + (plusSignDiagonal(5,5,19) == 76));
        System.out.println("test34: " + (plusSignDiagonal(5,5,13) == 52));
        System.out.println("test35: " + (plusSignDiagonal(5,5,25) == 19));
    
      }

}