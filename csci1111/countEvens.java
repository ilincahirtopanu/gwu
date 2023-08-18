public class countEvens{

    public static int countEven(int[] original){
        int count = 0;
        for (int i = 0; i < original.length; i++){
            if (original[i] % 2 == 0){
                count++;
            }
        }
      return count;
    }
  
    public static void main(String[] args){
        int [] arr1 = {};
        System.out.println("test1: " + (countEven(arr1) == 0));
        int [] arr2 = {1};
        System.out.println("test2: " + (countEven(arr2) == 0));
        int [] arr3 = {5, 5};
        System.out.println("test3: " + (countEven(arr3) == 0));
        int [] arr4 = {5,5,6,4,8};
        System.out.println("test4: " + (countEven(arr4) == 3));
        int [] arr5 = {2,7,3,1,9,5,5,4,6,8};
        System.out.println("test5: " + (countEven(arr5) == 4));
        int [] arr6 = {3, 0};
        System.out.println("test6: " + (countEven(arr6) == 1));
  
    }
  
  }