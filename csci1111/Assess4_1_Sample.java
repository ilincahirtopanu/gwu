import java.util.Arrays;

public class Assess4_1_Sample{

  public static int countPairs(int[] arr){
    int current = 0;
    int tenCount = 0;
    for (int i = 0; i < arr.length; i++) {
        current = arr[i];
        for (int j = 0; j < arr.length; j++) {
            if (current + arr[j] == 10 && j != i) {
                tenCount++;
            }
        }
    }
    return tenCount;
  }

  public static void main(String[] args){

    int [] arr1 = {};
    System.out.println("test1: " + (countPairs(arr1) == 0));
    int [] arr2 = {1};
    System.out.println("test2: " + (countPairs(arr2) == 0));
    int [] arr3 = {1, 2};
    System.out.println("test3: " + (countPairs(arr3) == 0));
    int [] arr4 = {4, 6};
    System.out.println("test4: " + (countPairs(arr4) == 2));
    int [] arr5 = {1,2,3,4,6,7,8,9,10,0,-1,11,33};
    System.out.println("test5: " + (countPairs(arr5) == 12));
    int [] arr6 = {1,2,3,4,5,6,7,8,9,10,0,-1,11,33};
    System.out.println("test6: " + (countPairs(arr6) == 12));
  }

}