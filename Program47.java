///////////////////////////////////////////////////////////////////////////////////////////
// Program : Display a square pattern in which each row contains the squares of numbers from 1 to 5.
//
// Output : 1 4 9 16 25
//          1 4 9 16 25
//          1 4 9 16 25
//          1 4 9 16 25
//          1 4 9 16 25
//
// Date    : 01/09/2026
//
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////


public class Program47 {

    public static void main(String args[])
    {
        int irow , icol =0;
        for(irow = 1;irow<=5;irow++)
        {
            for(icol=1;icol<=5;icol++)
            {
                System.out.print((icol)*(icol)+" ");
            }
            System.out.println();
        }
    }
    
}
