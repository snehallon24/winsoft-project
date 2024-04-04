 import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "hello world";
        findDuplicateCharacters(str);
    }

    public static void findDuplicateCharacters(String str) {
        // Create a HashMap to store characters and their counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to character array
        char[] chars = str.toCharArray();

        // Iterate through each character in the array
        for (char ch : chars) {
            // If the character is already present in the map, increment its count
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                // Otherwise, add it to the map with count as 1
                charCountMap.put(ch, 1);
            }
        }

        // Iterate through the map to print the duplicate characters
        System.out.println("Duplicate characters in the string '" + str + "':");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}
