public class LoopString {


    public static  void main(String args[])
    {
        String  str="Kavya ka";
        System.out.println(str.length());

        String d[]=str.split(" ");

        System.out.println(str);
        for(int i=d.length-1;i>=0;i--)
        {
            System.out.print(d[i]+" ");
        }
    }
}
