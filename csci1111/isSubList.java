public class isSubList{
    // variable trueCount: count how many times in a row the list matches the sublistwith a for loop
    // if else statement for sub.ke

    public static boolean subList(int[] longer, int[] sub){
        int trueCount = 0;
        for (int i = 0; i < longer.length; i++){
            if(sub.length > 0){
                if (longer[i] == sub[0]){
                    for (int l = 0; l < sub.length; l++){
                        if (longer[i+l] == sub[l]){
                            trueCount++; //how many times in a row the list matches the subList
                        }
                        if (trueCount == sub.length) { 
                        return true;}
                    }
                }
            } else { // subList is an empty list
                return true;
            }
        }
        return false;
        }
    
  
    public static void main(String[] args){
        int [] arr1a = {1};
        int [] arr1b = {};
        System.out.println("test1: " + (subList(arr1a, arr1b) == true));
        int [] arr2a = {1, 2};
        int [] arr2b = {1};
        System.out.println("test2: " + (subList(arr2a, arr2b) == true));
        int [] arr3a = {1, 3};
        int [] arr3b = {3};
        System.out.println("test3: " + (subList(arr3a, arr3b) == true));
        int [] arr4a = {2, 1, 3};
        int [] arr4b = {1, 3};
        System.out.println("test4: " + (subList(arr4a, arr4b) == true));
        int [] arr5a = {1, 2, 3, 3};
        int [] arr5b = {1, 2};
        System.out.println("test5: " + (subList(arr5a, arr5b) == true));
        int [] arr6a = {7, 1, 2, 3, 2, 4, 1, 3};
        int [] arr6b = {3, 2, 4};
        System.out.println("test6: " + (subList(arr6a, arr6b) == true));
        int [] arr7a = {7, 1, 2, 3, 2, 4, 1, 3};
        int [] arr7b = {3, 2, 3};
        System.out.println("test7: " + (subList(arr7a, arr7b) == false));
    }
  
  }
   