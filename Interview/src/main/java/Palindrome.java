public class Palindrome {
    public static void main(String[] args) {
        String input = "Madam MadaM"; //it is case sensitive
String df=input.toUpperCase();
        // Checking if the string is a palindrome
        String reversed = new StringBuilder(df).reverse().toString();
        boolean isPalindrome = df.equals(reversed);

        // Printing the result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");

        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}




//public class Palindrome {
//    public static void main(String[] args) {
//        String input = "Madam"; // Case-sensitive input
//        String df = input.toLowerCase(); // Convert input to lowercase
//
//        // Checking if the string is a palindrome
//        String reversed = new StringBuilder(df).reverse().toString();
//        boolean isPalindrome = df.equals(reversed); // Compare in lowercase
//
//        // Printing the result
//        if (isPalindrome) {
//            System.out.println(input + " is a palindrome."); // Case insensitivity handled
//        } else {
//            System.out.println(input + " is not a palindrome.");
//        }
//    }
//}

























//public class Palindrome {
//    public static boolean isPalindrome(String str) {
//        String reversed = new StringBuilder(str).reverse().toString();
//        return str.equals(reversed);
//    }
//
//    public static void main(String[] args) {
//        String input = "madam";
//        if (isPalindrome(input)) {
//            System.out.println(input + " is a palindrome.");
//        } else {
//            System.out.println(input + " is not a palindrome.");
//        }
//    }
//}
