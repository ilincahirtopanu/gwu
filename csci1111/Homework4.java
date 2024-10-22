
import java.util.Arrays;
import java.util.ArrayList;

public class Homework4{

	/*
	Complete the bodies of the main functions below. Note that

	To check your answers, compile this file with:
	javac Homework4.java

	and then run with:
	java Homework4

	This will score the problems you've attempted so far, and allow you to
	edit them to get them to pass all their test cases.

	*/

	/* Problem 1: ****************************************************************************/
	/*  Write code that returns true or
			false whether the number 42 is in a two dimensional list
			of integers (so each element of the list is another list)
			that the user supplies.

	*/
	public static boolean test1 = true;

	public static boolean main1(int[][] grid) {

		// write the code below, and return the correct result
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 42) {
					return true;
				}
			}
		}
		return false;
	}


	/* Problem 2: ****************************************************************************/
	/*  Write code that takes a non-empty list of
			integers from the user, as well as a width. Return a new list where
			the original list has been converted into a two dimensional list
			with the specified width, padded with zeroes at the end as needed.
	*/

	public static boolean test2 = true;

	public static int[][] main2(int[] oneDlist, int width) {

		// write the code below, and return the correct result
		//rows = arr.length/width
		int rows = oneDlist.length / width;	
		int [][] result = new int [rows + 1][width];
		int pos = 0;
		for (int i = 0; i < result.length; i++) { //row
			for (int j = 0; j < width; j++) { //col
				if (pos < oneDlist.length) {
					result[i][j] = oneDlist[pos];
					pos++;
				} else {
					result[i][j] = 0;
				}
			}
		}
		return result;
	}

	/* Problem 3: ****************************************************************************/
	/*  Recall the grids from previous chapters.
			Write code that gets a width and height from the user, and returns a
			two dimensional list, where each element is a string representation
			of the coordinates of that tile.
	*/
	public static boolean test3 = true;

	public static String[][] main3(int width, int height) {

		// write the code below, and return the correct result
		String [][] result = new String [height][width];

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = "(" + i + "," + j + ")";
			}
		}
		return result;
	}

	/* Problem 4: ****************************************************************************/
	/*  Write code that walks over a two dimensional
			list of integers, in order, and checks to see if a neighbor of an element
			(so to its right or left) is negative; if so, it returns a 2D list containing
			all pairs in parentheses of the (neighbor,current element)

	*/
	public static boolean test4 = true;
	
	public static int[][] main4(int[][] grid) {

		int [][] result = new int[6][2];
		int pos = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (j - 1 >= 0) {
					if (grid[i][j - 1 ] < 0) {
						result[pos][0] = grid[i][j - 1];
						resul[pos][1] = grid[i][j];
						pos++;
					}
				}
				if (j + 1 < grid[i].length) {
					if (grid[i][j + 1] < 0) {
						result[pos][0] = grid[i][j + 1];
						result[pos][1] = grid[i][j];
						pos++;
					}
				}
			}
		}
			
		return result;
	}


	/**************************************************************************************************************
	/*	HELPER CODE -- you can ignore this for now!
	/*************************************************************************************************************/

	public static boolean testChecker(String problem, String test, int result, String inputs, int expected) {
		System.out.println(problem + ", " + test + ", did it pass? " + (result == expected));
		if (result != expected) {
			System.out.print("\tOops! Check your " + problem + " for the inputs " + inputs);
			String formatInputs = "by plugging your " + problem 
				+ " into the visualizer for those inputs. We expected " + expected + " but your code returned " + result;
			System.out.println(formatInputs);
			return false;
		}
		return true;
	}

	public static boolean testChecker(String problem, String test, int[] result, String inputs, int[] expected) {
		System.out.println(problem + ", " + test + ", did it pass? " + (Arrays.equals(result, expected)));
		if (!Arrays.equals(result, expected)) {
			System.out.print("\tOops! Check your " + problem + " for the inputs " + inputs);
			String formatInputs = "by plugging your " + problem 
				+ " into the visualizer for those inputs. We expected " + Arrays.toString(expected) 
				+ " but your code returned " + Arrays.toString(result);
			System.out.println(formatInputs);
			return false;
		}
		return true;
	}

	public static boolean testChecker(String problem, String test, int[][] result, String inputs, int[][] expected) {
		System.out.println(problem + ", " + test + ", did it pass? " + (Arrays.deepEquals(result, expected)));
		if (!Arrays.deepEquals(result, expected)) {
			System.out.print("\tOops! Check your " + problem + " for the inputs " + inputs);
			String formatInputs = "by plugging your " + problem 
				+ " into the visualizer for those inputs. We expected " + Arrays.deepToString(expected) 
				+ " but your code returned " + Arrays.deepToString(result);
			System.out.println(formatInputs);
			return false;
		}
		return true;
	}

	public static boolean testChecker(String problem, String test, String[][] result, String inputs, String[][] expected) {
		System.out.println(problem + ", " + test + ", did it pass? " + (Arrays.deepEquals(result, expected)));
		if (!Arrays.deepEquals(result, expected)) {
			System.out.print("\tOops! Check your " + problem + " for the inputs " + inputs);
			String formatInputs = "by plugging your " + problem 
				+ " into the visualizer for those inputs. We expected " + Arrays.deepToString(expected) 
				+ " but your code returned " + Arrays.deepToString(result);
			System.out.println(formatInputs);
			return false;
		}
		return true;
	}

	public static boolean testChecker(String problem, String test, String result, String inputs, String expected) {
		System.out.println(problem + ", " + test + ", did it pass? " + (result.equals(expected)));
		if (!result.equals(expected)) {
			System.out.print("\tOops! Check your " + problem + " for the inputs " + inputs);
			String formatInputs = "by plugging your " + problem 
				+ " into the visualizer for those inputs. We expected " + expected + " but your code returned " 
				+ result;
			System.out.println(formatInputs);
			return false;
		}
		return true;
	}

	public static boolean testChecker(String problem, String test, boolean result, String inputs, boolean expected) {
		System.out.println(problem + ", " + test + ", did it pass? " + (result == expected));
		if (result != expected) {
			System.out.print("\tOops! Check your " + problem + " for the inputs " + inputs);
			String formatInputs = "by plugging your " + problem 
				+ " into the visualizer for those inputs. We expected " + expected + " but your code returned " 
				+ result;
			System.out.println(formatInputs);
			return false;
		}
		return true;
	}

	/**************************************************************************************************************
	/*	TEST CASES -- see what the inputs and outputs were to your code
	/*************************************************************************************************************/
	public static void main(String[] args) {

		boolean completed = true;
		int score = 0;

		// Problem 1 test cases
		if (test1 == true) {
			completed = true;
			try {
				int[][] arr = {{1, 3}, {7, 4, 9, 42, 6}, {5, 11, -3}};
				completed = testChecker("main1", "test1", main1(arr), "{{1,3},{7,4,9,42,6},{5,11,-3}}", true) && completed;
			} catch (Exception exception) {
				completed = false; 
				System.out.println("Oops! Check your main1, test1, on inputs {{1,3},{7,4,9,42,6},{5,11,-3}}" 
					+ " -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				int[][] arr = {{1, 3}, {7, 4, 9, 6}, {5, 11, -3}};
				completed = testChecker("main1", "test1", main1(arr), "{{1,3},{7,4,9,42,6},{5,11,-3}}", false) && completed;
			} catch (Exception exception) {
				completed = false; 
				System.out.println("Oops! Check your main1, test1, on inputs {{1,3},{7,4,9,6},{5,11,-3}}" 
					+ " -- it raised an exception.");
				exception.printStackTrace();
			}
			if (completed == true) {
				System.out.println("Problem 1 finished, great work!");
				score++;
			} else
				System.out.println("Check the errors above for Problem 1, and try again!");
		} else System.out.println("skipping test1");

		// Problem 2 test cases
		if (test2 == true) {
			completed = true;
			try {
				int[] arr = {3, 22, 5, 6, 7, 8, 9};
				int[][] result = {{3, 22, 5}, {6, 7, 8}, {9, 0, 0}};
				completed = testChecker("main2", "test1", main2(arr, 3), "{3,22,5,6,7,8,9} and 3", result) && completed;
			} catch (Exception exception) {
				completed = false; 
				System.out.println("Oops! Check your main2, test1, on inputs {3,22,5,6,7,8,9} and 3 " 
					+ "-- it raised an exception.");
				exception.printStackTrace();
			}
			if (completed == true) {
				System.out.println("Problem 2 finished, great work!");
				score++;
			} else
				System.out.println("Check the errors above for Problem 2, and try again!");
		} else System.out.println("skipping test2");

		// Problem 3 test cases
		if (test3 == true) {
			completed = true;
			int width = 3;
			int height = 4;
			int testCtr = 1;
			for (int w = 1; w <= width; w++) {
				for (int h = 1; h <= height; h++) {
					String[][] result = new String[h][w];
					for (int hInner = 0; hInner < h; hInner++) {
						for (int wInner = 0; wInner < w; wInner++) {
							result[hInner][wInner] = "(" + hInner + "," + wInner + ")";
						}
					}
					//System.out.println(Arrays.deepToString(result));
					try {
						completed = testChecker("main3", "test" + testCtr, main3(w, h), w + " " + h, result) && completed;
					} catch (Exception exception) {
						completed = false; 
						System.out.println("Oops! Check your main3, test" + testCtr + ", on inputs " + Arrays.asList(w, h) 
							+ " -- it raised an exception.");
						exception.printStackTrace();
					}
					testCtr++;
				}
			}

			if (completed == true) {
				System.out.println("Problem 3 finished, great work!");
				score++;
			} else
				System.out.println("Check the errors above for Problem 3, and try again!");
		} else System.out.println("skipping test3");	  
		

		// Problem 4 test cases
		if (test4 == true) {
			completed = true;
			try {
				int[][] arr = {{1, -2}, {}, {-1, -2, -3, 4}};
				int[][] result = {{-2, 1}, {-2, -1}, {-1, -2}, {-3, -2}, {-2, -3}, {-3, 4}};
				completed = testChecker("main4", "test1", main4(arr), Arrays.deepToString(arr), result) && completed;
			} catch (Exception exception) {
				completed = false; 
				System.out.println("Oops! Check your main4, test1, on inputs 0 -- it raised an exception.");
				exception.printStackTrace();
			}
			if (completed == true) {
				System.out.println("Problem 4 finished, great work!");
				score++;
			} else
				System.out.println("Check the errors above for Problem 4, and try again!");
		} else System.out.println("skipping test4");

		if (!(test1 == true && test2 == true && test3 == true && test4 == true))
			System.out.println("Please set all test cases to true before submitting your file called Homework4.java to Blackboard.");

		//style checking
		System.out.println("\n***Next steps: perform style checking (you will be graded on it) by making sure that");
		System.out.println("\tcheckstyle-9.2.1-all.jar");
		System.out.println("\t\tand");
		System.out.println("\tCS1111_checks.xml");
		System.out.println("are in the current directory, and running the style checker with the following command:");
		System.out.println("\tjava -jar checkstyle-9.2.1-all.jar -c ./CS1111_checks.xml Homework4.java");

		//scoring
		System.out.println("\n***YOUR SCORE ON THIS ASSIGNMENT: ( " + score + " + [up to 4 points for style] ) out of 8 total***\n");

	}

}
