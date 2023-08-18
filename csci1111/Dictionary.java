import java.util.Arrays;
import java.util.ArrayList;

public class Dictionary {
	//fields (things we want to store)
	private String[] words;
	private String[] definitions;
	private char[] pos;
	private int count;


	public Dictionary() {
		words = new String[10];
		definitions = new String[10];
		pos = new char[10];
	}

	public String toString() {
		String result = "";

		for (int i = 0; i < words.length; i++) {
			result += words[i] + "\t"  + definitions[i] + "\t" + pos[i] + "\n"; 
            }
		return result;
	}

	public String[] getWords() {
		return words;
	}

	public String[] getDefinitions() {
		return definitions;
	}

	public char[] getPartsOfSpeech() {
		return pos;
	}

	public void setWords(String[] words) {
		this.words = words;
	}

	public boolean addWord(String word, String def, char p) {
		if (count < words.length) {
			words[count] = word;
			definitions[count] = def;
			this.pos[count] = p;
			count++;
			return true;
		}
		return false;
	}

	public int findWord(String word, char p) {
		for (int i = 0; i < count; i++) {
			if (words[i].equals(word) && pos[i] == p) 
				return i;
		}
		return -1;
	}

	public String findWord(String word) {
		for (int i = 0; i < count; i++) {
			if (words[i].contains(word)) {
				return words[i];
			}
		}
		return null;
	}

	public static Dictionary[] makeDicts() {
		Dictionary eng = new Dictionary();
		Dictionary span = new Dictionary();

		eng.addWord("apple", "the round fruit of a tree of the rose family, which typically has thin red or green skin and crisp flesh", 'N');
		eng.addWord("banana", "a long curved fruit which grows in clusters and has soft pulpy flesh and yellow skin when ripe", 'N');
		eng.addWord("tree", "a woody perennial plant", 'N');
		eng.addWord("house", "a building for human habitation", 'N');
		eng.addWord("cat", "a small domesticated carnivorous mammal with soft fur, a short snout, and retractable claws", 'N');

		span.addWord("manzana", "a fruit from...", 'N');
		span.addWord("plátano", "a fruit from...", 'N');
		span.addWord("árbol", "a fruit from...", 'N');
		span.addWord("casa", "a fruit from...", 'N');
		span.addWord("gato", "a fruit from...", 'N');

		Dictionary[] twoDicts = {eng, span};
		return twoDicts;
        }

}