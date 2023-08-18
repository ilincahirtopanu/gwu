import java.util.Arrays;

public class Assess4_7_Sample{

  public static int[] averageRow(int[][] arr){
    int rows = 0;
    for (int i = 0; i < arr.length; i++) { //to tell how long to make the 1d array
        rows++;
    }
    int[] result = new int[rows];
    int count = 0;
    int colTotal = 0;
    int colAverage = 0;
    for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            colTotal += arr[row][col];
        }
        if (arr[row].length != 0) {
            colAverage = colTotal / arr[row].length;
        } else {
            colAverage = colTotal;
        }
        result[count] = colAverage;
        count++;
        colTotal = 0;
        colAverage = 0;
    }
    return result;
  }

  public static void main(String[] args){

    int [][] arr1 = {{}};
    int [] result1 = {0};
    System.out.println("test1: " + Arrays.equals(averageRow(arr1), result1));
    int [][] arr2 = {{1}};
    int [] result2 = {1};
    System.out.println("test2: " + Arrays.equals(averageRow(arr2), result2));
    int [][] arr3 = {{1, 3}};
    int [] result3 = {2};
    System.out.println("test3: " + Arrays.equals(averageRow(arr3), result3));
    int [][] arr4 = {{4, 6}, {1, 3}};
    int [] result4 = {5, 2};
    System.out.println("test4: " + Arrays.equals(averageRow(arr4), result4));
    int [][] arr5 = {{4, 6}, {1, 2, 3}};
    int [] result5 = {5, 2};
    System.out.println("test5: " + Arrays.equals(averageRow(arr5), result5));
    int [][] arr6 = {{4, 6}, {1, 2, 3}, {4}};
    int [] result6 = {5, 2, 4};
    System.out.println("test6: " + Arrays.equals(averageRow(arr6), result6));
    int [][] arr7 = {{4, 6}, {}, {1, 2, 3}, {4}};
    int [] result7 = {5, 0, 2, 4};
    System.out.println("test7: " + Arrays.equals(averageRow(arr7), result7));
    int [][] arr8 = {{4, 6}, {}, {1, 2, 3}, {4, 2}};
    int [] result8 = {5, 0, 2, 3};
    System.out.println("test8: " + Arrays.equals(averageRow(arr8), result8));
  }

}