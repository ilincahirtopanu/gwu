import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections; 


public class Driver {
	public static void main(String args[]) {
        ArrayList<Sentence> sentences = new ArrayList<Sentence>();
		try {
			FileInputStream fis = new FileInputStream(
                "/Users/ilincahirtopanu/Desktop/cs2022/testdata.manual.2009.06.14.csv");
			Scanner sc = new Scanner(fis); 
            String[] result = null;
            Sentence sentence = null;
			while (sc.hasNextLine()) {
			
                sentence = Sentence.convertLine(sc.nextLine());
                sentences.add(sentence);
                System.out.println(sentence);
                System.out.println(sentence.getSentiment());
                
            }
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        HashMap<String, Integer> words = printTopWords(sentences);
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : words.entrySet())
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
                maxEntry = entry;
        int maxValueLen = maxEntry.getValue().toString().length();
        ArrayList <String> results = new ArrayList<String>();
        for (Map.Entry set : words.entrySet()){
            String value = set.getValue().toString();
            while(value.length() < maxValueLen)
                value = " " + value;
            results.add(value + " of " + set.getKey());
        }
        Collections.sort(results);
        Collections.reverse(results);
        for (int i = 0; i < results.size() && i < 200; i++)
            System.out.println(results.get(i));
	}

    public static HashMap<String, Integer> printTopWords (ArrayList<Sentence> sentences){
        ArrayList<String> words = new ArrayList<String>();
        HashMap<String, Integer> topWords = new HashMap<>();
        for (int i = 0; i < sentences.size(); i++) {
            ArrayList<String> temp = (sentences.get(i).splitSentence());
            for (int j = 0; j < temp.size(); j++) {
                words.add(temp.get(j));
            }
        }
        for (int i = 0; i < words.size(); i++) {
            Integer integer = topWords.get(words.get(i));

            if (integer == null) {
                topWords.put(words.get(i), 1);
            }
            else {
                topWords.put(words.get(i), integer + 1);
            }

        }
        return topWords;
    }
}