import java.util.Arrays;
import Dictionary;

public class Homework7 {

	public static void main(String[] args) {

		char char1 = '\u0000';	// default value for char (an empty looking box)

		Dictionary dict1 = new Dictionary();
		String result = "null\tnull\t" + char1 + "\nnull\tnull\t" + char1 + "\nnull\tnull\t" + char1 + "\n" 
			+ "null\tnull\t" + char1 + "\nnull\tnull\t" + char1 + "\nnull\tnull\t" + char1 + "\nnull\tnull\t" + char1 + "\n" 
			+ "null\tnull\t" + char1 + "\nnull\tnull\t" + char1 + "\nnull\tnull\t" + char1 + "\n";
		System.out.println("test1: " + result.equals(dict1.toString()));

		dict1.addWord("word1", "definition1", 'V');
		result = "word1\tdefinition1\tV\nnull\tnull\t" + char1 + "\nnull\tnull\t" + char1 + "\n" 
			+ "null\tnull\t" + char1 + "\nnull\tnull\t" + char1 + "\nnull\tnull\t" + char1 + "\nnull\tnull\t" + char1 + "\n" 
			+ "null\tnull\t" + char1 + "\nnull\tnull\t" + char1 + "\nnull\tnull\t" + char1 + "\n";
		System.out.println("test2: " + result.equals(dict1.toString()));

		dict1.addWord("word2", "definition2", 'N');
		result = "word1\tdefinition1\tV\nword2\tdefinition2\tN\nnull\tnull\t" + char1 + "\n" 
			+ "null\tnull\t" + char1 + "\nnull\tnull\t" + char1 + "\nnull\tnull\t" + char1 + "\nnull\tnull\t" + char1 + "\n" 
			+ "null\tnull\t" + char1 + "\nnull\tnull\t" + char1 + "\nnull\tnull\t" + char1 + "\n";
		System.out.println("test3: " + result.equals(dict1.toString()));

		dict1.addWord("word3", "definition3", 'N');
		dict1.addWord("word4", "definition4", 'N');
		dict1.addWord("word4", "definition4", 'V');
		dict1.addWord("word6", "definition6", 'N');
		dict1.addWord("word7", "definition7", 'N');
		dict1.addWord("word8", "definition8", 'N');
		dict1.addWord("word9", "definition9", 'N');
		boolean allowed = dict1.addWord("word10", "definition10", 'N');
		System.out.println("test4: " + (allowed == true));

		allowed = dict1.addWord("word11", "definition11", 'N');
		System.out.println("test5: " + (allowed == false));

		int index = dict1.findWord("word4", 'N');
		System.out.println("test6: " + (index == 3));

		index = dict1.findWord("word4", 'V');
		System.out.println("test7: " + (index == 4));

		index = dict1.findWord("word11", 'N');
		System.out.println("test8: " + (index == -1));

		index = dict1.findWord("cat", 'N');
		System.out.println("test9: " + (index == -1));

		index = dict1.findWord("word7", 'S');
		System.out.println("test10: " + (index == -1));

		Dictionary[] resultArr = Dictionary.makeDicts();
		String[] englishWords = resultArr[0].getWords();
		String[] desiredEnglish = {"apple", "banana", "tree", "house", "cat", null, null, null, null, null};
		System.out.println("test11: " + Arrays.equals(englishWords, desiredEnglish));

		String[] spanishWords = resultArr[1].getWords();
		String[] desiredSpanish = {"manzana", "plátano", "árbol", "casa", "gato", null, null, null, null, null};
		System.out.println("test12: " + Arrays.equals(spanishWords, desiredSpanish));

		char[] desiredParts = {'N', 'N', 'N', 'N', 'N', char1, char1, char1, char1, char1};
		System.out.println("test13: " + Arrays.equals(resultArr[0].getPartsOfSpeech(), desiredParts));
		System.out.println("test14: " + Arrays.equals(resultArr[1].getPartsOfSpeech(), desiredParts));

	}

}