///////////////////////////////////////////////////////////////////////////////////////////
// Program : Display a square pattern of "*" having the given number of rows and columns.
// 
// Output:      * * * * *
//              * * * * *
//              * * * * *
//              * * * * *
//              * * * * *
// Date : 01/09/2026
//
// Author : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////


public class Program42
{
    public static void main(String Args[])
    {
    int iRow , iCol = 0;

    for(iRow = 1;iRow<=5;iRow++)
    {
        for(iCol = 1;iCol<=5;iCol++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}
}