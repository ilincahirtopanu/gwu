import java.util.Arrays;

public class Assess4_10_Sample{ //10

  public static int product(int[][] arr1, int[][] arr2){
    int ans = 0;

    for(int row = 0; row < arr2.length; row++){
        for(int col= 00; col < arr1[0].length; col++){
            if(row == col){
                ans += arr1[0][col] * arr2[row][0];
            }
        }
    }
    return ans; 

  }

  public static void main(String[] args){

    int [][] arr1a = {{}};
    int [][] arr1b = {{}};
    int result1 = 0;
    System.out.println("test1: " + (product(arr1a, arr1b) == result1));
    int [][] arr2a = {{3}};
    int [][] arr2b = {{2}};
    int result2 = 6;
    System.out.println("test2: " + (product(arr2a, arr2b) == result2));
    int [][] arr3a = {{3, 1}};
    int [][] arr3b = {{2}, {2}};
    int  result3 = 8;
    System.out.println("test3: " + (product(arr3a, arr3b) == result3));
    int [][] arr4a = {{3, 1, 2}};
    int [][] arr4b = {{2}, {1}, {5}};
    int result4 = 17;
    System.out.println("test4: " + (product(arr4a, arr4b) == result4));
    int [][] arr5a = {{3, 1, 2, 1, 2}};
    int [][] arr5b = {{2}, {1}, {5}, {2}, {3}};
    int result5 = 25;
    System.out.println("test5: " + (product(arr5a, arr5b) == result5));
  }

}