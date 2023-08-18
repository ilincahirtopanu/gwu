import java.util.Arrays;

public class same{

  public static boolean areEqual(int[] arr1, int[] arr2){
    boolean result = true;
    if (arr1.length != arr2.length){//if they aren't the same length they won't be the same
        result = false;
    } else {
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] != arr2[i]){
                result = false;
            }
        }
    }
    return result;
  }

  public static void main(String[] args){
      int [] arr1a = {};
      int [] arr1b = {};
      System.out.println("test1: " + (areEqual(arr1a, arr1b) == true));
      int [] arr2a = {1};
      int [] arr2b = {1};
      System.out.println("test2: " + (areEqual(arr2a, arr2b) == true));
      int [] arr3a = {1};
      int [] arr3b = {};
      System.out.println("test3: " + (areEqual(arr3a, arr3b) == false));
      int [] arr4a = {};
      int [] arr4b = {2};
      System.out.println("test4: " + (areEqual(arr4a, arr4b) == false));
      int [] arr5a = {1, 2};
      int [] arr5b = {1};
      System.out.println("test5: " + (areEqual(arr5a, arr5b) == false));
      int [] arr6a = {1};
      int [] arr6b = {1, 2};
      System.out.println("test6: " + (areEqual(arr6a, arr6b) == false));
      int [] arr7a = {1, 2};
      int [] arr7b = {1, 2};
      System.out.println("test7: " + (areEqual(arr7a, arr7b) == true));
      int [] arr8a = {1, 2, 3};
      int [] arr8b = {1, 3, 2};
      System.out.println("test8: " + (areEqual(arr8a, arr8b) == false));
      int [] arr9a = {1, 2, 3, 3, 1, 7};
      int [] arr9b = {1, 3, 2, 3, 1, 7, 7};
      System.out.println("test9: " + (areEqual(arr9a, arr9b) == false));
      int [] arr10a = {1, 2, 3, 3, 1, 7};
      int [] arr10b = {1, 2, 2, 3, 1, 7};
      System.out.println("test10: " + (areEqual(arr10a, arr10b) == false));
      int [] arr11a = {1, 2, 3, 3, 1, 7};
      int [] arr11b = {1, 2, 3, 3, 1, 7};
      System.out.println("test11: " + (areEqual(arr11a, arr11b) == true));
  }

}