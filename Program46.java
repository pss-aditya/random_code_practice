///////////////////////////////////////////////////////////////////////////////////////////
// Program : Display a square pattern in which each row contains numbers from 5 to 1 in decreasing order.
//
// Output : 5 4 3 2 1
//          5 4 3 2 1
//          5 4 3 2 1
//          5 4 3 2 1
//          5 4 3 2 1
//
// Date    : 01/09/2026
//
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////
public class Program46 {

    public static void main(String args[])
    {
        int irow , icol =0;
        for(irow = 1;irow<=5;irow++)
        {
            for(icol=5;icol>=1;icol--)
            {
                System.out.print(icol+" ");
            }
            System.out.println();
        }
    }
    
}
