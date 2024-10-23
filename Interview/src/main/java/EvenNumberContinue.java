public class EvenNumberContinue {



//    public  static  void main(String args[])
//    {
//        int numbers[]={1,2,3,4,5};
//         for(int i=0;i<numbers.length;i++)
//         {
//             if(numbers[i]%2==0)
//             {
//              // continue;
//                // System.out.println(numbers[i]+ "");
//
//             }
//             System.out.println(numbers[i]+ "");
//         }
//    }

    public  static  void main(String args[])
    {
        int num[]={1,2,3,4,5};
        {
            for(int i=0;i<num.length;i++)
            {
                if(num[i]%2==0) //i%==2 ...num[i]%2!=0 for add
                {
                    System.out.println(num[i]);
                }
            }
        }
    }
}
