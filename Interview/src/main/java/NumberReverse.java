public class NumberReverse {

    public static  void main(String  args[])
    {
        String  str="12345";

        String  d[]=str.split("");
        System.out.println(str);
        System.out.println("---------Before----");
        //String  name=new StringBuilder(str).reverse().toString();


        for (int i=d.length-1;i>=0;i--)
        {
            System.out.print(d[i] + "");
        }
    }
}
