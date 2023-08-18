public class largest{

    public static int findMax(int[] arr1, int[] arr2){
       int max = -99999999;
       if (arr1.length == 0 && arr2.length == 0) { //make sure that the list isn't empty
            max = 0;
        }
       for (int i = 0; i < arr1.length; i++) {
            if (max < arr1[i]) {
                max = arr1[i];
            }
       }
       for (int j = 0; j < arr2.length; j++) {
            if (max < arr2[j]) {
                max = arr2[j];
            }
       }
      return max;
    }
  
    public static void main(String[] args){
        int [] arr1a = {};
        int [] arr1b = {};
        System.out.println("test1: " + (findMax(arr1a, arr1b) == 0));
        int [] arr2a = {-99999};
        int [] arr2b = {};
        System.out.println("test2: " + (findMax(arr2a, arr2b) == -99999));
        int [] arr3a = {1, 3};
        int [] arr3b = {2};
        System.out.println("test3: " + (findMax(arr3a, arr3b) == 3));
        int [] arr4a = {2, 1, 3};
        int [] arr4b = {7, 8, 6, 4, 5};
        System.out.println("test4: " + (findMax(arr4a, arr4b) == 8));
        int [] arr5a = {1, 2, 3, 3};
        int [] arr5b = {4};
        System.out.println("test5: " + (findMax(arr5a, arr5b) == 4));
        int [] arr6a = {};
        int [] arr6b = {1, 3};
        System.out.println("test6: " + (findMax(arr6a, arr6b) == 3));
  
    }
  
  }
   