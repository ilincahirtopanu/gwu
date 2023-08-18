import java.util.Arrays;

import javax.swing.plaf.synth.SynthMenuUI;

import java.util.ArrayList;

public class Homework3{

	/*
	Complete the bodies of the main functions below. Note that

	To check your answers, compile this file with:
	javac Homework3.java

	and then run with:
	java Homework3

	This will score the problems you've attempted so far, and allow you to
	edit them to get them to pass all their test cases.

	Please turn on all the test case flags before submission to BB, and make sure your
	file and class is named Homework3

	*/

	/* Problem 1: ****************************************************************************/
	/*	Write a loop that returns the
			sum of all numbers that are within ten numbers of a seed
			number entered by the user (i.e. if the users enter 1, sum the numbers 1 through 9 inclusive).
	*/
	public static boolean test1 = true;

	public static int main1(int seed) {
		int sum = 0;
		for (int i = seed; i < seed + 9; i++) {
			sum += i;
		}

		// write the code below, and return the correct result
		return sum;
	}


	/* Problem 2: ****************************************************************************/
	/*	Write a loop that returns the
			sum of every other number that is within ten numbers of
			a seed number entered by the user (i.e. if the users enter 1, sum the numbers 1 through 9 inclusive).
	*/
	public static boolean test2 = true;

	public static int main2(int seed) {
		int sum = 0;
		for (int i = seed; i < seed + 9; i += 2) {
			sum += i;
		}

		// write the code below, and return the correct result
		return sum;
	}
	/* Problem 3: ****************************************************************************/
	/*	Write a loop that calculates the factorial of a seed number
			entered by the user.
	*/
	
	public static boolean test3 = true;

	public static int main3(int seed) {
		int factorial = 1;
		for (int i = seed; i >= 1; i--) {
			factorial *= i;
		}

		// write the code below, and return the correct result
		return factorial;
	}

	/* Problem 4: ****************************************************************************/
	/*	Write a loop that prints out the Fibonacci number entered by the user.

	*/
	public static boolean test4 = true;

	public static int main4(int seed) {
		int fibonacci = 0;
		int behind = 0; 
		int temp;
		for (int i = 0; i < seed; i++) {
			if (fibonacci == 0) {
				fibonacci++;
			} else {
				temp = fibonacci;
				fibonacci = fibonacci + behind;
				behind = temp;
			}
		}
		return fibonacci;
	}

	/* Problem 5: ****************************************************************************/
	/*	Write a loop that returns the sum of
			every natural number that is divisible by 7 and less than 30.
	*/
	public static boolean test5 = true;

	public static int main5() {
		int sum = 0;
		for (int i = 0; i < 30; i += 7) {
			sum += i;
		}
		return sum;
	}

	/* Problem 6: ****************************************************************************/
	/*	Write a loop that sums up all the factors of a natural number entered by the user.
	*/
	public static boolean test6 = true;

	public static int main6(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	/* Problem 7: ****************************************************************************/
	/*		Write a loop that visits every
				tile on a grid with a pre-stored width and height, and
				returns the sum of the tiles that are inside of a specific column
				entered by the user.
				Columns start at column 0.
	*/
	public static boolean test7 = true;

	public static int main7(int width, int height, int column) { //width = 4, height = 3, col = 1
		int tile = column + 1;
		int sum = 0;
		for (int i = 0; i < height; i++) {
			sum += tile;
			tile += width;
		}
		// write the code below, and return the correct result
		return sum;
	}

	/* Problem 8: ****************************************************************************/
	/*		Write code to find the minimum value of a list of integers entered by the user.
	*/
	public static boolean test8 = true;

	public static int main8(int[] list) {
		int min = 9999999;
		for (int i = 0; i < list.length; i++) {
			if (list[i] < min) {
				min = list[i];
			}
		}
		return min;
	}

	/* Problem 9: ****************************************************************************/
	/*		Write code to find the average (mean) value of a list of integers entered by the user.
	*/
	public static boolean test9 = true;

	public static double main9(int[] list) {
		double sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		double average = sum / list.length;
		return average;
	}

	/**************************************************************************************************************
	/*		HELPER CODE -- you can ignore this for now!
	/*************************************************************************************************************/

	public static boolean testChecker(String problem, String test, double result, ArrayList inputs, double expected) {
		double diff = result - expected;
		boolean passed = false;
		if (diff < 0.0001 && diff > -0.0001)
			passed = true;
		System.out.println(problem + ", " + test + ", did it pass? " + (passed));
		if (! passed) {
			System.out.print("\tOops! Check your " + problem + " for the inputs ");
			String formatInputs = "";
			for (int i = 0; i < inputs.size(); i++)
				formatInputs = formatInputs + inputs.get(i) + " and ";
			formatInputs = formatInputs.substring(0, formatInputs.length()) + " by plugging your " + problem 
				+ " into the visualizer for those inputs. We expected " + expected + " but your code returned " + result;
			System.out.println(formatInputs);
			return false;
		}
		return true;
	}

	/**************************************************************************************************************
	/*		TEST CASES -- see what the inputs and outputs were to your code
	/*************************************************************************************************************/
	public static void main(String[] args) {

		boolean completed = true;
		int score = 0;

		// Problem 1 test cases
		if (test1 == true) {
			completed = true;
			try {
				completed = testChecker("main1", "test1", main1(1), new ArrayList<Integer>(Arrays.asList(1)), 45) && completed;
			} catch (Exception exception) {
				completed = false; 
				System.out.println("Oops! Check your main1, test1, on inputs 1 -- it raised an exception.");
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
				completed = testChecker("main2", "test1", main2(1), new ArrayList<Integer>(Arrays.asList(1)), 25) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main2, test1, on inputs 1 -- it raised an exception.");
			}
			if (completed == true) {
				score++;
				System.out.println("Problem 2 finished, great work!");
			} else
				System.out.println("Check the errors above for Problem 2, and try again!");
		} else System.out.println("skipping test2");

		// Problem 3 test cases
		if (test3 == true) {
			completed = true;
			try {
				completed = testChecker("main3", "test1", main3(0), new ArrayList<Integer>(Arrays.asList(0)), 1) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main3, test1, on inputs 0 -- it raised an exception.");
			}
			try {
				completed = testChecker("main3", "test2", main3(2), new ArrayList<Integer>(Arrays.asList(2)), 2) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main3, test2, on inputs 2 -- it raised an exception.");
			}
			try {
				completed = testChecker("main3", "test3", main3(3), new ArrayList<Integer>(Arrays.asList(3)), 6) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main3, test3, on inputs 3 -- it raised an exception.");
			}
			try {
				completed = testChecker("main3", "test4", main3(1), new ArrayList<Integer>(Arrays.asList(1)), 1) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main3, test4, on inputs 1 -- it raised an exception.");
			}
			if (completed == true) {
				score++;
				System.out.println("Problem 3 finished, great work!");
			} else
				System.out.println("Check the errors above for Problem 3, and try again!");
		} else System.out.println("skipping test3");

		// Problem 4 test cases
		if (test4 == true) {
			completed = true;
			try {
				completed = testChecker("main4", "test1", main4(0), new ArrayList<Integer>(Arrays.asList(0)), 0) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main4, test1, on inputs 0 -- it raised an exception.");
			}
			try {
				completed = testChecker("main4", "test2", main4(1), new ArrayList<Integer>(Arrays.asList(1)), 1) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main4, test2, on inputs 1 -- it raised an exception.");
			}
			try {
				completed = testChecker("main4", "test3", main4(2), new ArrayList<Integer>(Arrays.asList(2)), 1) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main4, test3, on inputs 4 -- it raised an exception.");
			}
			try {
				completed = testChecker("main4", "test4", main4(4), new ArrayList<Integer>(Arrays.asList(4)), 3) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main4, test4, on inputs 2 -- it raised an exception.");
			}
			try {
				completed = testChecker("main4", "test4", main4(23), new ArrayList<Integer>(Arrays.asList(23)), 28657) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main4, test4, on inputs 23 -- it raised an exception.");
			}
			if (completed == true) {
				score++;
				System.out.println("Problem 4 finished, great work!");
			} else
				System.out.println("Check the errors above for Problem 4, and try again!");
		} else System.out.println("skipping test4");

		// Problem 5 test cases
		if (test5 == true) {
			completed = true;
			try {
				completed = testChecker("main5", "test1", main5(), new ArrayList<Integer>(Arrays.asList()), 70) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main5, test1 -- it raised an exception.");
			}
			if (completed == true) {
				score++;
				System.out.println("Problem 5 finished, great work!");
			} else
				System.out.println("Check the errors above for Problem 5, and try again!");
		} else System.out.println("skipping test5");

		// Problem 6 test cases
		if (test6 == true) {
			completed = true;
			try {
				completed = testChecker("main6", "test1", main6(1), new ArrayList<Integer>(Arrays.asList(1)), 1) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main6, test1, on inputs 0 -- it raised an exception.");
			}
			try {
				completed = testChecker("main6", "test2", main6(3), new ArrayList<Integer>(Arrays.asList(3)), 4) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main6, test2, on inputs 1 -- it raised an exception.");
			}
			try {
				completed = testChecker("main6", "test3", main6(4), new ArrayList<Integer>(Arrays.asList(4)), 7) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main6, test3, on inputs 4 -- it raised an exception.");
			}
			try {
				completed = testChecker("main6", "test4", main6(2), new ArrayList<Integer>(Arrays.asList(2)), 3) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main6, test4, on inputs 2 -- it raised an exception.");
			}
			if (completed == true) {
				score++;
				System.out.println("Problem 6 finished, great work!");
			} else
				System.out.println("Check the errors above for Problem 6, and try again!");
		} else System.out.println("skipping test6");

		// Problem 7 test cases
		if (test7 == true) {
			completed = true;
			try {
				completed = testChecker("main7", "test1", main7(4, 3, 0), new ArrayList<Integer>(Arrays.asList(4, 3, 0)), 15) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main7, test1, on inputs 4,3,0 -- it raised an exception.");
			}
			try {
				completed = testChecker("main7", "test2", main7(4, 3, 3), new ArrayList<Integer>(Arrays.asList(4, 3, 3)), 24) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main7, test2, on inputs 4,3,3 -- it raised an exception.");
			}
			try {
				completed = testChecker("main7", "test3", main7(4, 3, 1), new ArrayList<Integer>(Arrays.asList(4, 3, 1)), 18) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main7, test3, on inputs 4,3,1 -- it raised an exception.");
			}
			if (completed == true) {
				score++;
				System.out.println("Problem 7 finished, great work!");
			} else
				System.out.println("Check the errors above for Problem 7, and try again!");
		} else System.out.println("skipping test7");

		// Problem 8 test cases
		if (test8 == true) {
			completed = true;
			try {
				int[] arr = {1};
				completed = testChecker("main8", "test1", main8(arr), 
					new ArrayList<Integer>(Arrays.asList(1)), 1) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main8, test1, on inputs {1} -- it raised an exception.");
			}
			try {
				int[] arr = {1, 2}; 
				completed = testChecker("main8", "test2", main8(arr), 
					new ArrayList<Integer>(Arrays.asList(1, 2)), 1) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main8, test2, on inputs {1,2} -- it raised an exception.");
			}
			try {
				int[] arr = {2, 1}; 
				completed = testChecker("main8", "test3", main8(arr), 
					new ArrayList<Integer>(Arrays.asList(2, 1)), 1) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main8, test3, on inputs {2,1} -- it raised an exception.");
			}
			try {
				int[] arr = {1, 2, 3}; 
				completed = testChecker("main8", "test1", main8(arr),
				 new ArrayList<Integer>(Arrays.asList(1, 2, 3)), 1) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main8, test4, on inputs {1,2,3} -- it raised an exception.");
			}
			try {
				int[] arr = {2, 3, 1}; 
				completed = testChecker("main8", "test2", main8(arr), 
					new ArrayList<Integer>(Arrays.asList(2, 3, 1)), 1) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main8, test5, on inputs {2,3,1} -- it raised an exception.");
			}
			try {
				int[] arr = {-1, -2}; 
				completed = testChecker("main8", "test3", main8(arr), 
					new ArrayList<Integer>(Arrays.asList(-1, -2)), -2) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main8, test6, on inputs {-1,-2} -- it raised an exception.");
			}
			if (completed == true) {
				score++;
				System.out.println("Problem 8 finished, great work!");
			} else
				System.out.println("Check the errors above for Problem 8, and try again!");
		} else System.out.println("skipping test8");

		// Problem 9 test cases
		if (test9 == true) {
			completed = true;
			try {
				int[] arr = {1};
				completed = testChecker("main9", "test1", main9(arr), 
					new ArrayList<Integer>(Arrays.asList(1)), 1) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main9, test1, on inputs {1} -- it raised an exception.");
			}
			try {
				int[] arr = {1, 2}; 
				completed = testChecker("main9", "test2", main9(arr), 
					new ArrayList<Integer>(Arrays.asList(1, 2)), 1.5) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main9, test2, on inputs {1,2} -- it raised an exception.");
			}
			try {
				int[] arr = {2, 1}; 
				completed = testChecker("main9", "test3", main9(arr), 
					new ArrayList<Integer>(Arrays.asList(2, 1)), 1.5) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main9, test3, on inputs {2,1} -- it raised an exception.");
			}
			try {
				int[] arr = {1, 2, 3}; 
				completed = testChecker("main9", "test1", main9(arr), 
					new ArrayList<Integer>(Arrays.asList(1, 2, 3)), 2) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main9, test4, on inputs {1,2,3} -- it raised an exception.");
			}
			try {
				int[] arr = {2, 3, 1}; 
				completed = testChecker("main9", "test2", main9(arr), 
					new ArrayList<Integer>(Arrays.asList(2, 3, 1)), 2) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main9, test5, on inputs {2,3,1} -- it raised an exception.");
			}
			try {
				int[] arr = {-1, -2}; 
				completed = testChecker("main9", "test3", main9(arr), 
					new ArrayList<Integer>(Arrays.asList(-1, -2)), -1.5) && completed;
			} catch (Exception exception) {
				completed = false;
				System.out.println("Oops! Check your main9, test6, on inputs {-1,-2} -- it raised an exception.");
			}
			if (completed == true) {
				score++;
				System.out.println("Problem 9 finished, great work!");
			} else
				System.out.println("Check the errors above for Problem 9, and try again!");
		} else System.out.println("skipping test9");

		if (!(test1 == true && test2 == true && test3 == true && test4 == true && test5 == true
			&& test6 == true && test7 == true && test8 == true && test9 == true))
			System.out.println("Please set all test cases to true before submitting your file called Homework1.java to Blackboard.");

		//style checking
		System.out.println("\n***Next steps: perform style checking (you will be graded on it) by making sure that");
		System.out.println("\tcheckstyle-9.2.1-all.jar");
		System.out.println("\t\tand");
		System.out.println("\tCS1111_checks.xml");
		System.out.println("are in the current directory, and running the style checker with the following command:");
		System.out.println("\tjava -jar checkstyle-9.2.1-all.jar -c ./CS1111_checks.xml Homework3.java");

		//scoring
		System.out.println("\n***YOUR SCORE ON THIS ASSIGNMENT: ( " + score + " + [up to 4 points for style] ) out of 13 total***\n");


	}

}