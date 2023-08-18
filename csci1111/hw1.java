import java.util.Arrays;
import java.util.ArrayList;
import java.io.*;

public class hw1 {

	/*
	Complete the bodies of the main functions below. Note that

	To check your answers, compile this file with:
	javac Homework1.java

	and then run with:
	java Homework1

	This will score the problems you've attempted so far, and allow you to
	edit them to get them to pass all their test cases.

	*/

	/* Problem 0: ****************************************************************************/
	/*	Gets two numbers from the user, and
			returns the result of dividing the second number by the first. We promise
			never to test your code with a division by zero.

			Note: this code is broken, we will fix it together in class.

			Note: to test your solution to a problem, set the test flag to "true"
	*/
	public static boolean test0 = true;

	public static int main0(int num1, int num2) {

		// the first number, num1, is passed in above as an argument; you can
		// assume its value has been set.

		// assume num2 also already has its value set.

		// perform what the problem is asking
		int remainder = num2 / num1;

		// return the result, so it can be scored in the main
		// method at the bottom of this file -- you can look there to see
		// what test cases we use for this problem
		return remainder;
	}

	/* Problem 1: ****************************************************************************/
	/*	Gets two numbers from the user, and
			returns the remainder of dividing the second number by the first.
			Hint: the modulus operator, %, returns the remainder of a
			division. For example, 7 % 3 returns 1, because 7 divided by 3
			yields 6, and the remainder when we subtract 6 from 7 is 1.
	*/
	public static boolean test1 = true;

	public static int main1(int num1, int num2) {

		// write the code below, and return the correct result
		return num2 % num1;
	}


	/* Problem 2: ****************************************************************************/
	/*	Gets a one to three-digit integer from
			the user, and adds together all of its digits. For example, 123
			would return 6. Hint: remember you can use division!
	*/
	public static boolean test2 = true;

	public static int main2(int num1) {

		// write the code below, and return the correct result
        int dig1 = num1 / 100;
5	    int dig2 = ((num1%100)/10);
6	    int dig3 = ((num1%100)%10);
        int sum = dig1 + dig2 + dig3;
		return sum;
	}

	/* Problem 3: ****************************************************************************/
	/*	Determine if a number entered by the
			user is even. The program should return 1 if the number is odd,
			and 0 if the number is even. Hint: use modulus!
	*/
	public static boolean test3 = false;

	public static int main3(int num1) {

		// write the code below, and return the correct result
		return -9999999;
	}

	/* Problem 4: ****************************************************************************/
	/*	Imagine that we have a width by height grid, where
			the tiles are numbered starting at 1 in the top left corner.
			Return the row number of any tile passed into your program, withs rows
			starting at row 1.
			Hint: use integer division, which returns only a whole number
			and truncates any remainder. (For example, 7 / 5 returns 1,
			because 5 fits into 7 one time).
	*/
	public static boolean test4 = false;

	public static int main4(int width, int height, int tile) {

		// write the code below, and return the correct result
		return -9999999;
	}

	/* Problem 5: ****************************************************************************/
	/*	Imagine that we have a width by height grid, where
			the tiles are numbered starting at 1 in the top left corner.
			Return the column number of any tile passed into your program, withs columns
			starting at column 1.
			Hint: use modulus!
	*/
	public static boolean test5 = false;

	public static int main5(int width, int height, int tile) {

		// write the code below, and return the correct result
		return -9999999;
	}

	/**************************************************************************************************************
	/*		HELPER CODE -- you can ignore this for now!
	/*************************************************************************************************************/

	public static boolean testChecker(String problem, String test, int result, ArrayList inputs, int expected) {
		System.out.println(problem + ", " + test + ", did it pass? " + (result == expected));
		if (result != expected) {
			System.out.print("\tOops! Check your " + problem + " for the inputs ");
			String formatInputs = "";
			for (int i = 0; i < inputs.size(); i++) {
				formatInputs = formatInputs + inputs.get(i) + " and ";
			}
			formatInputs = formatInputs.substring(0, formatInputs.length() - 5) + " by plugging your " + problem
				+ " into the visualizer for those inputs. We expected " + expected + " but your code returned " + result;
			System.out.println(formatInputs);
			return false;
		}
		return true;
	}

	/**************************************************************************************************************
	/*		TEST CASES -- see what the inputs and outputs were to your code
	/*		
	/*		Do not change any of the lines below, otherwise you will not be able to recieve credit on this assignment
	/*************************************************************************************************************/
	public static void main(String[] args) {

		boolean completed = true;
		int score = 0;

		// Problem 0 test cases
		if (test0 == true) {
			completed = true;
			try {
				completed = testChecker("main0", "test1", main0(2, 6), new ArrayList<Integer>(Arrays.asList(2, 6)), 3) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main0, test1, on inputs 2 and 6 -- it raised an exception.");
			}
			try {
				completed = testChecker("main0", "test2", main0(2, 5), new ArrayList<Integer>(Arrays.asList(2, 5)), 2) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main0, test2, on inputs 2 and 5 -- it raised an exception.");
			}
			if (completed == true) {
				System.out.println("Problem 0 finished, great work!");
				score++;
			} else
				System.out.println("Check the errors above for Problem 0, and try again!");
		} else System.out.println("skipping test0");

		// Problem 1 test cases
		if (test1 == true) {
			completed = true;
			try {
				completed = testChecker("main1", "test1", main1(2, 6), new ArrayList<Integer>(Arrays.asList(2, 6)), 0) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main1, test1, on inputs 2 and 6 -- it raised an exception.");
			}
			try {
				completed = testChecker("main1", "test2", main1(2, 5), new ArrayList<Integer>(Arrays.asList(2, 5)), 1) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main1, test2, on inputs 2 and 5 -- it raised an exception.");
			}
			try {
				completed = testChecker("main1", "test3", main1(5, 2), new ArrayList<Integer>(Arrays.asList(5, 2)), 2) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main1, test3, on inputs 5 and 2 -- it raised an exception.");
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
				completed = testChecker("main2", "test1", main2(23), new ArrayList<Integer>(Arrays.asList(23)), 5) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main2, test1, on inputs 23 -- it raised an exception.");
			}
			try {
				completed = testChecker("main2", "test2", main2(203), new ArrayList<Integer>(Arrays.asList(203)), 5) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main1, test2, on inputs 2 and 5 -- it raised an exception.");
			}
			try {
				completed = testChecker("main2", "test3", main2(230), new ArrayList<Integer>(Arrays.asList(230)), 5) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main2, test3, on inputs 230 -- it raised an exception.");
			}
			try {
				completed = testChecker("main2", "test4", main2(0), new ArrayList<Integer>(Arrays.asList(0)), 0) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main2, test4, on inputs 0 -- it raised an exception.");
			}
			try {
				completed = testChecker("main2", "test5", main2(123), new ArrayList<Integer>(Arrays.asList(123)), 6) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main2, test5, on inputs 123 -- it raised an exception.");
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
			try {
				completed = testChecker("main3", "test1", main3(23), new ArrayList<Integer>(Arrays.asList(23)), 1) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main3, test1, on inputs 23 -- it raised an exception.");
			}
			try {
				completed = testChecker("main3", "test2", main3(22), new ArrayList<Integer>(Arrays.asList(22)), 0) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main3, test2, on inputs 22 -- it raised an exception.");
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
			int width = 1;
			int testCtr = 1;
			while (width <= 3) {
				int height = 1;
				while (height <= 3) {
					int tile = 1;
					while (tile <= width * height) {
						int result = main4(width, height, tile);
						int row = (tile - 1) / width + 1;
						try {
							completed = testChecker("main4", "test" + testCtr, main4(width, height, tile), 
								new ArrayList<Integer>(Arrays.asList(width, height, tile)), row) && completed;
						} catch (Exception exception) {
							System.out.println("Oops! Check your main4, test" + testCtr + ", on inputs " 
								+ Arrays.asList(width, height, tile) + " -- it raised an exception.");
						}
						tile++;
						testCtr++;
					}
					height++;
				}
				width++;
			}
			if (completed == true) {
				System.out.println("Problem 4 finished, great work!");
				score++;
			} else
				System.out.println("Check the errors above for Problem 4, and try again!");
		} else System.out.println("skipping test4");

		// Problem 5 test cases
		if (test5 == true) {
			completed = true;
			int width = 1;
			int testCtr = 1;
			while (width <= 3) {
				int height = 1;
				while (height <= 3) {
					int tile = 1;
					while (tile <= width * height) {
						int result = main4(width, height, tile);
						int col = (tile - 1) % width + 1;
						try {
							completed = testChecker("main5", "test" + testCtr, main5(width, height, tile), 
								new ArrayList<Integer>(Arrays.asList(width, height, tile)), col) && completed;
						} catch (Exception exception) {
							System.out.println("Oops! Check your main5, test" + testCtr + ", on inputs " 
								+ Arrays.asList(width, height, tile) + " -- it raised an exception.");
						}
						tile++;
						testCtr++;
					}
					height++;
				}
				width++;
			}
			if (completed == true) {
				System.out.println("Problem 5 finished, great work!");
				score++;
			} else
				System.out.println("Check the errors above for Problem 5, and try again!");
		} else System.out.println("skipping test5");

		if (!(test0 == true && test1 == true && test2 == true && test3 == true && test4 == true && test5 == true))
			System.out.println("Please set all test cases to true before submitting your file called Homework1.java to Blackboard.");

		//style checking
		System.out.println("\n***Next steps: perform style checking (you will be graded on it) by making sure that");
		System.out.println("\tcheckstyle-9.2.1-all.jar");
		System.out.println("\t\tand");
		System.out.println("\tCS1111_checks.xml");
		System.out.println("are in the current directory, and running the style checker with the following command:");
		System.out.println("\tjava -jar checkstyle-9.2.1-all.jar -c ./CS1111_checks.xml Homework1.java");

		//scoring
		System.out.println("\n***YOUR SCORE ON THIS ASSIGNMENT: ( " + score + " + [up to 4 points for style] ) out of 10 total***\n");

	}
}