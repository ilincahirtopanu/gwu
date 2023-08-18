import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Homework8 {

	/*
	 * Complete the bodies of the main functions below. Note that
	 * 
	 * To check your answers, compile this file with:
	 * javac Homework8.java
	 * 
	 * and then run with:
	 * java Homework8
	 * 
	 * This will score thexception.problems you've attempted so far, and allow you
	 * to
	 * edit them to get them to pass all their test cases.
	 * 
	 */

	/*
	 * Problem 1:
	 ****************************************************************************/
	/*
	 * Declare an empty ArrayList of Strings (using generics), and return it
	 * 
	 */
	public static boolean test1 = true;

	public static ArrayList<String> main1() {

		// write the code below, and return the correct result

		ArrayList<String> list = new ArrayList<String>();

		return list;
	}

	/*
	 * Problem 2:
	 ****************************************************************************/
	/*
	 * Declare an ArrayList of Strings (using generics), and add the strings "CS",
	 * "1111", "course"
	 * to it in that order, then return it
	 * 
	 */
	public static boolean test2 = true;

	public static ArrayList<String> main2() {

		// write the code below, and return the correct result

		ArrayList<String> list = new ArrayList<String>();

		list.add("CS");
		list.add("1111");
		list.add("course");
		return list;
	}

	/*
	 * Problem 3:
	 ****************************************************************************/
	/*
	 * Declare an ArrayList of Integers (using generics), and add the values 1, 2,
	 * and 3
	 * to it in that order, then return it
	 */
	public static boolean test3 = true;

	public static ArrayList<Integer> main3() {

		// write the code below, and return the correct result

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		return list;

	}

	/*
	 * Problem 4:
	 ****************************************************************************/
	/*
	 * Return the second element at index 1 of the incoming ArrayList of string, or
	 * return the empty string if it doesn't exist
	 * 
	 */
	public static boolean test4 = true;

	public static String main4(ArrayList<String> strings) {

		// write the code below, and return the correct result

		if (strings.size() == 1) {
			return "";
		}

		String elementAtIndex1 = strings.get(1);

		return elementAtIndex1;
	}

	/*
	 * Problem 5:
	 ****************************************************************************/
	/*
	 * Declare a HashMap object of Strings mapping to Integers (using generics), add
	 * the three name value pairs
	 * below to it, and return the result:
	 * 
	 * cat, 22
	 * dog, 13
	 * bird, 11
	 * 
	 */
	public static boolean test5 = true;

	public static HashMap<String, Integer> main5() {

		// write the code below, and return the correct result

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("cat", 22);
		map.put("dog", 13);
		map.put("bird", 11);

		return map;
	}

	/*
	 * Problem 6:
	 ****************************************************************************/
	/*
	 * Modify the incoming HashMap of Strings to Integers to put the specified key
	 * value
	 * pair into the object; overwrite the old value if the key exists, or add a new
	 * key-value
	 * pair if the key is not in the HashMap. This method is void.
	 * 
	 */
	public static boolean test6 = true;

	public static void main6(HashMap<String, Integer> mappings, String key, Integer value) {

		// write the code below
		mappings.put(key, value);
	}

	/*
	 * Problem 7:
	 ****************************************************************************/
	/*
	 * Complete the method below that takes a sentence and splits it up over the
	 * spaces in the
	 * sentence into an ArrayList of words. It should add to the ArrayList within
	 * the
	 * method.
	 * 
	 */
	public static boolean test7 = true;

	public static void main7(String sentence, ArrayList<String> words) {

		// write the code below

		String[] newSentence = sentence.split(" ");

		for (int i = 0; i < newSentence.length; i++) {
			String temp = newSentence[i];
			words.add(temp);
		}
	}

	/**************************************************************************************************************
	 * /* HELPER CODE -- you can ignore this for now!
	 * /
	 *************************************************************************************************************/

	public static boolean testChecker(String problem, String test, HashMap result, String inputs, HashMap expected) {
		System.out.println(problem + ", " + test + ", did it pass? " + (result.equals(expected)));
		if (!result.equals(expected)) {
			System.out.print("\tOops! Check your " + problem + " for the inputs " + inputs);
			String formatInputs = "by plugging your " + problem
					+ " into the visualizer for those inputs.";
			System.out.println(formatInputs);
			return false;
		}
		return true;
	}

	public static boolean testChecker(String problem, String test, ArrayList result, String inputs,
			ArrayList expected) {
		System.out.println(problem + ", " + test + ", did it pass? " + (result.equals(expected)));
		if (!result.equals(expected)) {
			System.out.print("\tOops! Check your " + problem + " for the inputs " + inputs);
			String formatInputs = "by plugging your " + problem
					+ " into the visualizer for those inputs.";
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
					+ " into the visualizer for those inputs.";
			System.out.println(formatInputs);
			return false;
		}
		return true;
	}

	/**************************************************************************************************************
	 * /* TEST CASES -- see what the inputs and outputs were to your code
	 * /
	 *************************************************************************************************************/
	public static void main(String[] args) {

		boolean completed = true;
		int score = 0;

		// Problem 1 test cases
		if (test1 == true) {
			completed = true;
			try {
				ArrayList<String> result = new ArrayList<String>();
				completed = testChecker("main1", "test1", main1(), "empty list", result) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main1, test1, on inputs empty list -- it raised an exception.");
				exception.printStackTrace();
			}
			if (completed == true) {
				System.out.println("Problem 1 finished, great work!");
				score++;
			} else
				System.out.println("Check the errors above for Problem 1, and try again!");
		} else
			System.out.println("skipping test1");

		// Problem 2 test cases
		if (test2 == true) {
			completed = true;
			try {
				ArrayList<String> result = new ArrayList<String>();
				result.add("CS");
				result.add("1111");
				result.add("course");
				completed = testChecker("main2", "test1", main2(), "as specified", result) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main2, test1, -- it raised an exception.");
				exception.printStackTrace();
			}
			if (completed == true) {
				System.out.println("Problem 2 finished, great work!");
				score++;
			} else
				System.out.println("Check the errors above for Problem 2, and try again!");
		} else
			System.out.println("skipping test2");

		// Problem 3 test cases
		if (test3 == true) {
			completed = true;
			try {
				ArrayList<Integer> result = new ArrayList<Integer>();
				result.add(1);
				result.add(2);
				result.add(3);
				completed = testChecker("main3", "test1", main3(), "as specified", result) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main3, test1, on inputs as specified -- it raised an exception.");
				exception.printStackTrace();
			}
			if (completed == true) {
				System.out.println("Problem 3 finished, great work!");
				score++;
			} else
				System.out.println("Check the errors above for Problem 3, and try again!");
		} else
			System.out.println("skipping test3");

		// Problem 4 test cases
		if (test4 == true) {
			completed = true;
			try {
				ArrayList<String> input1 = new ArrayList<String>();
				input1.add("CS");
				input1.add("1111");
				input1.add("course");
				completed = testChecker("main4", "test1", main4(input1), "[CS, 1111, course]", "1111") && completed;
			} catch (Exception exception) {
				System.out.println(
						"Oops! Check your main4, test1, on inputs [CS, 1111, course] -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				ArrayList<String> input1 = new ArrayList<String>();
				input1.add("CS");
				completed = testChecker("main4", "test2", main4(input1), "[CS]", "") && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main4, test2, on inputs [CS] -- it raised an exception.");
				exception.printStackTrace();
			}
			if (completed == true) {
				System.out.println("Problem 4 finished, great work!");
				score++;
			} else
				System.out.println("Check the errors above for Problem 4, and try again!");
		} else
			System.out.println("skipping test4");

		// Problem 5 test cases
		if (test5 == true) {
			completed = true;
			try {
				HashMap<String, Integer> map = new HashMap<String, Integer>();
				map.put("cat", 22);
				map.put("dog", 13);
				map.put("bird", 11);
				completed = testChecker("main5", "test1", main5(), "as specified", map) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main5, test1, on inputs as specified -- it raised an exception.");
				exception.printStackTrace();
			}
			if (completed == true) {
				System.out.println("Problem 5 finished, great work!");
				score++;
			} else
				System.out.println("Check the errors above for Problem 5, and try again!");
		} else
			System.out.println("skipping test5");

		// Problem 6 test cases
		if (test6 == true) {
			completed = true;
			try {
				HashMap<String, Integer> map = new HashMap<String, Integer>();
				map.put("cat", 22);
				map.put("dog", 13);
				map.put("bird", 11);
				HashMap<String, Integer> result = new HashMap<String, Integer>();
				result.put("cat", 22);
				result.put("dog", 13);
				result.put("bird", 11);
				result.put("snake", 12);

				main6(map, "snake", 12);
				completed = testChecker("main6", "test1", map, "on line 266-276 in this file", result) && completed;
			} catch (Exception exception) {
				System.out.println(
						"Oops! Check your main6, test1, on line 266-276 in this file -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				HashMap<String, Integer> map = new HashMap<String, Integer>();
				map.put("cat", 22);
				map.put("dog", 13);
				map.put("bird", 11);
				HashMap<String, Integer> result = new HashMap<String, Integer>();
				result.put("cat", 22);
				result.put("dog", 13);
				result.put("bird", 11);
				result.put("bird", 15);

				main6(map, "bird", 15);
				completed = testChecker("main6", "test2", map, "on line 283-293 in this file", result) && completed;
			} catch (Exception exception) {
				System.out.println(
						"Oops! Check your main6, test2, on line 283-293 in this file -- it raised an exception.");
				exception.printStackTrace();
			}
			if (completed == true) {
				System.out.println("Problem 6 finished, great work!");
				score++;
			} else
				System.out.println("Check the errors above for Problem 6, and try again!");
		} else
			System.out.println("skipping test6");

		// Problem 7 test cases
		if (test7 == true) {
			completed = true;
			try {
				ArrayList<String> expected = new ArrayList<String>();
				expected.add("Split");
				expected.add("this");
				expected.add("up");
				expected.add("please");
				expected.add("for");
				expected.add("me.");
				ArrayList<String> result = new ArrayList<String>();
				main7("Split this up please for me.", result);
				completed = testChecker("main7", "test1", result, "Split this up please for me.", expected)
						&& completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main7, test1, on inputs as specified -- it raised an exception.");
				exception.printStackTrace();
			}
			if (completed == true) {
				System.out.println("Problem 7 finished, great work!");
				score++;
			} else
				System.out.println("Check the errors above for Problem 7, and try again!");
		} else
			System.out.println("skipping test7");

		if (!(test1 == true && test2 == true && test3 == true && test4 == true
				&& test5 == true && test6 == true && test7 == true))
			System.out.println("Please set all test cases to true before submitting your "
					+ "file called Homework8.java to Blackboard.");

		// style checking
		System.out.println("\n***Next steps: perform style checking (you will be graded on it) by making sure that");
		System.out.println("\tcheckstyle-9.2.1-all.jar");
		System.out.println("\t\tand");
		System.out.println("\tCS1111_checks.xml");
		System.out.println("are in the current directory, and running the style checker with the following command:");
		System.out.println("\tjava -jar checkstyle-9.2.1-all.jar -c ./CS1111_checks.xml Homework8.java");

		// scoring
		System.out.println("\n***YOUR SCORE ON THIS ASSIGNMENT: ( " + score
				+ " + [up to 4 points for style] ) out of 10 total***\n");
	}

}