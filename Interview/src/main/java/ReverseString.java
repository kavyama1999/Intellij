//
//
//public static  void main(String args[])
//{
//    String name="Smithan";
//    String  reverseString= Method.reverseString(name);
//
//    System.out.println("Name :"+name);
//    System.out.println("ReverseString Is:"+reverseString);
//}
//
//}

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ReverseString {

    public static void main(String args[])
//    {
//
//        String a="kavya";
//        String d[]=a.split("");
//
//        for(int i=d.length-1;i>=0;i--)
//        {
//            System.out.print(d[i]);
//        }
//
//    }

    {

        String str = "Smithan";
        System.out.println(str);
        String ref = new StringBuilder(str).reverse().toString();

        System.out.println(ref);
    }


}
