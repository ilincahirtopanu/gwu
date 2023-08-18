public class sum10{

    public static int sumCount(int[] original){
       int sum = 0;
       for (int i = 1; i < original.length; i++){
          if (original[i] + original[i - 1] == 10){
             if (original[i-1] == 10) {
                sum--;
             }
             sum++;
          }
       }
       
      return sum;
    }
  
    public static void main(String[] args){
        int [] arr1 = {};
        System.out.println("test1: " + (sumCount(arr1) == 0));
        int [] arr2 = {1};
        System.out.println("test2: " + (sumCount(arr2) == 0));
        int [] arr3 = {5, 5};
        System.out.println("test3: " + (sumCount(arr3) == 1));
        int [] arr4 = {5,5,6,4,8};
        System.out.println("test4: " + (sumCount(arr4) == 2));
        int [] arr5 = {2,7,3,1,9,5,5,4,6,8};
        System.out.println("test5: " + (sumCount(arr5) == 4));
        int [] arr6 = {10};
        System.out.println("test6: " + (sumCount(arr6) == 0));
  
    }
  
  }