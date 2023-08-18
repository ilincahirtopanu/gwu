import java.util.Arrays;

public class test{

  public static int[] merge(int[] arr1, int[] arr2){
    int [] result = new int[10];
     int [] longer;
     int [] shorter;
     if (arr1.length < arr2.length) {
        shorter = arr1;
        longer = arr2;
     }
     else {
        shorter = arr2;
        longer = arr1;
     }
     /*int i = 0;
     while (i < shorter.length) {
        result[i] = arr1[i];
        i++;
        result[i] = arr2[i];
        i++;
     }
     while (i < longer.length) {
        result[i] = longer[i];
        i++;
     }*/
     int pos = 0;
     int i = 0;
     while (i < shorter.length){
        result[pos] = arr1[i];
        pos++;
        result[pos] = arr2[i];
        pos++;
        i++;
     }
     while (i < longer.length) {
        result[pos] = longer[i];
        pos++;
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
      System.out.println("test1: " + Arrays.equals(cleanResult(merge(arr1a, arr1b)), result1));
      int [] arr2a = {1};
      int [] arr2b = {};
      int [] result2 = {1};
      System.out.println("test2: " + Arrays.equals(cleanResult(merge(arr2a, arr2b)), result2));
      int [] arr3a = {1, 3};
      int [] arr3b = {2};
      int [] result3 = {1, 2, 3};
      System.out.println("test3: " + Arrays.equals(cleanResult(merge(arr3a, arr3b)), result3));
      int [] arr4a = {2, 1, 3};
      int [] arr4b = {7, 8, 6, 4, 5};
      int [] result4 = {2, 7, 1, 8, 3, 6, 4, 5};
      System.out.println("test4: " + Arrays.equals(cleanResult(merge(arr4a, arr4b)), result4));
      int [] arr5a = {1, 2, 3, 3};
      int [] arr5b = {4};
      int [] result5 = {1, 4, 2, 3, 3};
      System.out.println("test5: " + Arrays.equals(cleanResult(merge(arr5a, arr5b)), result5));
      int [] arr6a = {};
      int [] arr6b = {1, 3};
      int [] result6 = {1, 3};
      System.out.println("test6: " + Arrays.equals(cleanResult(merge(arr6a, arr6b)), result6));

  }

}