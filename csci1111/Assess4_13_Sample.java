import java.util.Arrays;

public class Assess4_13_Sample{ //13

  public static int[] keep(int[] arr1, int[] arr2){
    int [] result = new int[arr1.length];

    for( int i = 0; i < arr1.length; i ++){
        boolean b = true;
        for (int j = 0; j < arr2.length; j++){
            if(arr1[i] == arr2[j]){
                b = false;
            }
        }
        if (b == true){
            result[i] = arr1[i];
        }
    }

    return cleanResult(result);
  }

  public static int[] cleanResult(int[] array){
    return Arrays.stream(array).filter(num -> num != 0).toArray();    
  }

  public static void main(String[] args){

    int [] arr1a = {1};
    int [] arr1b = {0};
    int [] result1 = {1};
    System.out.println("test1: " + Arrays.equals(keep(arr1a, arr1b), result1));
    int [] arr2a = {1};
    int [] arr2b = {1};
    int [] result2 = {};
    System.out.println("test2: " + Arrays.equals(keep(arr2a, arr2b), result2));
    int [] arr3a = {};
    int [] arr3b = {1};
    int [] result3 = {};    
    System.out.println("test2: " + Arrays.equals(keep(arr3a, arr3b), result3));
    int [] arr4a = {1};
    int [] arr4b = {};
    int [] result4 = {1};
    System.out.println("test4: " + Arrays.equals(keep(arr4a, arr4b), result4));
    int [] arr5a = {1, 2, 1, 4, 5, 3, 7};
    int [] arr5b = {1, 3};
    int [] result5 = {2, 4, 5, 7};
    System.out.println("test4: " + Arrays.equals(keep(arr5a, arr5b), result5));
  }

}