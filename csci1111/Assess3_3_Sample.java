import java.util.Arrays;

public class Assess3_3_Sample{

  public static int[] addThree(int[] original){
    int [] result = new int[10];
    int pos = 0;
    for (int i = 0; i < original.length; i++){
        result[pos] = original[i];
        if (original[i] == 3){
            pos++;
            result[pos] = 3;
        }
        pos++;
    }
    return result;
  }

  public static int[] cleanResult(int[] array){
    return Arrays.stream(array).filter(num -> num != 0).toArray();    
  }
  public static void main(String[] args){
      int [] arr1 = {};
      int [] result1 = {};
      System.out.println("test1: " + Arrays.equals(cleanResult(addThree(arr1)), result1));
      int [] arr2 = {1};
      int [] result2 = {1};
      System.out.println("test2: " + Arrays.equals(cleanResult(addThree(arr2)), result2));
      int [] arr3 = {1, 3};
      int [] result3 = {1, 3, 3};
      System.out.println("test3: " + Arrays.equals(cleanResult(addThree(arr3)), result3));
      int [] arr4 = {2, 1, 3, 4};
      int [] result4 = {2, 1, 3, 3, 4};
      System.out.println("test4: " + Arrays.equals(cleanResult(addThree(arr4)), result4));
      int [] arr5 = {1, 2, 3, 3};
      int [] result5 = {1, 2, 3, 3, 3, 3};
      System.out.println("test5: " + Arrays.equals(cleanResult(addThree(arr5)), result5));
      int [] arr6 = {4,5,3,3,6,5,3};
      int [] result6 = {4, 5, 3, 3, 3, 3, 6, 5, 3, 3};
      System.out.println("test6: " + Arrays.equals(cleanResult(addThree(arr6)), result6));

  }

}