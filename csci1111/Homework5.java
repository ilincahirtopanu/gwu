import java.util.Arrays;
import java.util.ArrayList;

public class Homework5{

	/*
	Complete the bodies of the main functions below. Note that

	To check your answers, compile this file with:
	javac Homework5.java

	and then run with:
	java Homework5

	This will score the problems you've attempted so far, and allow you to
	edit them to get them to pass all their test cases.

	*/

	/* Problem 1: ****************************************************************************/
	/*	Write code that takes a string and a substring and counts how many times
			the substring appears in the string. Note that the String API has 
			substring(int, int), charAt(int), and length() methods you can use.

	*/
	/* Problem 1: ****************************************************************************/
	/*	Write code that takes a string and a substring and counts how many times
			the substring appears in the string. Note that the String API has 
			substring(int, int), charAt(int), and length() methods you can use.

	*/
	public static boolean test1 = true;

	public static int main1(String string, String sub) {

		// write the code below, and return the correct result
		int count = 0;
		for (int i = 0; i <= string.length() - sub.length(); i++) {
			if (string.substring(i, i + sub.length()).equals(sub)) {
				count++;
			}
		}
		return count;
	}


	/* Problem 2: ****************************************************************************/
	/* Imagine the user enters a string and a substring. Remove the
		second instance of the substring from the string and return the result. 
		Note that the String API has substring(int, int), charAt(int), and length() 
		methods you can use.

	*/
	public static boolean test2 = true;

	public static String main2(String string, String sub) {

		// write the code below, and return the correct result
		int subCount = 0;
		// for (int i = 0; i <= string.length(); i++) {
		// 	if (string.substring(i, i + sub.length()).equals(sub)) {
		// 		subCount++;
		// 	} if (subCount == 2) {
		// 		string = string.substring(0, i) + string.substring(i + sub.length());
		// 		return string;
		// 	}
		//}
		for (int i = 0; i <= string.length() - sub.length(); i++) {
			if (string.substring(i, i + sub.length()).equals(sub)) {
				subCount++;
			}
			if (subCount == 2) {
				string = string.substring(0, i) + string.substring(i + sub.length());
				return string;
			}
		}
		return string;
	}

	/* Problem 3: ****************************************************************************/
	/*	Imagine the user enters a string and a substring, and an index. Insert
		the substring in the string at the index and return the result.
		Note that the String API has substring(int, int), charAt(int), and length() 
		methods you can use.
	*/
	public static boolean test3 = true;

	public static String main3(String string, String sub, int index) {

		// write the code below, and return the correct result
		String result = "";
		if (index > string.length()) { //since sometimes index is greater than the length that the loop goes through
			result = string + sub;
		} else {
			for (int i = 0; i < string.length(); i++) {
				if (i == index) {
					result = result + sub;
				}
				result = result + string.charAt(i);
			}
		}
		return result;
	}

	/* Problem 4: ****************************************************************************/
	/*	Write code that reverses a string and returns the result. 
		Note that the String API has substring(int, int), charAt(int), and length() 
		methods you can use.

	*/
	public static boolean test4 = true;

	public static String main4(String string) {

		// write the code below, and return the correct result
		String result = "";
		for (int i = 0; i < string.length(); i++) {
			result = string.charAt(i) + result;
		}
		return result;
	}

	/* Problem 5: ****************************************************************************/
	/*	Write code that replaces every 'a' in a string with a substring and
		returns the result.
		Note that the String API has substring(int, int), charAt(int), and length() 
		methods you can use.

	*/
	public static boolean test5 = true;

	public static String main5(String string, String substring) {
		String result = "";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'a') {
				result += substring;
			} else {
				result += string.charAt(i);
			}
		}
		return result;
	}

	/* Problem 6: ****************************************************************************/
	/*	Imagine the user enters a string that is a real number. Return the sum of adding up 
		all of the digits of the string. For example, if the user entered "713", 
		your code would return 11.
		Note that the String API has substring(int, int), charAt(int), and length() 
		methods you can use.

	*/
	public static boolean test6 = true;

	public static int main6(String string) {

		// write the code below, and return the correct result
		int sum = 0;
		for (int i = 0; i < string.length(); i++) {
			Integer current = Integer.valueOf(string.substring(i, i + 1));
			sum += current;
		}
		return sum;
	}

	/* Problem 7: ****************************************************************************/
	/*	Imagine the user enters a string of characters. Return an integer that is the sum of all 
		the ASCII values of each character in the string. For example, if the string is "Hello", 
		your method would return 72 + 101 + 108 + 108 + 111 = 500. Hint: remember you can cast 
		a char to an int!
		Note that the String API has substring(int, int), charAt(int), and length() 
		methods you can use.

	*/
	public static boolean test7 = true;

	public static int main7(String string) {

		// write the code below, and return the correct result
		int result = 0;
		for (int i = 0; i < string.length(); i++) {
			result += string.charAt(i);
		}
		return result;
	}

	/* Problem 8: ****************************************************************************/
	/*	Imagine the user enters a string of characters representing a line of a spreadsheet. In this
		spreadsheet, each cell is a string with double quotes around it, and each cell on a line
		is separated by a comma. Return an array of all the strings on the line; you may assume
		that no more than 15 items might appear on a row.

		For example, if the input string was:

		"4","7","Mon May 11 03:21:41 UTC 2009","kindle2","yamarama","@mikefish Fair enough. But i have the Kindle2 and I think it's perfect :)"

		Your code would return:

		["4", "7", "Mon May 11 03:21:41 UTC 2009", "kindle2",
		"yamarama", "@mikefish Fair enough. But i have the Kindle2 and I think it's perfect :)"]

		Note that in the input string, the double quotes are a part of that input string itself; you
		will need to remove these when storing the pieces in your array. Hint: use the `split` method
		of the String class to split over the "," in the input string, not just the comma.

		Note that the String API has substring(int, int), charAt(int), and length() 
		methods you can use.

	*/
	public static boolean test8 = true;

	public static String[] main8(String string) {

		// write the code below, and return the correct result
		String[] result = string.split("\",");
		for (int i = 0; i < result.length; i++) {
			if (result[i].charAt(0) == '\"') {
				result[i] = result[i].substring(1, result[i].length());
			}
			if (result[i].charAt(result[i].length() - 1) == '\"') {
				result[i] = result[i].substring(0, result[i].length() - 1);
			}
		}
		return result;
	}

	/**************************************************************************************************************
	/*		HELPER CODE -- you can ignore this for now!
	/*************************************************************************************************************/

	public static boolean testChecker(String problem, String test, int result, String inputs, int expected) {
		System.out.println(problem + ", " + test + ", did it pass? " + (result == expected));
		if (result != expected) {
			System.out.print("\tOops! Check your " + problem + " for the inputs " + inputs);
			String formatInputs = " by plugging your " + problem 
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
				+ " into the visualizer for those inputs. We expected " 
				+ Arrays.toString(expected) + " but your code returned " + Arrays.toString(result);
			System.out.println(formatInputs);
			return false;
		}
		return true;
	}

	public static boolean testChecker(String problem, String test, String result, String inputs, String expected) {
		System.out.println(problem + ", " + test + ", did it pass? " + (result.equals(expected)));
		if (!result.equals(expected)) {
			System.out.print("\tOops! Check your " + problem + " for the inputs " + inputs);
			String formatInputs = " by plugging your " + problem 
				+ " into the visualizer for those inputs. We expected " 
				+ expected + " but your code returned " + result;
			System.out.println(formatInputs);
			return false;
		}
		return true;
	}

	public static boolean testChecker(String problem, String test, String[] result, String inputs, String[] expected) {
		System.out.println(problem + ", " + test + ", did it pass? " + (Arrays.equals(expected, result)));
		if (!Arrays.equals(expected, result)) {
			System.out.print("\tOops! Check your " + problem + " for the inputs " + inputs);
			String formatInputs = " by plugging your " + problem 
				+ " into the visualizer for those inputs. We expected " 
				+ expected + " but your code returned " + result;
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
				completed = testChecker("main1", "test1", main1("bird", "i"), "bird and i",	1) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main1, test1, on inputs bird and i -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				completed = testChecker("main1", "test2", main1("bird", "x"), "bird and x",	0) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main1, test2, on inputs bird and x -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				completed = testChecker("main1", "test3", main1("ibiridi", "i"), "ibiridi and i",	4) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main1, test3, on inputs ibiridi and i -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				completed = testChecker("main1", "test4", main1("iaebiaeriaediae", "iae"), "iaebiaeriaediae and iae",	4) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main1, test4, on inputs iaebiaeriaediae and iae -- it raised an exception.");
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
				completed = testChecker("main2", "test1", main2("bird", "i"), "bird and i",	"bird") && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main2, test1, on inputs bird and i -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				completed = testChecker("main2", "test2", main2("bird", "x"), "bird and x",	"bird") && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main2, test2, on inputs bird and x -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				completed = testChecker("main2", "test3", main2("ibiridi", "i"), "ibiridi and i",	"ibridi") && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main2, test3, on inputs ibiridi and i -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				completed = testChecker("main2", "test4", main2("kiaeb", "iae"), "kiaeb and iae",	"kiaeb") && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main2, test4, on inputs kiaeb and iae -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				completed = testChecker("main2", "test5", main2("kiaebiariaediaeia", "iae"), 
					"kiaebiariaediaeia and iae",	"kiaebiardiaeia") && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main2, test5, on inputs kiaebiariaediaeia and iae -- it raised an exception.");
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
				completed = testChecker("main3", "test1", main3("bird", "i", 0), "bird and i and 0",	"ibird") && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main3, test1, on inputs bird and i -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				completed = testChecker("main3", "test2", main3("bird", "x", 7), "bird and x and 7",	"birdx") && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main3, test2, on inputs bird and x -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				completed = testChecker("main3", "test3", main3("kiaeb", "iae", 2), "kiaeb and iae and 2",	"kiiaeaeb") && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main3, test3, on inputs ibiridi and i -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				completed = testChecker("main3", "test4", main3("kiaeb", "iae", 0), "kiaeb and iae and 0",	"iaekiaeb") && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main3, test4, on inputs kiaeb and iae -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				completed = testChecker("main3", "test5", main3("kiaeb", "iae", 10), "kiaeb and iae and 10",	"kiaebiae") && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main3, test5, on inputs kiaeb and iae and 10 -- it raised an exception.");
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
				completed = testChecker("main4", "test1", main4("b"), "b",	"b") && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main4, test1, on inputs b -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				completed = testChecker("main4", "test2", main4("bird"), "bird",	"drib") && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main4, test2, on inputs bird -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				completed = testChecker("main4", "test3", main4("birdbird"), "birdbird",	"dribdrib") && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main4, test3, on inputs birdbird -- it raised an exception.");
				exception.printStackTrace();
			}
			if (completed == true) {
				System.out.println("Problem 4 finished, great work!");
				score++;
			} else
				System.out.println("Check the errors above for Problem 4, and try again!");
		} else 
			System.out.println("skipping test1");

		// Problem 5 test cases
		if (test5 == true) {
			completed = true;
			try {
				completed = testChecker("main5", "test1", main5("bad", "cat"), "bad and cat",	"bcatd") && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main5, test1, on inputs bad and cat -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				completed = testChecker("main5", "test2", main5("bid", "catt"), "bid and catt",	"bid") && completed;	
			} catch (Exception exception) {
				System.out.println("Oops! Check your main5, test2, on inputs bid and catt -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				completed = testChecker("main5", "test3", main5("badapple", "catt"), "badapple and catt",	"bcattdcattpple") && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main5, test3, on inputs badapple and catt -- it raised an exception.");
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
				completed = testChecker("main6", "test1", main6("713"), "713",	11) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main6, test1, on input 713 -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				completed = testChecker("main6", "test2", main6("3"), "3",	3) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main6, test2, on input 3 -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				completed = testChecker("main6", "test3", main6("11"), "11",	2) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main6, test3, on input 11 -- it raised an exception.");
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
				completed = testChecker("main7", "test1", main7("Hello"), "Hello",	500) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main7, test1, on input Hello -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				completed = testChecker("main7", "test2", main7("hello"), "hello",	532) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main7, test2, on input hello -- it raised an exception.");
				exception.printStackTrace();
			}
			try {
				completed = testChecker("main7", "test3", main7("sunny day"), "sunny day",	923) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main7, test3, on input sunny day -- it raised an exception.");
				exception.printStackTrace();
			}
			if (completed == true) {
				System.out.println("Problem 7 finished, great work!");
				score++;
			} else
				System.out.println("Check the errors above for Problem 7, and try again!");
		} else 
			System.out.println("skipping test7");

		// Problem 8 test cases
		String line = "\"4\",\"3\",\"Mon May 11 03:17:40 UTC 2009\",\"kindle2\",\"tpryan\",\"@stellargirl I " 
			+ "loooooooovvvvvveee my Kindle2. Not that the DX is cool, but the 2 is fantastic in its own right.\"";
		String[] result = new String[6];
		result[0] = "4";
		result[1] = "3";
		result[2] = "Mon May 11 03:17:40 UTC 2009";
		result[3] = "kindle2";
		result[4] = "tpryan";
		result[5] = "@stellargirl I " 
			+ "loooooooovvvvvveee my Kindle2. Not that the DX is cool, but the 2 is fantastic in its own right.";

		if (test8 == true) {
			completed = true;
			try {
				completed = testChecker("main8", "test1", main8(line), "see line 423",	result) && completed;
			} catch (Exception exception) {
				System.out.println("Oops! Check your main8, test1, on input line 423 -- it raised an exception.");
				exception.printStackTrace();
			}

			if (completed == true) {
				System.out.println("Problem 8 finished, great work!");
				score++;
			} else
				System.out.println("Check the errors above for Problem 8, and try again!");
		} else 
			System.out.println("skipping test8");

		if (!(test1 == true && test2 == true && test3 == true && test4 == true
			&& test5 == true && test6 == true && test7 == true && test8 == true))
			System.out.println("Please set all test cases to true before submitting your "
			+ "file called Homework5.java to Blackboard.");

		//style checking
		System.out.println("\n***Next steps: perform style checking (you will be graded on it) by making sure that");
		System.out.println("\tcheckstyle-9.2.1-all.jar");
		System.out.println("\t\tand");
		System.out.println("\tCS1111_checks.xml");
		System.out.println("are in the current directory, and running the style checker with the following command:");
		System.out.println("\tjava -jar checkstyle-9.2.1-all.jar -c ./CS1111_checks.xml Homework5.java");

		//scoring
		System.out.println("\n***YOUR SCORE ON THIS ASSIGNMENT: ( " + score + " + [up to 4 points for style] ) out of 12 total***\n");
	}

}