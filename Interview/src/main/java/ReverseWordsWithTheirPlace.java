public class ReverseWordsWithTheirPlace {
    public static void main(String[] args) {
        // Initialize the sentence at the time of initialization
        String input = "Hello World Java Program";

        System.out.println("Before : "+input);
        // Split the input sentence into words
        String[] words = input.split(" ");
        //System.out.println(words[]//);
        // Iterate through each word, reverse it and print it
        for (int i = 0; i < words.length; i++) {
            words[i] = reverseWord(words[i]);
            //System.out.print(words[i] " ");

        }

        // Join the reversed words back into a sentence
        String reversedSentence = String.join(" ", words);

        // Print the final reversed sentence
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    // Helper method to reverse a single word
    public static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder(word);
        return reversed.reverse().toString();
    }
}


//--------------
//import java.util.Scanner;
//
//public class ReverseWords {
//    public static void main(String[] args) {
//        // Create a Scanner object to get user input
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter a sentence
//        System.out.println("Enter a sentence: ");
//        String input = scanner.nextLine();
//
//        // Split the input sentence into words
//        String[] words = input.split(" ");
//
//        // Iterate through each word, reverse it and print it
//        for (int i = 0; i < words.length; i++) {
//            words[i] = reverseWord(words[i]);
//        }
//
//        // Join the reversed words back into a sentence
//        String reversedSentence = String.join(" ", words);
//
//        // Print the final reversed sentence
//        System.out.println("Reversed sentence: " + reversedSentence);
//
//        // Close the scanner
//        scanner.close();
//    }
//
//    // Helper method to reverse a single word
//    public static String reverseWord(String word) {
//        StringBuilder reversed = new StringBuilder(word);
//        return reversed.reverse().toString();
//    }
//}
