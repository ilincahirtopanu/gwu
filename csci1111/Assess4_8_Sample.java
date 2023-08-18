import java.util.Arrays;

public class Assess4_8_Sample{ //8

  public static String[] allPairs(int[] arr){
    int n = arr.length;
    String[] result = new String[n*n - n];
    
    int j = 0;
    
    String pair;
    
    for (int r = 0; r < n; r++) {
        for (int c = 0; c < n; c++) { 
            if(r != c) {
                pair = arr[r] + "-" + arr[c];
                result[j] = pair;
                j++;
            }
        }
    }
    return result;
}

  public static void main(String[] args){

    int [] arr1 = {};
    String [] result1 = {};
    System.out.println("test1: " + Arrays.equals(allPairs(arr1), result1));
    int [] arr2 = {1};
    String [] result2 = {};
    System.out.println("test2: " + Arrays.equals(allPairs(arr2), result2));
    int [] arr3 = {1, 3};
    String [] result3 = {"1-3", "3-1"};
    System.out.println("test3: " + Arrays.equals(allPairs(arr3), result3));
    int [] arr4 = {4, 6, 1};
    String [] result4 = {"4-6", "4-1", "6-4", "6-1", "1-4", "1-6"};
    System.out.println("test4: " + Arrays.equals(allPairs(arr4), result4));
    int [] arr5 = {4, 6, 1, 2, 3};
    String [] result5 = {"4-6", "4-1", "4-2", "4-3", "6-4", "6-1", "6-2", "6-3", 
      "1-4", "1-6", "1-2", "1-3", "2-4", "2-6", "2-1", "2-3", "3-4", "3-6", "3-1", "3-2"};
    System.out.println("test5: " + Arrays.equals(allPairs(arr5), result5));
  }

}