import java.util.Arrays;

public class test{

  public static int[] removeThird(int[] original){
    int [] result = new int[10];
     int pos = 0;
     for (int i = 1; i <= original.length; i++) {
        if (i % 3 != 0) {
           result[pos] = original[i - 1];
           pos++;
        }
     }
           

    return result;
  }

  public static int[] cleanResult(int[] array){
    return Arrays.stream(array).filter(num -> num != 0).toArray();    
  }

  public static void main(String[] args){
      int [] arr1 = {};
      int [] result1 = {};
      System.out.println("test1: " + Arrays.equals(cleanResult(removeThird(arr1)), result1));
      int [] arr2 = {1};
      int [] result2 = {1};
      System.out.println("test2: " + Arrays.equals(cleanResult(removeThird(arr2)), result2));
      int [] arr3 = {1, 2};
      int [] result3 = {1, 2};
      System.out.println("test3: " + Arrays.equals(cleanResult(removeThird(arr3)), result3));
      int [] arr4 = {2, 1, 3};
      int [] result4 = {2, 1};
      System.out.println("test4: " + Arrays.equals(cleanResult(removeThird(arr4)), result4));
      int [] arr5 = {1, 2, 3, 4};
      int [] result5 = {1, 2, 4};
      System.out.println("test5: " + Arrays.equals(cleanResult(removeThird(arr5)), result5));
      int [] arr6 = {1, 2, 3, 4, 5, 6};
      int [] result6 = {1, 2, 4, 5};
      System.out.println("test6: " + Arrays.equals(cleanResult(removeThird(arr6)), result6));
      int [] arr7 = {1, 2, 3, 4, 5, 6, 7};
      int [] result7 = {1, 2, 4, 5, 7};
      System.out.println("test7: " + Arrays.equals(cleanResult(removeThird(arr7)), result7));

  }

}