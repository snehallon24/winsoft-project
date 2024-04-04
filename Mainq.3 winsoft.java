import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String inputString = "Hello world! This is a sample string for word count.";
        HashMap<String, Integer> wordCountMap = countWords(inputString);
        System.out.println("Word count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + " : " + wordCountMap.get(word));
        }
    }

    public static HashMap<String, Integer> countWords(String input) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        // Split the input string into words
        String[] words = input.split("\\s+");
        
        // Count occurrences of each word
        for (String word : words) {
            // Remove any punctuation marks
            word = word.replaceAll("[^a-zA-Z0-9]", "");
            // Convert to lowercase to ensure case-insensitive comparison
            word = word.toLowerCase();
            
            // If the word is already in the map, increment its count
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // If the word is not in the map, add it with count 1
                wordCountMap.put(word, 1);
            }
        }
        return wordCountMap;
    }
}