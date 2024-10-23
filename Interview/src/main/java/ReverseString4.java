public class ReverseString4 {




    public static  void main(String args[])
    {
        String  str="hi kavya";

        String  name[]=str.split(" ");//convert string into string array

        System.out.println("---------Before---------");
        System.out.println(str);


        System.out.println("-----" +
                "After----");
        for(int i=name.length-1;i>=0;i--)
        {
            System.out.print(name[i] + " ");
        }
    }
    }

