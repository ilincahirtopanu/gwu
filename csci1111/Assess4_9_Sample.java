import java.util.Arrays;

public class Assess4_9_Sample{ //9

  public static int[][] multGrid(int[][] arr1, int[][] arr2){
    int [][] ans = new int [arr1.length][];

    for(int row = 0; row < arr1.length; row++){
        ans[row] = new int [arr1[row].length];
        
        for(int col = 0; col < arr1[row].length; col++){
            ans[row][col] = arr1[row][col] * arr2[row][col];
        }
    }
    

    return ans;
  }

  public static void main(String[] args){

    int [][] arr1a = {{}};
    int [][] arr1b = {{}};
    int [][] result1 = {{}};
    System.out.println("test1: " + Arrays.deepEquals(multGrid(arr1a, arr1b), result1));
    int [][] arr2a = {{3}};
    int [][] arr2b = {{2}};
    int [][] result2 = {{6}};
    System.out.println("test2: " + Arrays.deepEquals(multGrid(arr2a, arr2b), result2));
    int [][] arr3a = {{3, 1}};
    int [][] arr3b = {{2, 1}};
    int [][] result3 = {{6, 1}};
    System.out.println("test3: " + Arrays.deepEquals(multGrid(arr3a, arr3b), result3));
    int [][] arr4a = {{3, 1}, {2}};
    int [][] arr4b = {{2, 1}, {5}};
    int [][] result4 = {{6, 1}, {10}};
    System.out.println("test4: " + Arrays.deepEquals(multGrid(arr4a, arr4b), result4));
    int [][] arr5a = {{3, 1}, {2}, {}, {1, 2}};
    int [][] arr5b = {{2, 1}, {5}, {}, {3, 4}};
    int [][] result5 = {{6, 1}, {10}, {}, {3, 8}};
    System.out.println("test5: " + Arrays.deepEquals(multGrid(arr5a, arr5b), result5));
  }

}