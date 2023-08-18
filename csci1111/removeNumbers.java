import java.util.Arrays;

public class removeNumbers{

  public static int[] remove(int[] original, int element){
    int [] result = new int[15];
    for (int i = 0; i < original.length; i++){
        if (original[i] != element){
            result[i] = original[i];
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
      System.out.println("test1: " + Arrays.equals(cleanResult(remove(arr1, 1)), result1));
      int [] arr2 = {1};
      int [] result2 = {};
      System.out.println("test2: " + Arrays.equals(cleanResult(remove(arr2, 1)), result2));
      int [] arr3 = {1, 2};
      int [] result3 = {2};
      System.out.println("test3: " + Arrays.equals(cleanResult(remove(arr3, 1)), result3));
      int [] arr4 = {2, 1};
      int [] result4 = {2};
      System.out.println("test4: " + Arrays.equals(cleanResult(remove(arr4, 1)), result4));
      int [] arr5 = {1, 2, 3};
      int [] result5 = {1, 3};
      System.out.println("test5: " + Arrays.equals(cleanResult(remove(arr5, 2)), result5));
      int [] arr6 = {1,2,3,4,4,3,2,1,1,2,3,4};
      int [] result6 = {1, 3, 4, 4, 3, 1, 1, 3, 4};
      System.out.println("test6: " + Arrays.equals(cleanResult(remove(arr6, 2)), result6));

  }

}
