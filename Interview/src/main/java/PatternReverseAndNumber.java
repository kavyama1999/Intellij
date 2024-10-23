public class PatternReverseAndNumber {

    public static  void main(String args[])
    {

        int n=5;

        for(int row=n-1;row>=1;row--)
        {
            for(int col=1;col<=row;col++)
            {
               // System.out.print("* ");
                System.out.print(col + " ");
                //System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
