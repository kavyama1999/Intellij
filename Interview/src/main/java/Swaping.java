public class Swaping {


    public static  void main(String args[])
    {

        int a=10,b=20;

        System.out.println("Before :a:"+a+", b:"+b);

        a=a+b; //10+20 :  a=30,
        b=a-b;  //30-20  : b=10,
        a=a-b; //30-10  ;  a=20,


        System.out.println("----After Swaping------");
        System.out.println("After : b:"+b+", a:"+a);
    }
}
