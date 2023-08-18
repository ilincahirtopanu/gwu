import java.util.Arrays;

public class Assess4_12_Sample{ //12

  public static int[] sort(int[] arr){
    int temp = 0;
    for(int row = 0; row < arr.length; row++){
      for(int col = row + 1; col < arr.length; col++){
        if (arr[row] >= arr[col]){
          temp = arr[col];
          arr[col] = arr[row];
          arr[row] = temp;
        }
      }
    }
    
    return arr;
  }

  public static void main(String[] args){

    int [] arr1 = {};
    int [] result1 = {};
    System.out.println("test1: " + Arrays.equals(sort(arr1), result1));
    int [] arr2 = {1};
    int [] result2 = {1};
    System.out.println("test2: " + Arrays.equals(sort(arr2), result2));
    int [] arr3 = {1, 2};
    int [] result3 = {1, 2};
    System.out.println("test2: " + Arrays.equals(sort(arr3), result3));
    int [] arr4 = {2, 1};
    int [] result4 = {1, 2};
    System.out.println("test4: " + Arrays.equals(sort(arr4), result4));
    int [] arr5 = {1, 2, 3};
    int [] result5 = {1, 2, 3};
    System.out.println("test5: " + Arrays.equals(sort(arr5), result5));
    int [] arr6 = {1, 3, 2};
    int [] result6 = {1, 2, 3};
    System.out.println("test6: " + Arrays.equals(sort(arr6), result6));
    int [] arr7 = {2, 1, 3};
    int [] result7 = {1, 2, 3};
    System.out.println("test7: " + Arrays.equals(sort(arr7), result7));
    int [] arr8 = {1, 2, 3, 4};
    int [] result8 = {1, 2, 3, 4};
    System.out.println("test8: " + Arrays.equals(sort(arr8), result8));
    int [] arr9 = {1, 3, 2, 4};
    int [] result9 = {1, 2, 3, 4};
    System.out.println("test9: " + Arrays.equals(sort(arr9), result9));
    int [] arr10 = {4, 3, 2, 1};
    int [] result10 = {1, 2, 3, 4};
    System.out.println("test10: " + Arrays.equals(sort(arr10), result10));
  }

}