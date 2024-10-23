import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionPrograms {

    public  static void main(String args[])
    {

//to add ay type od data we can use object..
    List<Object> data=new LinkedList<>();
        System.out.println("-----------Object");
    data.add("Kavya");
    data.add("Smithan");
    data.add(6);

    for(Object ref:data) //it will print one by one
    {
        System.out.println(ref);
    }

    System.out.println(data);

        System.out.println("--------Integer----------");
    List<Integer> val=new ArrayList<>();
    val.add(10);
    val.add(30);
    val.add(40);
    val.add(40);
    val.add(0);
    val.add(0);

    for(Integer d:val) //print like one be one element
    {
        System.out.println(d);
    }

        System.out.println(val); //print like array
        System.out.println(val.size());
        System.out.println(data.size());
        System.out.println(data.get(2));
        System.out.println(val.size());



        int s=val.size();
        System.out.println(s); //explicitly find the size

        System.out.println(val.remove(0));
        System.out.println(val.size());

        System.out.println("---Empty List-----");

        List<String>  emptyList=new ArrayList<>();
        System.out.println(emptyList);

        //List<String> emptyList = new ArrayList<>();


}
}



























//import java.util.LinkedList;
//import java.util.List;
//
//public class Example {
//    public static void main(String[] args) {
//        List<Object> data = new LinkedList<>();
//
//        // Adding primitive types (autoboxed to their wrapper classes)
//        data.add(42);             // int -> Integer
//        data.add(3.14);           // double -> Double
//        data.add('A');            // char -> Character
//        data.add(true);           // boolean -> Boolean
//
//        // Adding non-primitive types
//        data.add("Hello");        // String (a non-primitive, reference type)
//        data.add(new Example());  // Custom object of type Example
//
//        // Print the list contents
//        for (Object obj : data) {
//            System.out.println(obj);
//        }
//    }
//}
