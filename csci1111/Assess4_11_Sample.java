import java.util.Arrays;

public class Assess4_11_Sample { //11
  public static boolean checkSorted(int[][] arr1) {
    int prev = 0;
    for(int row = 0; row < arr1.length; row++){
      for(int col = 0; col < arr1[row].length; col++){
        if(col == 0 && row == 0){
          prev = arr1[row][col];
        }
        if(prev > arr1[row][col]){
          return false;
        }
        prev = arr1[row][col];
      }
    }
    return true; 
  }

    public static void main(String[] args) {

        int[][] arr1 = { {} };
        boolean result1 = true;
        System.out.println("test1: " + (checkSorted(arr1) == result1));
        int[][] arr2 = { { 3 } };
        boolean result2 = true;
        System.out.println("test2: " + (checkSorted(arr2) == result2));
        int[][] arr3 = { { 1, 3 } };
        boolean result3 = true;
        System.out.println("test3: " + (checkSorted(arr3) == result3));
        int[][] arr4 = { { 3, 1 } };
        boolean result4 = false;
        System.out.println("test4: " + (checkSorted(arr4) == result4));
        int[][] arr5 = { { 2, 5, 11 } };
        boolean result5 = true;
        System.out.println("test5: " + (checkSorted(arr5) == result5));
        int[][] arr6 = { { 2, 11, 5 } };
        boolean result6 = false;
        System.out.println("test6: " + (checkSorted(arr6) == result6));
        int[][] arr7 = { { 5, 11, 2 } };
        boolean result7 = false;
        System.out.println("test7: " + (checkSorted(arr7) == result7));
        int[][] arr8 = { { 1, 2, 3 }, {} };
        boolean result8 = true;
        System.out.println("test8: " + (checkSorted(arr8) == result8));
        int[][] arr9 = { { 1, 2, 3 }, { 1 } };
        boolean result9 = false;
        System.out.println("test9: " + (checkSorted(arr9) == result9));
        int[][] arr10 = { { 1, 2, 3 }, { 5 } };
        boolean result10 = true;
        System.out.println("test10: " + (checkSorted(arr10) == result10));
        int[][] arr11 = { { 1, 2, 3 }, { 5, 8 } };
        boolean result11 = true;
        System.out.println("test11: " + (checkSorted(arr11) == result11));
        int[][] arr12 = { { 1, 2, 3 }, { 5, 4 } };
        boolean result12 = false;
        System.out.println("test12: " + (checkSorted(arr12) == result12));
        int[][] arr13 = { { 1, 2, 3 }, { 5, 6 }, { 8 } };
        boolean result13 = true;
        System.out.println("test13: " + (checkSorted(arr13) == result13));
        int[][] arr14 = { { 1, 2, 3 }, { 5, 6 }, { 5 } };
        boolean result14 = false;
        System.out.println("test14: " + (checkSorted(arr14) == result14));
        int[][] arr15 = { { 1, 2, 3 }, { 5, 6 }, { 7, 9, 8 } };
        boolean result15 = false;
        System.out.println("test15: " + (checkSorted(arr15) == result15));
    }

}