public class ReverseWordsInAString {

    public static void main(String[] args)
    {

        String  amma="Nanna Ammana hesaru Sharada";

        String[]  str=amma.split(" ");
//        System.out.println();

        System.out.println("-------------------------------------------");
        System.out.println(amma);
//        for(int i=0;i<str.length;i++)
//        {
//        //    System.out.println("Array ;"+str[i]);
//           // System.out.println(str[i]+" "); //it will print in same line
//
//
////            System.out.println("-------------------------------------------");
//            System.out.print(str[i] +" ");
//
//
//        }

        System.out.println(" ");
        System.out.println("---------------Reverse String---------------");
        for(int i=str.length-1;i>=0;i--)
        {
            System.out.print(str[i] + " ");
        }
    }
}
