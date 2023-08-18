import java.util.Arrays;

public class sumOfLists{

  public static int[] sumLists(int[] arr1, int[] arr2){
    int [] result = new int[100];
     int [] longer = arr1;
     int [] shorter = arr2;
     if (arr2.length > arr1.length) {
        longer = arr2;
        shorter = arr1;
     }
     int i = 0;
     
     while (i < shorter.length) {
        result[i] = arr1[i] + arr2[i];
        i++;
     }
     while (i < longer.length) {
        result[i] = longer[i];
        i++;
     }
     
    return result;
  }

  public static int[] cleanResult(int[] array){
    return Arrays.stream(array).filter(num -> num != 0).toArray();    
  }

  public static void main(String[] args){
      int [] arr1a = {};
      int [] arr1b = {};
      int [] result1 = {};
      System.out.println("test1: " + Arrays.equals(cleanResult(sumLists(arr1a, arr1b)), result1));
      int [] arr2a = {1};
      int [] arr2b = {1};
      int [] result2 = {2};
      System.out.println("test2: " + Arrays.equals(cleanResult(sumLists(arr2a, arr2b)), result2));
      int [] arr3a = {1};
      int [] arr3b = {};
      int [] result3 = {1};
      System.out.println("test3: " + Arrays.equals(cleanResult(sumLists(arr3a, arr3b)), result3));
      int [] arr4a = {};
      int [] arr4b = {2};
      int [] result4 = {2};
      System.out.println("test4: " + Arrays.equals(cleanResult(sumLists(arr4a, arr4b)), result4));
      int [] arr5a = {2,7,3,1,9,5,5,4,6,8};
      int [] arr5b = {3, 2, 1};
      int [] result5 = {5, 9, 4, 1, 9, 5, 5, 4, 6, 8};
      System.out.println("test5: " + Arrays.equals(cleanResult(sumLists(arr5a, arr5b)), result5));
      System.out.println("test6: " + Arrays.equals(cleanResult(sumLists(arr5a, arr5b)), result5));
      System.out.println("test7: " + Arrays.equals(cleanResult(sumLists(arr5a, arr5b)), result5));
      System.out.println("test8: " + Arrays.equals(cleanResult(sumLists(arr5a, arr5b)), result5));
      System.out.println("test9: " + Arrays.equals(cleanResult(sumLists(arr5a, arr5b)), result5));

  }

}