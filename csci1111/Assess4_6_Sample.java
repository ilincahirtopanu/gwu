import java.util.Arrays;

public class Assess4_6_Sample{

  public static int[] flatten(int[][] arr){
    int total = 0;
    for (int i = 0; i < arr.length; i++) { //to tell how long to make the 1d array
        for (int j = 0; j < arr[i].length; j++) {
            total ++;
        }
    }
    int[] result = new int [total];
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
                result[count] = arr[i][j];
                count++;
            }
        }
    return result;
  }

  public static int[] cleanResult(int[] array){
    return Arrays.stream(array).filter(num -> num != 0).toArray();    
  }

  public static void main(String[] args){

    int [][] arr1 = {{}};
    int [] result1 = {};
    System.out.println("test1: " + Arrays.equals(cleanResult(flatten(arr1)), result1));
    int [][] arr2 = {{1}};
    int [] result2 = {1};
    System.out.println("test2: " + Arrays.equals(cleanResult(flatten(arr2)), result2));
    int [][] arr3 = {{1, 2}};
    int [] result3 = {1, 2};
    System.out.println("test3: " + Arrays.equals(cleanResult(flatten(arr3)), result3));
    int [][] arr4 = {{4, 6}, {1, 2}};
    int [] result4 = {4, 6, 1, 2};
    System.out.println("test4: " + Arrays.equals(cleanResult(flatten(arr4)), result4));
    int [][] arr5 = {{4, 6}, {1, 2, 3}};
    int [] result5 = {4, 6, 1, 2, 3};
    System.out.println("test5: " + Arrays.equals(cleanResult(flatten(arr5)), result5));
    int [][] arr6 = {{4, 6}, {1, 2, 3}, {4}};
    int [] result6 = {4, 6, 1, 2, 3, 4};
    System.out.println("test6: " + Arrays.equals(cleanResult(flatten(arr6)), result6));
    int [][] arr7 = {{4, 6}, {}, {1, 2, 3}, {4}};
    int [] result7 = {4, 6, 1, 2, 3, 4};
    System.out.println("test7: " + Arrays.equals(cleanResult(flatten(arr7)), result7));
    int [][] arr8 = {{}, {4, 6}, {}, {1, 2, 3}, {4}};
    int [] result8 = {4, 6, 1, 2, 3, 4};
    System.out.println("test8: " + Arrays.equals(cleanResult(flatten(arr8)), result8));
  }

}