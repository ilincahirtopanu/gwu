import java.util.Arrays;

public class addPairs{

  public static int[] zip(int[] original){
    int [] result = new int[10];
    int pos = 0;
    for (int i = 0; i < original.length; i++){
        if (i % 2 == 1){//if it's the second value in a pair
            result[pos] += original[i];
            pos++;//moves the position over to the next pair sum
        }
        else {
            result[pos] = original[i];
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
      System.out.println("test1: " + Arrays.equals(cleanResult(zip(arr1)), result1));
      int [] arr2 = {1};
      int [] result2 = {1};
      System.out.println("test2: " + Arrays.equals(cleanResult(zip(arr2)), result2));
      int [] arr3 = {1, 3};
      int [] result3 = {4};
      System.out.println("test3: " + Arrays.equals(cleanResult(zip(arr3)), result3));
      int [] arr4 = {2, 1, 3, 4};
      int [] result4 = {3, 7};
      System.out.println("test4: " + Arrays.equals(cleanResult(zip(arr4)), result4));
      int [] arr5 = {2,1,3,4,5};
      int [] result5 = {3, 7, 5};
      System.out.println("test5: " + Arrays.equals(cleanResult(zip(arr5)), result5));
      int [] arr6 = {2,1,3,4,5,1};
      int [] result6 = {3, 7, 6};
      System.out.println("test6: " + Arrays.equals(cleanResult(zip(arr6)), result6));

  }

}