import java.io.*;
import org.w3c.dom.Text;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map; 
import java.util.Collections;
import java.util.Properties;
import org.ejml.simple.SimpleMatrix;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.neural.rnn.RNNCoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations.SentimentAnnotatedTree;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.util.CoreMap;

public class Sentence {

	String text;
	String author;
	String timestamp;


    public int getSentiment(){
        Properties props = new Properties();
        props.setProperty("annotators", "tokenize, ssplit, pos, parse, sentiment");
        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
        Annotation annotation = pipeline.process(text);
        CoreMap sentence = annotation.get(CoreAnnotations.SentencesAnnotation.class).get(0);
        Tree tree = sentence.get(SentimentCoreAnnotations.SentimentAnnotatedTree.class);
        return RNNCoreAnnotations.getPredictedClass(tree);
    }



	public Sentence (String text, String author, String timestamp) {
		// a constructor that sets 3 attributes
        this.text = text;
		this.author = author;
		this.timestamp = timestamp;
	}
    public ArrayList<String> splitSentence() {
        ArrayList <String> words = new ArrayList<String>();
        text = text.toLowerCase();
        String[] stringSplit = text.split(" ");
            
        String[] stopwords = {"a", "-", " ", "\t", "about", "above", "after", "again", "against", "all", "am", "an", "and", "any", "are", "aren't", "as", "at", "be", "because", "been", "before", "being", "below", "between", "both", "but", "by", "can't", "cannot", "could", "couldn't", "did", "didn't", "do", "does", "doesn't", "doing", "don't", "down", "during", "each", "few", "for", "from", "further", "had", "hadn't", "has", "hasn't", "have", "haven't", "having", "he", "he'd", "he'll", "he's", "her", "here", "here's", "hers", "herself", "him", "himself", "his", "how", "how's", "i", "i'd", "i'll", "i'm", "i've", "if", "in", "into", "is", "isn't", "it", "it's", "its", "itself", "let's", "me", "more", "most", "mustn't", "my", "myself", "no", "nor", "not", "of", "off", "on", "once", "only", "or", "other", "ought", "our", "ours ourselves", "out", "over", "own", "same", "shan't", "she", "she'd", "she'll", "she's", "should", "shouldn't", "so", "some", "such", "than", "that", "that's", "the", "their", "theirs", "them", "themselves", "then", "there", "there's", "these", "they", "they'd", "they'll", "they're", "they've", "this", "those", "through", "to", "too", "under", "until", "up", "very", "was", "wasn't", "we", "we'd", "we'll", "we're", "we've", "were", "weren't", "what", "what's", "when", "when's", "where", "where's", "which", "while", "who", "who's", "whom", "why", "why's", "with", "won't", "would", "wouldn't", "you", "you'd", "you'll", "you're", "you've", "your", "yours", "yourself", "yourselves"};

        boolean swap = false;
        for(int i = 0; i < stringSplit.length; i++){  
            for(int j = 0; j < stopwords.length; j++){
                if(stopwords[j].equals(stringSplit[i])) {
                    swap = true;
                }
            }
            if(!swap){
                words.add(stringSplit[i]);
            }
            swap = false;
        }
        return words;
    }

    public static Sentence convertLine(String line) {
        String [] split = line.split("\",\"");
        String date = split[2];
        String author = split[split.length - 2];
        String tweet = split[split.length - 1];

        tweet = tweet.replaceAll("\"", "");
        tweet = tweet.replaceAll(",", "");
        tweet = tweet.replaceAll("\\.", "");
        tweet = tweet.replaceAll("!", "");

        String [] dateSplit = date.split(" ");
        String timestamp = dateSplit[1] + " " + dateSplit[2] + " " + dateSplit[5];
    
        return (new Sentence(tweet, author, timestamp));
        
    }


	public String getText() {
		return text;
	}

	public void setText(String newText) {
		this.text = newText;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String newTimestamp) {
		this.timestamp = newTimestamp;
	}

	public String toString() {
        return "{author:" + author + ", " + "sentence:" + "\"" + text + "\"" + ", " + "timestamp:" + "\"" + timestamp + "\"" + "}";
}

public void addToEnd(String s) {
    text += s;
}


}
