///////////////////////////////////////////////////////////////////////////////////////////

// Program : Display a square pattern in which each row contains the same number, increasing from 1 to 5.
//
// Output : 1 1 1 1 1
//          2 2 2 2 2
//          3 3 3 3 3
//          4 4 4 4 4
//          5 5 5 5 5
//
// Date    : 01/09/2026
//
// Author  : Aditya Govind Valekar

////////////////////////////////////////////////////////////////////////////////////

public class Program44{

    public static void main(String Args[])
    {
        int iRow , iCol = 0;

        for(iRow = 1; iRow <= 5; iRow ++)
        {
            for(iCol = 1; iCol <=5; iCol++)
            {
                System.out.print(iRow+" ");
            }
            System.out.println();
        }
    }

}