//import java.util.HashMap;
//
//public class RepeatedWords {
//
//    public static void main(String[] args) {
//        String input = "kavya kavya hi here kavya hi";
//
//        System.out.println(input);
//        // Split the input string into words
//        String[] words = input.split(" ");
//
//        // Create a HashMap to store word counts
//        HashMap<String, Integer> wordCount = new HashMap<>();
//
//        // Use a traditional for loop to count occurrences
//        for (int i = 0; i < words.length; i++) {
//            String word = words[i].toLowerCase(); // Convert to lowercase to avoid case sensitivity
//            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
//        }
//
//        // Print repeated words
//        System.out.println("Repeated words in the string:");
//        for (String word : wordCount.keySet()) {
//            if (wordCount.get(word) > 1) {
//                System.out.println(word + ": " + wordCount.get(word) + " times");
//            }
//        }
//    }
//}


import java.util.HashMap;

public class RepeatedWords {

    public static void main(String[] args) {
        String input = "kavya kavya hi here kavya hi";

        // Split the input string into words
        String[] words = input.split(" ");

        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Use a traditional for loop to count occurrences
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase(); // Convert to lowercase to avoid case sensitivity
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print repeated words using traditional for loop
        System.out.println("Repeated words in the string:");
        Object[] keys = wordCount.keySet().toArray(); // Convert keySet to an array
        for (int i = 0; i < keys.length; i++) {
            String word = (String) keys[i]; // Cast to String
            if (wordCount.get(word) > 1) {
                System.out.println(word + ": " + wordCount.get(word) + " times");
            }
        }
    }
}

