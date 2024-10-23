import java.util.ArrayList;
import java.util.List;

public class CollectionRemove {

    public static  void main(String args[])
    {

        List<String> sa=new ArrayList<>();

sa.add("Kavya");
sa.add("Smithan");
sa.add("Naveen");
sa.add("Sathwik");

        System.out.println(sa);
sa.remove(1);
        System.out.println(sa);
        sa.remove(2);
        System.out.println(sa);

//        for(String s:sa)
//        {
//            System.out.println(s);
//            sa.add("ddd");
//            System.out.println(sa); //in for each method we can not add or remove it throw runtime  exception like
//                                  //ConcurrentModificationException
//        }


    for(String  d:sa)
    {
        System.out.println(d);
    }

    }

}
