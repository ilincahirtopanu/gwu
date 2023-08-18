/*--------------------------------------------------------------------------
GWU CSCI 1112 Spring 2023
author: <your name>

This class encapsulates the logic to model scheduling a set of classes for a university
--------------------------------------------------------------------------*/

public class ClassSchedule {
    /// Performs a deep copy of the input schedule and returns the deep copy.
    /// This operation might be used to make a permanent backup of the data
    /// as it would make a unique and unlinked copy of the data.
    /// @param schedule the schedule array to copy
    /// @return the deep copy of the schedule array that were copied

    public static String[][] clone(String[][] schedule) {
        
        String[][] copy =  new String[schedule.length][];
        for (int i = 0; i < schedule.length; i++){
            copy[i]= new String [schedule[i].length];
            for(int j = 0; j < schedule[i].length; j++){
                copy[i][j] = schedule[i][j];
            }
        } 

        return copy;
    }
    
       


    /// A referential copy (shallow copy of each row) and not an 
    /// element-wise copy (deep copy).  We are sorting elements with respect
    /// to the original data rather than generating a new set of data.
    /// @param schedule data containing the rows to reference
    /// @return an array containing a shallow copy of the input schedule 
    ///         rows
    public static String[][] createView(String[][] schedule) {
        String[][] shallowCopy = new String[schedule.length][schedule[0].length];

	for (int i  = 0; i < schedule.length; i++) {
	    shallowCopy[i] = schedule[i];
	}
        return shallowCopy;
    }
    
    //--------------------------------------------------------------------- 
    /// This utility function converts a time string from the "HH:mm:ss" 
    /// format into a value representing minutes
    /// @param time a string representing a time in "HH"mm:ss" format
    /// @return an integer representing the time converted to minutes
    private static int duration(String time) {
        String[] tokens = time.split(":");
        int h = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);
        int t = h * 60 + m;
        return t;
    }

    //--------------------------------------------------------------------- 
    /// Compute the differential between start time (index 3) and end time 
    /// (index 4). The differential is not maintained in the data but is
    /// a virtual field derived by the calculation performed here
    /// @param classInfo a record from the scheduling data
    /// @return the difference in time between the end time and start time
    ///         in minutes
    public static int differential(String[] classInfo) {
	//change the format from time String to int value
        int startTime = duration(classInfo[3]);
	int endTime = duration(classInfo[4]);

	//calculate the duration
	int difference = endTime - startTime;

        return difference;
    }

    //--------------------------------------------------------------------- 
    /// Performs a comparison between two classes that is equivalent to a 
    /// less than operation so that a sort can use this function to order 
    /// classes. The less than criteria is an evaluation between the 
    /// differentials of two classes.
    /// @param class1 a class record that is used as the "left" operand for
    ///        a less than comparison 
    /// @param class2 a class record that is used as the "right" operand for
    ///        a less than comparison 
    /// @return returns true if the computed differential for class1 is less
    ///         than the computed differential for class2; otherwise, 
    ///         returns false (false implies that differential for class1 is
    ///         greater than or equal to class2)
    public static boolean lessThan(String[] class1, String[] class2) {
	//caluclating the differentials of each class
	int diff1 = differential(class1);
	int diff2 = differential(class2);

   	//if diff1 < diff2, the boolean will be true, so the function will return true
        return (diff1 < diff2);

    }
    //--------------------------------------------------------------------- 
    /// Swaps references to classes.  Note that this is a "shallow" swap and
    /// not a "deep" swap meaning we swap at a reference level (between rows
    /// in view) and not at the value level
    /// @param view A shallow copy of a set of classes 
    /// @param i the index of the first reference to swap
    /// @param j the index of the second reference to swap
    public static void swapClasses(String[][] view, int i, int j) {
	String[] temp = view[i];
	view[i] = view[j];
	view[j] = temp;
    }

    //--------------------------------------------------------------------- 
    /// Sorts (shallow) a set of references to classes in descending order 
    /// subject to the differential between ups and downs using selection 
    /// sort
    /// @param view A shallow copy of a set of classes 
    /// @return an array of profile information of 3 buckets with the 
    ///         respective buckets containing a count of 0: allocations, 
    ///         1:comparisons, and 2: swaps
    public static int[] sortSelection(String[][] view) {

        // profile[0:allocs (ignore profile), 1:comparisons, 2:swaps]
        int[] profile = new int[3];
	profile[0] = 3;
	    
	for (int i = 0; i < view.length - 1; i++) {
	   
	    String[] smallest = view[i];
	    int pos = i;
	    
	    //look for the smallest from i+1 and on
	    for (int j = i + 1; j < view.length; j++) {
		profile[1]++;
		if (lessThan(smallest, view[j])) {
			smallest = view[j];
			pos = j;
		    }
	    }

	    //swap view[i] and view[pos]
	    swapClasses(view, i, pos);
	    profile[2]++;
	}
		    
     

        return profile;
    }
    

    //--------------------------------------------------------------------- 
    /// Sorts (shallow) a set of references to classes in descending order 
    /// subject to the differential between ups and downs using bubble 
    /// sort
    /// @param view A shallow copy of a set of classes 
    /// @return an array of profile information of 3 buckets with the 
    ///         respective buckets containing a count of 0: allocations, 
    ///         1:comparisons, and 2: swaps
    public static int[] sortBubble(String[][] view) {

        // profile[0:allocs (ignore profile), 1:comparisons, 2:swaps]
        int[] profile = new int[3];

	//# of allocations
	profile[0] = 3;
	
	for (int i = 0; i < view.length - 1; i++) {
	    
	    for (int j = view.length - 1; j > i; j--) {
		
		//number of comparisons
		profile[1]++;
		//if the reference before is less than the current reference
		//swap them so that it's in descending order
		if (lessThan(view[j-1], view[j])) { 
		    //number of swaps
		    profile[2]++;
		    swapClasses(view, j, j-1);
		    }
	    }
	}
		    

        return profile;
    }

    //--------------------------------------------------------------------- 
    /// Sorts (shallow) a set of references to classes in descending order 
    /// subject to the differential between ups and downs using insertion 
    /// sort
    /// @param view A shallow copy of a set of classes 
    /// @return an array of profile information of 3 buckets with the 
    ///         respective buckets containing a count of 0: allocations, 
    ///         1:comparisons, and 2: swaps
    public static int[] sortInsertion(String[][] view) {

        // profile[0:allocs (ignore profile), 1:comparisons, 2:swaps]
        int[] profile = new int[3];
	profile[0] = 3;

	for (int i = 0; i < view.length; i++) {
	    for (int j = i; j > 0; j--) {
		//if the element before is less than the element after, swap them
		if (lessThan(view[j-1], view[j])) {
			profile[1]++;
			profile[2]++;
			swapClasses(view, j, j-1);
		    }
	    }
	}
			
	

        return profile;
    }

    //--------------------------------------------------------------------- 
    /// Sorts (shallow) a set of references to classes in descending order 
    /// subject to the differential between ups and downs using a quicksort.
    /// @param view A shallow copy of a set of classes 
    /// @return an array of profile information of 3 buckets with the 
    ///         respective buckets containing a count of 0: allocations, 
    ///         1:comparisons, and 2: swaps
    public static int[] sortQuicksort(String[][] view) {

        // profile[0:allocs (ignore profile), 1:comparisons, 2:swaps]
        int[] profile = new int[3];

        profile[0]++;

	quickSort(view, profile);

        return profile;
    }


    static void quickSort(String[][] view, int[] profile) {
        //implements the smallest part of the left side(0)
	//and the other end, which is view.length - 1
	quickSortRecursive(view, 0, view.length - 1, profile);
    }

    //this function uses the data and the group to the left to be the smallest
    // and the group to the right to be the biggest
    static void quickSortRecursive(String[][] view, int left, int right, int[] profile) {
	profile[0] += 4;

	//left is being compared to right
	profile[1]++;
	if (left < right) {

	    //allocating for partitionPos
	    profile[0]++;
	    //finds the index of the partition
	    int partitionPos = quickSortPartition(view, left, right, profile);

	    //call quicksort on the left side of the data
	    quickSortRecursive(view, left, partitionPos - 1, profile);

	    //call quicksort on right side of data
	    quickSortRecursive(view, partitionPos + 1, right, profile);
	}
    }

    //finds the partition of quickSort
    static int quickSortPartition(String[][] view, int left, int right, int[] profile) {
	//comparing left and right
	profile[1]++;
	//if they equal each other, there is only one variable
	if (left == right) {
	    return right;
	}

	//creating partition element
	profile[0]++;
	String[] partition = view[right];

	//index variable
	profile[0]++;
	int pos  = right;

	//for loop
	profile[0]++;
	//analyzes everything between left and right
	for (int i = right - 1; i >= left; i--) {
	    //comparing
	    profile[1]++;
	    if (lessThan(view[i], partition)){
		pos--;

		//swap the position of rightward
		swap(view, pos, i, profile);
	    }

	}

	//if if statement isn't true
	swap(view, pos, right, profile);

	//returns position after swap
	return pos;
    }

    //store the swaps made and return the new ones
    static void swap (String[][] view, int i, int j, int[] profile) {
	profile[2]++;
	String[] temp = view[i];
	view[i] = view[j];
	view[j] = temp;

    }
}
