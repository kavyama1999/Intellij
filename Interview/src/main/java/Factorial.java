







public class Factorial {


    public static  void  main(String  args[])
    {

        int n=6;

        int factorial=2;


        for(int i=1;i<=n;i++)

        {
          factorial=factorial * i;
          //or we can write like this only
            //factorial *=i;


        }
        System.out.println("Factorail of "+n+ " is "+factorial);
    }
}












//import java.util.Scanner;
//
//public class Factorial {
//    public static void main(String[] args) {
//        // Create a Scanner object for input
//        Scanner scanner = new Scanner(System.in);
//
//        // Ask the user for a number
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//
//        // Call the method to calculate factorial
//        long result = factorial(number);
//
//        // Display the result
//        System.out.println("Factorial of " + number + " is: " + result);
//
//        // Close the scanner
//        scanner.close();
//    }
//
//    // Method to calculate factorial
//    public static long factorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        return n * factorial(n - 1);
//    }
//}
