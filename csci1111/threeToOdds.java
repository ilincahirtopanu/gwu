import java.util.Arrays;

public class threeToOdds{

  public static int[] addToOdds(int[] original){
    int [] result = new int[5];
    for (int i = 0; i < original.length; i++){
        if (original[i] % 2 == 1){
            result[i] = original[i] + 3;
        }
        else {
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
      System.out.println("test1: " + Arrays.equals(cleanResult(addToOdds(arr1)), result1));
      int [] arr2 = {1};
      int [] result2 = {4};
      System.out.println("test2: " + Arrays.equals(cleanResult(addToOdds(arr2)), result2));
      int [] arr3 = {1, 3};
      int [] result3 = {4, 6};
      System.out.println("test3: " + Arrays.equals(cleanResult(addToOdds(arr3)), result3));
      int [] arr4 = {2, 1, 3, 4};
      int [] result4 = {2, 4, 6, 4};
      System.out.println("test4: " + Arrays.equals(cleanResult(addToOdds(arr4)), result4));
      int [] arr5 = {2, 2, 4, 4};
      int [] result5 = {2, 2, 4, 4};
      System.out.println("test5: " + Arrays.equals(cleanResult(addToOdds(arr5)), result5));
      int [] arr6 = {2};
      int [] result6 = {2};
      System.out.println("test6: " + Arrays.equals(cleanResult(addToOdds(arr6)), result6));

  }

}