///////////////////////////////////////////////////////////////////////////////////////////
// Program : Display a square pattern containing consecutive numbers from 1 to 25 in row-wise order.
//
// Output : 1  2  3  4  5
//          6  7  8  9  10
//          11 12 13 14 15
//          16 17 18 19 20
//          21 22 23 23 25
//
// Date    : 01/09/2026
//
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Program50 {

    public static void main(String Args[])
    {
        int irow , icol = 0;
        int icounter = 1;
        
        for(irow = 1; irow<=5; irow++)
        {
            for(icol = 1; icol<=5; icol++)
            {
                System.out.print(icounter+" ");
                icounter++;
            }
            System.out.println();
        }
    }
    
}
