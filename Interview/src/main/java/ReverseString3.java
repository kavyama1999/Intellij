public class ReverseString3 {


//    public  static  void main(String  args[]) {
//        String n = "god";
//        String reveerse = name(n);
//
//        System.out.println("Before :"+n);
//        System.out.println("After :"+reveerse);
//
//    }
//
//
//    public static  String name(String  h)
//    {
//        StringBuilder f=new StringBuilder(h);
//        return f.reverse().toString();
//
//    }


    public static  void main(String args[])
    {
        String flower="Rose";
        String reverse=new StringBuffer(flower).reverse().toString();

        System.out.println("Before :"+flower);
        System.out.println("After :"+reverse);


        System.out.println("----Append is used for adding string------");
        StringBuilder s=new StringBuilder("kavya");
        s.append(" Mruthyunjaya").append(" naveen");
        s.append(" gfgfh");
        System.out.println(s);


        System.out.println("---String Buffer-----");

        String  name="kavya";
        StringBuffer bf=new StringBuffer(name);

        bf.append(" jhjjhjh");
        bf.append(",").append("saroja").append(",");
       // bf.charAt(1);
        System.out.println(bf);
    }
}
