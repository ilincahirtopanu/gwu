import java.util.Arrays;

public class Assess4_3_Sample{

  public static boolean checkSum(int[][] arr){
    for (int row = 0; row < arr.length - 1; row++) {
        for (int col = 0; col < arr[0].length; col++) {
            if (arr[row][col] + arr[row + 1][col] == 10) {
                return true;
            }
        }
    }
    return false;
  }

  public static void main(String[] args){

    int [][] arr1 = {{1, 2}};
    System.out.println("test1: " + (checkSum(arr1) == false));
    int [][] arr2 = {{5}, {5}};
    System.out.println("test2: " + (checkSum(arr2) == true));
    int [][] arr3 = {{1,2,3}, {1,2,3}, {1,2,7}};
    System.out.println("test3: " + (checkSum(arr3) == true));
    int [][] arr4 = {{1,2,3}, {1,2,3}, {1,2,3}, {9,1,1}};
    System.out.println("test4: " + (checkSum(arr4) == true));
    int [][] arr5 = {{1,2,3}, {1,2,3}, {1,2,3}, {7,1,1}};
    System.out.println("test5: " + (checkSum(arr5) == false));
  }

}