public class NullPointerExample {


    public static void main(String[] args) {
        String myString = null;  // myString is initialized to null
        String data="Sathwik";

        // Trying to call a method on a null object
        try {
            System.out.println(data.length());

            System.out.println(myString.length()); // This will throw NullPointerException
     //  System.out.println(data.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
//  System.out.println("NullPointerException caught: You tried to call a method on a null object!");
        }

        finally {
            System.out.println("Program continues after handling the exception...");

        }
      //  System.out.println("Program continues after handling the exception.");
    }
}


