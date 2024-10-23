public class Fibonacci {

    public static void main(String[] args) {

        // Number of terms in Fibonacci sequence
        int n = 4; // You can change this to generate more numbers
        int firstTerm = 2, secondTerm = 3;

        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            // Update first and second terms
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
