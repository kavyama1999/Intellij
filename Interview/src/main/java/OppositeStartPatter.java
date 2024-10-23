public class OppositeStartPatter {


//    * * * *
//      * * *
//        * *
//          *

    public static void main(String args[]) {
        int n = 5;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col <row; col++) {
                System.out.print("  ");
            }


            for (int k = 0; k < n - row; k++) {

               // System.out.print("* ");
     // System.out.print(k + " ");
                System.out.print((n-row)+ " ");
               //System.out.print((n - col + " ");

            }
            System.out.println();
        }
    }
}


//***************
//  4 4 4 4
//     3 3 3
//     2 2
//       1
