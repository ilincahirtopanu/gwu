public class addOdds{

    public static int addOdd(int[] original){
        int sum = 0;
        for (int i = 0; i < original.length; i++){
            if (original[i] % 2 == 1){
                sum += original[i];
            }
        }
      return sum;
    }
  
    public static void main(String[] args){
        int [] arr1 = {};
        System.out.println("test1: " + (addOdd(arr1) == 0));
        int [] arr2 = {1};
        System.out.println("test2: " + (addOdd(arr2) == 1));
        int [] arr3 = {1, 3};
        System.out.println("test3: " + (addOdd(arr3) == 4));
        int [] arr4 = {2, 1, 3, 4};
        System.out.println("test4: " + (addOdd(arr4) == 4));
        int [] arr5 = {2,1,3,4,5};
        System.out.println("test5: " + (addOdd(arr5) == 9));
        int [] arr6 = {2,1,3,4,5,1};
        System.out.println("test6: " + (addOdd(arr6) == 10));
  
    }
  
  }