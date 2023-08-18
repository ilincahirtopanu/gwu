public class Dictionary {
    //variables
    private String[] words;
    private String[] definitions;
    private char[] pos;
    private int count = 0;

    public Dictionary() {
        words = new String[10];
        definitions = new String[10];
        pos = new char[10];
    }
    //setter methods
    public void setWords(String[] words) {
        this.words = words;
    }
    public void setDefinitions(String[] definitions) {
        this.definitions = definitions;
    }
    public void setPartsOfSpeech(char[] pos) {
        this.pos = pos;
    }

    / */
    
    //Getter Methods
    public String[] getWords() {
        return words;
    }

    public String[] getDefinitions() {
        return definitions;
    }

    public char[] getPartsOfSpeech() {
        return pos;
    }

    //
    
    //returns the elements of the dictionary
    public String toString() {
        String result = "";

        for (int i = 0; i < words.length; i++) {
            result += words[i] + "\t" + definitions[i] + "\t" + pos[i] + "\n";
        }
        return result;
    }

    public boolean addWord(String word, String def, char p) {
        if (count + 1 < words.length) {
            words[count] = word;
            definitions[count] = def;
            pos[count] = p;
            count++;
            return true;
        }
        return false;
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

        eng.addWord("apple", "a red fruit", "n");
        eng.addWord("apple", "a red fruit", "n");
        eng.addWord("apple", "a red fruit", "n");
        eng.addWord("apple", "a red fruit", "n");
        eng.addWord("apple", "a red fruit", "n");
        eng.addWord("apple", "a red fruit", "n");
    }
   