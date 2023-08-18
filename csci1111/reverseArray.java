import java.util.Arrays;

public class reverseArray{

  public static int[] reverse(int[] original){
    int [] result = new int [original.length];
    for (int i = 0; i < original.length; i++){
        result[i] = original[original.length - 1 - i];
    }
    return result;
  }

  public static void main(String[] args){
      int [] arr1 = {};
      int [] result1 = {};
      System.out.println("test1: " + Arrays.equals(reverse(arr1), result1));
      int [] arr2 = {1};
      int [] result2 = {1};
      System.out.println("test2: " + Arrays.equals(reverse(arr2), result2));
      int [] arr3 = {1, 2};
      int [] result3 = {2, 1};
      System.out.println("test3: " + Arrays.equals(reverse(arr3), result3));
      int [] arr4 = {2, 1};
      int [] result4 = {1, 2};
      System.out.println("test4: " + Arrays.equals(reverse(arr4), result4));
      int [] arr5 = {1, 2, 3};
      int [] result5 = {3, 2, 1};
      System.out.println("test5: " + Arrays.equals(reverse(arr5), result5));
      int [] arr6 = {1,2,3,4,4,3,2,1,1,2,3,4};
      int [] result6 = {4, 3, 2, 1, 1, 2, 3, 4, 4, 3, 2, 1};
      System.out.println("test6: " + Arrays.equals(reverse(arr6), result6));

  }

}