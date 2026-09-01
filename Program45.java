///////////////////////////////////////////////////////////////////////////////////////////
// Program : Display a square pattern in which each row contains numbers from 1 to 5 in increasing order.
//
// Output : 1 2 3 4 5
//          1 2 3 4 5
//          1 2 3 4 5
//          1 2 3 4 5
//          1 2 3 4 5
//
// Date    : 01/09/2026
//
// Author  : Aditya Govind Valekar

////////////////////////////////////////////////////////////////////////////////////


public class Program45{

    public static void main(String Args[])
    {
       int irow , icol = 0;
       for(irow = 1; irow <= 5; irow++)
       {
            for(icol = 1; icol<=5;icol++)
            {
                System.out.print(icol+" ");
            }
            System.out.println();
       }
    }

}