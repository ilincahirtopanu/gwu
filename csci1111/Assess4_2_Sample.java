import java.util.Arrays;

public class Assess4_2_Sample{

  public static int[] min(int[][] arr){
    int [] result = new int[2];
    int smallest = 999999;
    int smallest2 = 999998;
    if (arr.length > 1) { 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] < smallest) {
                    smallest2 = smallest;
                    smallest = arr[i][j];
                }
            }
        }
    } else {
        for (int i = 0; i < arr[0].length; i++){
            if (arr[0][i] < smallest) {
                smallest2 = smallest;
                smallest = arr[0][i];
            } else if (arr[0][i] < smallest2) {
               smallest2 = arr[0][i];
            }
        }
    }
    result[0] = smallest;
    result[1] = smallest2;
    return result;
  }

  public static void main(String[] args){

    int [][] arr1 = {{1, 2}};
    int [] result1 = {1, 2};
    System.out.println("test1: " + Arrays.equals(min(arr1), result1));
    int [][] arr2 = {{3, 1, 2}};
    int [] result2 = {1, 2};
    System.out.println("test2: " + Arrays.equals(min(arr2), result2));
    int [][] arr3 = {{3,1,2},{4,5,0,7}};
    int [] result3 = {0, 1};
    System.out.println("test2: " + Arrays.equals(min(arr3), result3));
    int [][] arr4 = {{3,1,2}, {4,5,0,7}, {-1}};
    int [] result4 = {-1, 0};
    System.out.println("test4: " + Arrays.equals(min(arr4), result4));
  }

}